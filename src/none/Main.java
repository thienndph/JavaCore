package none;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    private static final int NUM_THREADS = 4; // Số lượng luồng
    private static final int MATRIX_SIZE = 1000; // Kích thước của ma trận

    private static int[][] matrixA = new int[MATRIX_SIZE][MATRIX_SIZE];
    private static int[][] matrixB = new int[MATRIX_SIZE][MATRIX_SIZE];
    private static int[][] resultMatrix = new int[MATRIX_SIZE][MATRIX_SIZE];
    private static final int LIMIT = 1000000; // Giới hạn
    private static final String[] URLS = {
            "https://example.com/page1",
            "https://example.com/page2",
            "https://example.com/page3",
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println(" Bài 1");
            System.out.println(" Bài 2");
            System.out.println(" Bài 3");
            System.out.println(" Bài 4");
            System.out.println(" Bài 5");
            System.out.println(" Bài 6");
            System.out.println(" Bài 7");
            System.out.print("Chọn một tùy chọn: ");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.println("Bài 1 được chọn.");
                    HelloWorldThread thread = new HelloWorldThread();

                    thread.start();
                    break;
                case "2":
                    System.out.println("Bài 2 được chọn.");
                    Thread evenThread = new Thread(new EvenRunnable());
                    evenThread.start();
                    try {
                        evenThread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Thread oddThread = new Thread(new OddRunnable());
                    oddThread.start();
                    try {
                        oddThread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case "3":
                    System.out.println("Bài 3 được chọn.");
                    sortArrayWithThreads();
                    break;
                case "4":
                    System.out.println("Bài 4 được chọn.");
                    multiplyMatrices();
                    break;
                case "5":
                    System.out.println("Bài 5 được chọn.");
                    calculatePrimeSum();
                    break;
                case "6":
                    System.out.println("Bài 6 được chọn.");
                    // Thực hiện hành động cho Bài 6
                    break;
                case "7":
                    System.out.println("Bài 7 được chọn.");
                    // Thực hiện hành động cho Bài 7
                    break;
            }
        }

        scanner.close();
    }


    private static void collectWebData() {
        // Khởi tạo ExecutorService với số luồng được chỉ định
        ExecutorService executor = Executors.newFixedThreadPool(URLS.length);

        // Danh sách để lưu dữ liệu từ các trang web
        List<String> webDataList = new ArrayList<>();

        // Thu thập dữ liệu từ mỗi trang web bằng các luồng
        for (String url : URLS) {
            executor.execute(() -> {
                try {
                    String webData = fetchDataFromURL(url);
                    synchronized (webDataList) {
                        webDataList.add(webData);
                    }
                } catch (IOException e) {
                    System.err.println("Không thể thu thập dữ liệu từ URL: " + url);
                    e.printStackTrace();
                }
            });
        }

        // Đóng ExecutorService sau khi tất cả các luồng đã hoàn thành công việc
        executor.shutdown();

        // Chờ tất cả các luồng hoàn thành
        while (!executor.isTerminated()) {
            // Chờ
        }

        // In ra dữ liệu thu thập được từ các trang web
        for (String data : webDataList) {
            System.out.println(data);
        }
    }

    // Phương thức để thu thập dữ liệu từ một URL cụ thể
    private static String fetchDataFromURL(String urlString) throws IOException {
        StringBuilder result = new StringBuilder();
        URL url = new URL(urlString);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line).append("\n");
            }
        }
        return result.toString();
    }



    private static void calculatePrimeSum() {
        // Khởi tạo ExecutorService với số luồng được chỉ định
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);

        // Chia công việc tính tổng thành các phần nhỏ và giao cho các luồng
        int chunkSize = LIMIT / NUM_THREADS;
        long totalSum = 0;
        for (int i = 0; i < NUM_THREADS; i++) {
            int start = i * chunkSize + 1;
            int end = (i == NUM_THREADS - 1) ? LIMIT : (i + 1) * chunkSize;
            executor.execute(new PrimeSumTask(start, end));
        }

        // Đóng ExecutorService sau khi tất cả các luồng đã hoàn thành công việc
        executor.shutdown();

        // Chờ tất cả các luồng hoàn thành
        while (!executor.isTerminated()) {
            // Chờ
        }

        // In ra tổng của tất cả các số nguyên tố
        System.out.println("Tổng của tất cả các số nguyên tố đến " + LIMIT + " là: " + PrimeSumTask.getTotalSum());
    }

    // Kiểm tra xem một số có phải là số nguyên tố hay không
    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Lớp thực hiện công việc tính tổng của các số nguyên tố trong một phần của phạm vi
    private static class PrimeSumTask implements Runnable {
        private final int start;
        private final int end;
        private static long totalSum = 0;

        public PrimeSumTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            long localSum = 0;
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    localSum += i;
                }
            }
            synchronized (PrimeSumTask.class) {
                totalSum += localSum;
            }
        }

        public static long getTotalSum() {
            return totalSum;
        }
    }


    private static void multiplyMatrices() {
        // Khởi tạo ma trận A và B với dữ liệu ngẫu nhiên
        initializeMatrices();

        // Khởi tạo ExecutorService với số luồng được chỉ định
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);

        // Chia công việc nhân ma trận thành các phần nhỏ và giao cho các luồng
        int chunkSize = MATRIX_SIZE / NUM_THREADS;
        for (int i = 0; i < NUM_THREADS; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i == NUM_THREADS - 1) ? MATRIX_SIZE : (i + 1) * chunkSize;
            executor.execute(new MatrixMultiplierTask(startIndex, endIndex));
        }

        // Đóng ExecutorService sau khi tất cả các luồng đã hoàn thành công việc
        executor.shutdown();

        // Chờ tất cả các luồng hoàn thành
        while (!executor.isTerminated()) {
            // Chờ
        }

        // In ra ma trận kết quả
        printResultMatrix();
    }

    // Khởi tạo ma trận A và B với dữ liệu ngẫu nhiên
    private static void initializeMatrices() {
        for (int i = 0; i < MATRIX_SIZE; i++) {
            for (int j = 0; j < MATRIX_SIZE; j++) {
                matrixA[i][j] = (int) (Math.random() * 10);
                matrixB[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    // In ra ma trận kết quả
    private static void printResultMatrix() {
        for (int i = 0; i < MATRIX_SIZE; i++) {
            for (int j = 0; j < MATRIX_SIZE; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Lớp thực hiện công việc nhân ma trận trong một phần của ma trận kết quả
    private static class MatrixMultiplierTask implements Runnable {
        private final int startIndex;
        private final int endIndex;

        public MatrixMultiplierTask(int startIndex, int endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public void run() {
            for (int i = startIndex; i < endIndex; i++) {
                for (int j = 0; j < MATRIX_SIZE; j++) {
                    for (int k = 0; k < MATRIX_SIZE; k++) {
                        resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }
        }
    }


    private static void sortArrayWithThreads() {
        int[] array = {38, 27, 43, 3, 9, 82, 10, 23, 45, 39, 8, 4, 15, 6};
        System.out.println("Unsorted Array: " + Arrays.toString(array));

        int numberOfThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);

        int chunkSize = (int) Math.ceil(array.length / (double) numberOfThreads);
        for (int i = 0; i < numberOfThreads; i++) {
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, array.length);
            if (start < end) {
                executor.execute(new Sorter(array, start, end));
            }
        }

        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mergeParts(array, chunkSize, numberOfThreads);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    private static void mergeParts(int[] array, int chunkSize, int numberOfParts) {
        int[] temp = new int[array.length];
        int[] indexes = new int[numberOfParts];

        for (int i = 0; i < numberOfParts; i++) {
            indexes[i] = i * chunkSize;
        }

        for (int i = 0; i < array.length; i++) {
            int minIndex = -1;
            int minValue = Integer.MAX_VALUE;

            for (int j = 0; j < numberOfParts; j++) {
                if (indexes[j] < (j + 1) * chunkSize && indexes[j] < array.length) {
                    if (array[indexes[j]] < minValue) {
                        minValue = array[indexes[j]];
                        minIndex = j;
                    }
                }
            }

            if (minIndex != -1) {
                temp[i] = array[indexes[minIndex]];
                indexes[minIndex]++;
            }
        }

        System.arraycopy(temp, 0, array, 0, array.length);
    }

}

package LamDa;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
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
            System.out.println(" Bài 8");
            System.out.println(" Bài 9");
            System.out.println(" Bài 10");
            System.out.println(" Bài 11");
            System.out.println(" Bài 12");
            System.out.println(" Bài 13");
            System.out.println(" Bài 14");
            System.out.println(" Bài 15");
            System.out.println(" Bài 16");
            System.out.println(" Bài 17");
            System.out.println(" Bài 18");
            System.out.println(" Bài 19");
            System.out.println(" Bài 20");
            System.out.println(" Bài 21");
            System.out.println(" Bài 22");
            System.out.println(" Bài 23");
            System.out.println(" Bài 24");
            System.out.println(" Bài 25");
            System.out.print("Chọn một tùy chọn: ");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.println("Bài 1 được chọn.");
                    // Sử dụng BiFunction để tạo biểu thức lambda tính tổng hai số nguyên
                    BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;

                    // Thử nghiệm lambda expression với một số ví dụ
                    int result1 = sum.apply(5, 10);
                    int result2 = sum.apply(15, 20);
                    int result3 = sum.apply(0, 0);

                    // In kết quả
                    System.out.println("Sum of 5 and 10: " + result1);
                    System.out.println("Sum of 15 and 20: " + result2);
                    System.out.println("Sum of 0 and 0: " + result3);
                    break;

                case "2":
                    System.out.println("Bài 2 được chọn.");
                    LambdaStringCheck();
                    break;
                case "3":
                    System.out.println("Bài 3 được chọn.");
                    List<String> strings = Arrays.asList("Hello", "World", "Java", "Lambda");

                    // Biểu thức lambda chuyển đổi chuỗi thành chữ hoa
                    Function<String, String> toUpperCase = str -> str.toUpperCase();
                    // Biểu thức lambda chuyển đổi chuỗi thành chữ thường
                    Function<String, String> toLowerCase = str -> str.toLowerCase();

                    // Chuyển đổi danh sách chuỗi thành chữ hoa
                    List<String> upperCaseStrings = strings.stream()
                            .map(toUpperCase)
                            .collect(Collectors.toList());

                    // Chuyển đổi danh sách chuỗi thành chữ thường
                    List<String> lowerCaseStrings = strings.stream()
                            .map(toLowerCase)
                            .collect(Collectors.toList());

                    // In kết quả
                    System.out.println("Chuỗi gốc: " + strings);
                    System.out.println("Chuỗi chữ hoa: " + upperCaseStrings);
                    System.out.println("Chuỗi chữ thường: " + lowerCaseStrings);
                    break;
                case "4":
                    System.out.println("Bài 4 được chọn.");
                    // Danh sách các số nguyên cần lọc
                    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

                    // Biểu thức lambda để kiểm tra số chẵn
                    Predicate<Integer> isEven = num -> num % 2 == 0;
                    // Biểu thức lambda để kiểm tra số lẻ
                    Predicate<Integer> isOdd = num -> num % 2 != 0;

                    // Lọc các số chẵn từ danh sách
                    List<Integer> evenNumbers = numbers.stream()
                            .filter(isEven)
                            .collect(Collectors.toList());

                    // Lọc các số lẻ từ danh sách
                    List<Integer> oddNumbers = numbers.stream()
                            .filter(isOdd)
                            .collect(Collectors.toList());

                    // In kết quả
                    System.out.println("Danh sách số nguyên: " + numbers);
                    System.out.println("Các số chẵn: " + evenNumbers);
                    System.out.println("Các số lẻ: " + oddNumbers);
                    break;
                case "5":
                    System.out.println("Bài 5 được chọn.");
                    List<String> strings5 = Arrays.asList("Banana", "Apple", "Cherry", "Mango", "Orange");

                    // Sắp xếp danh sách chuỗi theo thứ tự bảng chữ cái sử dụng biểu thức lambda
                    strings5.sort((s1, s2) -> s1.compareToIgnoreCase(s2));

                    // In kết quả
                    System.out.println("Danh sách sau khi sắp xếp: " + strings5);
                    break;
                case "6":
                    System.out.println("Bài 6 được chọn.");
                    // Danh sách các số kiểu Double cần tính giá trị trung bình
                    List<Double> numbers6 = Arrays.asList(1.5, 2.8, 3.6, 4.2, 5.9);

                    // Sử dụng Stream API và biểu thức lambda để tính giá trị trung bình
                    OptionalDouble average = numbers6.stream()
                            .mapToDouble(Double::doubleValue)
                            .average();

                    // In kết quả
                    if (average.isPresent()) {
                        System.out.println("Giá trị trung bình: " + average.getAsDouble());
                    } else {
                        System.out.println("Danh sách trống, không thể tính giá trị trung bình.");
                    }
                    break;
                case "7":
                    System.out.println("Bài 7 được chọn.");
                    // Danh sách các số nguyên có trùng lặp
                    List<Integer> numbers7 = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 8, 6, 9, 10, 10);

                    // Sử dụng Stream API và biểu thức lambda để loại bỏ các số trùng lặp
                    List<Integer> uniqueNumbers = numbers7.stream()
                            .distinct()
                            .collect(Collectors.toList());

                    // In kết quả
                    System.out.println("Danh sách ban đầu: " + numbers7);
                    System.out.println("Danh sách sau khi loại bỏ các số trùng lặp: " + uniqueNumbers);

                    break;
                case "8":
                    System.out.println("Bài 8 được chọn.");
                    // Biểu thức lambda để tính giai thừa của một số
                    Function<Integer, Integer> factorial = n -> {
                        if (n == 0) return 1;
                        int result = 1;
                        for (int i = 1; i <= n; i++) {
                            result *= i;
                        }
                        return result;
                    };

                    // Thử nghiệm biểu thức lambda với một số giá trị
                    int number = 5;
                    System.out.println("Giai thừa của " + number + " là " + factorial.apply(number));

                    number = 7;
                    System.out.println("Giai thừa của " + number + " là " + factorial.apply(number));

                    number = 10;
                    System.out.println("Giai thừa của " + number + " là " + factorial.apply(number));

                    break;
                case "9":
                    System.out.println("Bài 9 được chọn.");
                    // Biểu thức lambda để kiểm tra xem một số có phải là số nguyên tố hay không
                    Predicate<Integer> isPrime = n -> {
                        if (n <= 1) return false;
                        for (int i = 2; i <= Math.sqrt(n); i++) {
                            if (n % i == 0) return false;
                        }
                        return true;
                    };

                    // Thử nghiệm biểu thức lambda với một số giá trị
                    int number1 = 29;
                    int number2 = 15;
                    int number3 = 17;

                    System.out.println("Số " + number1 + " có phải là số nguyên tố không? " + isPrime.test(number1));
                    System.out.println("Số " + number2 + " có phải là số nguyên tố không? " + isPrime.test(number2));
                    System.out.println("Số " + number3 + " có phải là số nguyên tố không? " + isPrime.test(number3));

                    break;
                case "10":
                    System.out.println("Bài 10 được chọn.");
                    // Biểu thức lambda để nối hai chuỗi
                    BiFunction<String, String, String> concatStrings = (s1, s2) -> s1 + s2;

                    // Thử nghiệm biểu thức lambda với một số chuỗi
                    String str1 = "Hello, ";
                    String str2 = "World!";
                    String result = concatStrings.apply(str1, str2);

                    System.out.println("Kết quả sau khi nối: " + result);
                    break;
                case "11":
                    System.out.println("Bài 11 được chọn.");
                    // Tạo một danh sách các số nguyên
                    List<Integer> numbers11 = Arrays.asList(12, 15, 0, 8, 7, 9, -6);

                    // Tìm giá trị lớn nhất bằng biểu thức lambda
                    Optional<Integer> max = numbers11.stream()
                            .max((x, y) -> x.compareTo(y));

                    // Tìm giá trị nhỏ nhất bằng biểu thức lambda
                    Optional<Integer> min = numbers11.stream()
                            .min((x, y) -> x.compareTo(y));

                    // In ra giá trị lớn nhất và nhỏ nhất
                    System.out.println("Giá trị lớn nhất: " + max.orElse(null));
                    System.out.println("Giá trị nhỏ nhất: " + min.orElse(null));
                    break;
                case "12":
                    System.out.println("Bài 12 được chọn.");
                    // Tạo một danh sách các số nguyên
                    List<Integer> numbers12 = Arrays.asList(12, 15, 0, 8, 7, 9, -6);

                    // Tìm giá trị lớn nhất bằng biểu thức lambda
                    Optional<Integer> max12 = numbers12.stream()
                            .max((x, y) -> x.compareTo(y));

                    // Tìm giá trị nhỏ nhất bằng biểu thức lambda
                    Optional<Integer> min12 = numbers12.stream()
                            .min((x, y) -> x.compareTo(y));

                    // In ra giá trị lớn nhất và nhỏ nhất
                    System.out.println("Giá trị lớn nhất: " + max12.orElse(null));
                    System.out.println("Giá trị nhỏ nhất: " + min12.orElse(null));
                    break;
                case "13":
                    String sentence = "This is a sample sentence with some words.";

                    // Tạo biểu thức lambda để đếm số từ
                    WordCounter wordCounter = s -> s.split("\\s+").length;

                    // Gọi phương thức countWords với câu đã cho
                    int wordCount = wordCounter.countWords(sentence);

                    System.out.println("Số từ trong câu: " + wordCount);
                    break;
                case "14":
                    String colorCode = "#FFA500"; // Example color code

                    // Tạo biểu thức lambda để kiểm tra xem chuỗi có phải là một bảng màu hay không
                    ColorChecker colorChecker = s -> s.matches("^#[0-9A-Fa-f]{6}$");

                    // Kiểm tra chuỗi colorCode
                    boolean isColor = colorChecker.isColorCode(colorCode);

                    if (isColor) {
                        System.out.println(colorCode + " là một bảng màu hợp lệ.");
                    } else {
                        System.out.println(colorCode + " không phải là một bảng màu hợp lệ.");
                    }
                    break;

                case "15":
                    // Tạo một danh sách các số nguyên
                    List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

                    // Tính tổng bình phương của số lẻ
                    int sumOfSquaresOdd = numbers5.stream()
                            .filter(n -> n % 2 != 0)
                            .mapToInt(n -> n * n)
                            .sum();

                    // Tính tổng bình phương của số chẵn
                    int sumOfSquaresEven = numbers5.stream()
                            .filter(n -> n % 2 == 0)
                            .mapToInt(n -> n * n)
                            .sum();

                    System.out.println("Tổng bình phương của số lẻ: " + sumOfSquaresOdd);
                    System.out.println("Tổng bình phương của số chẵn: " + sumOfSquaresEven);
                    break;
                case "16":
// Tạo một danh sách các chuỗi
                    List<String> strings16 = Arrays.asList("apple", "banana", "cherry", "date", "grape");

                    // Từ cụ thể cần kiểm tra
                    String targetWord = "cherry";

                    // Tạo biểu thức lambda để kiểm tra xem danh sách có chứa từ cụ thể hay không
                    Predicate<String> containsTargetWord = s -> s.contains(targetWord);

                    // Kiểm tra danh sách
                    boolean containsWord = strings16.stream()
                            .anyMatch(containsTargetWord);

                    if (containsWord) {
                        System.out.println("Danh sách chứa từ '" + targetWord + "'.");
                    } else {
                        System.out.println("Danh sách không chứa từ '" + targetWord + "'.");
                    }
                    break;
                case "17":
                    // Tạo một danh sách các chuỗi
                    List<String> strings17 = Arrays.asList("apple", "banana", "cherry", "date", "grape");

                    // Tạo biểu thức lambda để tìm độ dài của chuỗi dài nhất
                    String longestString = strings17.stream()
                            .max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                            .orElse("");

                    // Tạo biểu thức lambda để tìm độ dài của chuỗi ngắn nhất
                    String shortestString = strings17.stream()
                            .min((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                            .orElse("");

                    System.out.println("Chuỗi dài nhất: " + longestString);
                    System.out.println("Chuỗi ngắn nhất: " + shortestString);
                    break;
                case "18":
                    int number18 = 25; // Example number

                    // Tạo biểu thức lambda để kiểm tra xem số có phải là số chính phương hay không
                    Predicate<Integer> isPerfectSquare = n -> {
                        int sqrt = (int) Math.sqrt(n);
                        return sqrt * sqrt == n;
                    };

                    // Kiểm tra số
                    boolean isSquare = isPerfectSquare.test(number18);

                    if (isSquare) {
                        System.out.println(number18 + " là một số chính phương.");
                    } else {
                        System.out.println(number18 + " không phải là một số chính phương.");
                    }
                    break;
                case "19":
                    // Tạo một mảng các số nguyên
                    int[] numbers19 = {12, 15, 0, 8, 7, 9, -6};

                    // Tìm phần tử lớn nhất thứ hai
                    int secondLargest = findSecondLargest(numbers19);

                    // Tìm phần tử nhỏ nhất thứ hai
                    int secondSmallest = findSecondSmallest(numbers19);

                    System.out.println("Phần tử lớn nhất thứ hai: " + secondLargest);
                    System.out.println("Phần tử nhỏ nhất thứ hai: " + secondSmallest);
                    break;
                case "20":
                    // Tạo danh sách các đối tượng Student
                    List<Student> studentList = new ArrayList<>();
                    studentList.add(new Student("Adriana Jamie", 15, "X"));
                    studentList.add(new Student("Felix Uisdean", 15, "X"));
                    studentList.add(new Student("Conceicao Palmira", 14, "X"));
                    studentList.add(new Student("Jair Camila", 14, "X"));
                    studentList.add(new Student("Micaela Rosana", 15, "X"));

                    // Sắp xếp danh sách theo tên học sinh
                    studentList.sort(Comparator.comparing(Student::getName));

                    // In ra danh sách đã sắp xếp
                    System.out.println("Danh sách học sinh theo tên:");
                    for (Student student : studentList) {
                        System.out.println(student.getName() + " - " + student.getAge() + " - " + student.getSClass());
                    }
                    break;
                case "21":
                    int start = 100;
                    int end = 200;

                    // Tính tổng của các số nguyên tố trong phạm vi
                    int sumOfPrimes = IntStream.rangeClosed(start, end)
                            .filter(Main::isPrime)
                            .sum();

                    System.out.println("Tổng của các số nguyên tố từ " + start + " đến " + end + ": " + sumOfPrimes);
                    break;
                case "22":
                    List<String> strings22 = Arrays.asList("JAVA", "java", "JaVa", "PYTHON", "abc");

                    // Kiểm tra danh sách
                    checkStringCase(strings22);
                    break;
                case "23":
                    // Tạo danh sách các chuỗi
                    List<String> strings23 = Arrays.asList("Java", "is", "fun", "and", "powerful");

                    // Tính độ dài trung bình của các chuỗi
                    double averageLength = calculateAverageLength(strings23);

                    System.out.println("Độ dài trung bình của các chuỗi: " + averageLength);
                    break;
                case "24":
                    int number24 = 123456; // Số cần tìm thừa số nguyên tố lớn nhất
                    int largestPrimeFactor = findLargestPrimeFactor(number24);
                    System.out.println("Thừa số nguyên tố lớn nhất của " + number24 + " là: " + largestPrimeFactor);
                    break;

                case "25":
                    int decimalNumber = 42; // Số nguyên cần chuyển đổi
                    String binaryRepresentation = convertToBinary(decimalNumber);
                    System.out.println("Biểu diễn nhị phân của " + decimalNumber + " là: " + binaryRepresentation);
                    break;


                case "exit":
                    exit = true;
                    System.out.println("Thoát chương trình.");
                    break;

            }
        }
    }


    public static String convertToBinary(int decimalNumber) {
        Function<Integer, String> toBinary = n -> Integer.toBinaryString(n);
        return toBinary.apply(decimalNumber);
    }

    public static int findLargestPrimeFactor(int number) {
        IntPredicate isPrime = n -> IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i -> n % i == 0);
        return IntStream.rangeClosed(2, number)
                .filter(factor -> number % factor == 0 && isPrime.test(factor))
                .max()
                .orElse(-1); // Trả về -1 nếu không tìm thấy thừa số nguyên tố
    }


    public static double calculateAverageLength(List<String> strings) {
        return strings.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0);
    }

    public static void checkStringCase(List<String> strings) {
        // Tạo biểu thức lambda để kiểm tra xem chuỗi có chứa toàn chữ hoa hay không
        Predicate<String> isAllUppercase = s -> s.equals(s.toUpperCase());

        // Tạo biểu thức lambda để kiểm tra xem chuỗi có chứa toàn chữ thường hay không
        Predicate<String> isAllLowercase = s -> s.equals(s.toLowerCase());

        // Kiểm tra từng chuỗi trong danh sách
        for (String s : strings) {
            if (isAllUppercase.test(s)) {
                System.out.println(s + " là chữ hoa.");
            } else if (isAllLowercase.test(s)) {
                System.out.println(s + " là toàn chữ thường.");
            } else {
                System.out.println(s + " là chữ hỗn hợp.");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Mảng phải có ít nhất 2 phần tử");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static int findSecondSmallest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Mảng phải có ít nhất 2 phần tử");
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        return secondSmallest;
    }


    private static void LambdaStringCheck() {
        Predicate<String> isEmpty = str -> str.isEmpty();

        // Thử nghiệm biểu thức lambda với một số ví dụ
        String testString1 = "";
        String testString2 = "Xin chào, thế giới!";
        String testString3 = " ";

        // Kiểm tra xem các chuỗi có trống không và in kết quả
        System.out.println("Chuỗi thứ nhất có trống không? " + isEmpty.test(testString1));
        System.out.println("Chuỗi thứ hai có trống không? " + isEmpty.test(testString2));
        System.out.println("Chuỗi thứ ba có trống không? " + isEmpty.test(testString3));
    }

    @FunctionalInterface
    interface WordCounter {
        int countWords(String sentence);
    }

    @FunctionalInterface
    interface ColorChecker {
        boolean isColorCode(String s);
    }

}
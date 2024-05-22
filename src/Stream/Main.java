package Stream;

    import java.util.Arrays;
    import java.util.List;
    import java.util.Scanner;
    import java.util.stream.Collectors;

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
                System.out.print("Chọn một tùy chọn: ");

                String option = scanner.nextLine();

                switch (option) {
                    case "1":
                        System.out.println("Bài 1 được chọn.");
                        // Ví dụ về danh sách các số nguyên
                        List<Integer> soNguyen = Arrays.asList(10, 20, 30, 40, 50);

                        // Tính trung bình cộng bằng cách sử dụng streams
                        double trungBinhCong = soNguyen.stream()
                                .mapToInt(Integer::intValue) // Chuyển đổi từ Integer sang int
                                .average()                   // Tính trung bình cộng
                                .orElse(0);                  // Giá trị mặc định nếu stream rỗng

                        // In kết quả
                        System.out.println("Trung bình cộng là: " + trungBinhCong);
                        break;
                    case "2":
                        System.out.println("Bài 2 được chọn.");
                        List<String> danhSachChuoi = Arrays.asList("hello", "world", "java", "streams");

                        // Chuyển đổi các chuỗi thành chữ hoa bằng cách sử dụng streams
                        List<String> chuoiChuHoa = danhSachChuoi.stream()
                                .map(String::toUpperCase) // Chuyển đổi thành chữ hoa
                                .collect(Collectors.toList()); // Thu thập kết quả vào danh sách mới

                        // In kết quả
                        System.out.println("Danh sách chuỗi chữ hoa: " + chuoiChuHoa);
                        List<String> chuoiChuThuong = danhSachChuoi.stream()
                                .map(String::toLowerCase) // Chuyển đổi thành chữ thường
                                .collect(Collectors.toList()); // Thu thập kết quả vào danh sách mới

                        // In kết quả
                        System.out.println("Danh sách chuỗi chữ thường: " + chuoiChuThuong);
                        break;
                    case "3":
                        System.out.println("Bài 3 được chọn.");
                        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

                        int sumEven = numbers.stream()
                                .filter(n -> n % 2 == 0)
                                .mapToInt(Integer::intValue)
                                .sum();

                        int sumOdd = numbers.stream()
                                .filter(n -> n % 2 != 0)
                                .mapToInt(Integer::intValue)
                                .sum();

                        System.out.println("Tổng số chẵn: " + sumEven);
                        System.out.println("Tổng số lẻ: " + sumOdd);
                        break;
                    case "4":
                        System.out.println("Bài 4 được chọn.");
                        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 8, 9, 10);

                        List<Integer> distinctNumbers = numbers4.stream()
                                .distinct()
                                .collect(Collectors.toList());

                        System.out.println("Danh sách sau khi loại bỏ các phần tử trùng lặp:");
                        System.out.println(distinctNumbers);
                        break;
                    case "5":
                        System.out.println("Bài 5 được chọn.");
                        List<String> strings = Arrays.asList("apple", "banana", "avocado", "grape", "cherry", "orange");

                        char specificLetter = 'a'; // Chữ cái cụ thể cần kiểm tra

                        long count = strings.stream()
                                .filter(s -> s.startsWith(String.valueOf(specificLetter)))
                                .count();

                        System.out.println("Số chuỗi bắt đầu bằng chữ cái '" + specificLetter + "': " + count);
                        break;
                    case "6":
                        System.out.println("Bài 6 được chọn.");
                        List<String> strings6 = Arrays.asList("banana", "apple", "grape", "cherry", "orange");

                        // Sắp xếp tăng dần
                        List<String> sortedAscending = strings6.stream()
                                .sorted()
                                .collect(Collectors.toList());

                        System.out.println("Danh sách sau khi sắp xếp tăng dần:");
                        System.out.println(sortedAscending);

                        // Sắp xếp giảm dần
                        List<String> sortedDescending = strings6.stream()
                                .sorted((s1, s2) -> s2.compareTo(s1))
                                .collect(Collectors.toList());

                        System.out.println("Danh sách sau khi sắp xếp giảm dần:");
                        System.out.println(sortedDescending);
                        break;
                    case "7":
                        System.out.println("Bài 7 được chọn.");
                        List<Integer> numbers7 = Arrays.asList(10, 5, 8, 3, 12, 7, 15, 20);

                        // Tìm giá trị lớn nhất
                        int max = numbers7.stream()
                                .mapToInt(Integer::intValue)
                                .max()
                                .orElse(-1); // Giá trị mặc định nếu danh sách rỗng

                        // Tìm giá trị nhỏ nhất
                        int min = numbers7.stream()
                                .mapToInt(Integer::intValue)
                                .min()
                                .orElse(-1); // Giá trị mặc định nếu danh sách rỗng

                        System.out.println("Giá trị lớn nhất: " + max);
                        System.out.println("Giá trị nhỏ nhất: " + min);
                        break;
                    case "8":
                        System.out.println("Bài 8 được chọn.");
                        // Thực hiện hành động cho Bài 8
                        break;
                    case "exit":
                        exit = true;
                        System.out.println("Thoát chương trình.");
                        break;


                }
            }
        }
    }

package TreeSet;

import java.util.Scanner;
import java.util.TreeSet;

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
            TreeSet<String> colorSet = new TreeSet<>();

            // Thêm màu vào tập hợp cây
            colorSet.add("Red");
            colorSet.add("Green");
            colorSet.add("Blue");
            colorSet.add("Yellow");

            TreeSet<Integer> numberSet = new TreeSet<>();
            numberSet.add(2);
            numberSet.add(5);
            numberSet.add(8);
            numberSet.add(10);
            numberSet.add(4);
            numberSet.add(6);
            numberSet.add(1);
            numberSet.add(9);

            switch (option) {
                case "1":
                    System.out.println("Bài 1 được chọn.");


                    System.out.println("Tập hợp cây màu:");
                    for (String color : colorSet) {
                        System.out.println(color);
                    }
                    break;
                case "2":
                    System.out.println("Bài 2 được chọn.");
                    System.out.println("Các phần tử trong tập hợp cây:");
                    for (String color : colorSet) {
                        System.out.println(color);
                    }
                    break;
                case "3":
                    System.out.println("Bài 3 được chọn.");
                    TreeSet<String> newSet = new TreeSet<>();

                    newSet.addAll(colorSet);

                    System.out.println("Tập hợp cây mới:");
                    for (String color : newSet) {
                        System.out.println(color);
                    }
                    break;
                case "4":
                    System.out.println("Bài 4 được chọn.");
                    TreeSet<String> reverseOrderSet = new TreeSet<>(colorSet.descendingSet());

                    System.out.println("Chế độ xem theo thứ tự đảo ngược của tập hợp cây:");
                    for (String color : reverseOrderSet) {
                        System.out.println(color);
                    }
                    break;
                case "5":
                    System.out.println("Bài 5 được chọn.");
                    String firstElement = colorSet.first();
                    String lastElement = colorSet.last();

                    System.out.println("Phần tử đầu tiên trong tập hợp cây: " + firstElement);
                    System.out.println("Phần tử cuối cùng trong tập hợp cây: " + lastElement);
                    break;
                case "6":
                    System.out.println("Bài 6 được chọn.");
                    TreeSet<String> copiedSet = new TreeSet<>(colorSet);

                    System.out.println("Tập hợp cây đã sao chép:");
                    for (String color : copiedSet) {
                        System.out.println(color);
                    }
                    break;
                case "7":
                    System.out.println("Bài 7 được chọn.");
                    int size = colorSet.size();

                    System.out.println("Số phần tử trong tập hợp cây: " + size);
                    break;
                case "8":
                    System.out.println("Bài 8 được chọn.");
                    TreeSet<String> set2 = new TreeSet<>();
                    set2.add("Red");
                    set2.add("Yellow");
                    set2.add("Blue");

                    boolean isEqual = colorSet.equals(set2);

                    if (isEqual) {
                        System.out.println("Hai tập hợp cây giống nhau.");
                    } else {
                        System.out.println("Hai tập hợp cây không giống nhau.");
                    }
                    break;
                case "9":
                    System.out.println("Bài 9 được chọn.");


                    System.out.println("Các số nhỏ hơn 7 trong tập hợp cây:");
                    for (Integer num : numberSet) {
                        if (num < 7) {
                            System.out.println(num);
                        }
                    }
                    break;
                case "10":
                    System.out.println("Bài 10 được chọn.");


                    int givenElement = 7;

                    Integer result = numberSet.ceiling(givenElement);

                    System.out.println("Phần tử trong tập hợp cây lớn hơn hoặc bằng " + givenElement + " là: " + result);
                    break;
                case "11":
                    System.out.println("Bài 11 được chọn.");
                    int givenElement11 = 7;

                    Integer result11 = numberSet.floor(givenElement11);

                    System.out.println("Phần tử trong tập hợp cây nhỏ hơn hoặc bằng " + givenElement11 + " là: " + result11);
                    break;
                case "12":
                    System.out.println("Bài 12 được chọn.");
                    int givenElement12 = 7;

                    Integer result12 = numberSet.ceiling(givenElement12);

                    if (result12 != null) {
                        System.out.println("Phần tử trong tập hợp cây lớn hơn hoặc bằng " + givenElement12 + " là: " + result12);
                    } else {
                        System.out.println("Không có phần tử nào trong tập hợp cây lớn hơn hoặc bằng " + givenElement12);
                    }
                    break;
                case "13":
                    int givenElement13 = 7;

                    Integer result13 = numberSet.lower(givenElement13);

                    if (result13 != null) {
                        System.out.println("Phần tử trong tập hợp cây có giá trị thấp hơn " + givenElement13 + " là: " + result13);
                    } else {
                        System.out.println("Không có phần tử nào trong tập hợp cây có giá trị thấp hơn " + givenElement13);
                    }
                    break;
                case "14":
                    if (!numberSet.isEmpty()) {
                        int firstElement14 = numberSet.pollFirst();
                        System.out.println("Phần tử đầu tiên của tập hợp cây là: " + firstElement14);
                        System.out.println("Tập hợp cây sau khi loại bỏ phần tử đầu tiên:");
                        for (int num : numberSet) {
                            System.out.println(num);
                        }
                    }
                    break;
                case "15":
                    if (!numberSet.isEmpty()) {
                        int lastElement15 = numberSet.pollLast();
                        System.out.println("Phần tử cuối cùng của tập hợp cây là: " + lastElement15);
                        System.out.println("Tập hợp cây sau khi loại bỏ phần tử cuối cùng:");
                        for (int num : numberSet) {
                            System.out.println(num);
                        }
                    } else {
                        System.out.println("Tập hợp cây rỗng.");
                    }
                    break;
                case "exit":
                    exit = true;
                    System.out.println("Thoát chương trình.");
                    break;

            }
        }
    }
}

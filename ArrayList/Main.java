package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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
            ArrayList<String> colors = new ArrayList<>();

            colors.add("Red");
            colors.add("Green");
            colors.add("Blue");
            colors.add("Yellow");
            colors.add("Purple");

            ArrayList<String> otherColors = new ArrayList<>();
            otherColors.add("Red");
            otherColors.add("Green");
            otherColors.add("Blue");

            switch (option) {
                case "1":
                    System.out.println("Bài 1 được chọn.");
                    System.out.println("Colors in the list: " + colors);
                    break;
                case "2":
                    System.out.println("Bài 2 được chọn.");


                    System.out.println("Iterating using for-each loop:");
                    for (String color : colors) {
                        System.out.println(color);
                    }


                    System.out.println("\nIterating using standard for loop:");
                    for (int i = 0; i < colors.size(); i++) {
                        System.out.println(colors.get(i));
                    }


                    System.out.println("\nIterating using an iterator:");
                    for (String color : colors) {
                        System.out.println(color);
                    }
                    break;
                case "3":
                    System.out.println("Bài 3 được chọn.");
                    colors.add(0, "Orange");
                    System.out.println("Sau khi chèn một phần tử vào vị trí đầu tiên: " + colors);
                    break;
                case "4":
                    System.out.println("Bài 4 được chọn.");
                    String elementAtIndex3 = colors.get(3);
                    System.out.println("Phần tử tại chỉ mục 3: " + elementAtIndex3);
                    break;
                case "5":
                    System.out.println("Bài 5 được chọn.");
                    colors.set(2, "Cyan");
                    System.out.println("Sau khi cập nhật phần tử ở chỉ mục 2: " + colors);
                    break;
                case "6":
                    System.out.println("Bài 6 được chọn.");
                    colors.remove(2);
                    System.out.println("Sau khi loại bỏ phần tử thứ ba: " + colors);
                    break;
                case "7":
                    System.out.println("Bài 7 được chọn.");
                    String searchElement = "Yellow";
                    int index = colors.indexOf(searchElement);
                    if (index != -1) {
                        System.out.println("Phần tử " + searchElement + " được tìm thấy tại chỉ mục " + index);
                    } else {
                        System.out.println("Phần tử " + searchElement + " không tồn tại trong danh sách mảng");
                    }
                    break;
                case "8":
                    System.out.println("Bài 8 được chọn.");
                    Collections.sort(colors);
                    System.out.println(" Danh sách mảng sau khi sắp xếp: " + colors);
                    break;
                case "9":
                    System.out.println("Bài 9 được chọn.");
                    ArrayList<String> copiedList = new ArrayList<>(colors);
                    System.out.println(" Danh sách mảng sao chép: " + copiedList);
                    break;
                case "10":
                    System.out.println("Bài 10 được chọn.");
                    Collections.shuffle(colors);
                    System.out.println(" Danh sách mảng sau khi xáo trộn: " + colors);
                    break;
                case "11":
                    System.out.println("Bài 11 được chọn.");
                    Collections.reverse(colors);
                    System.out.println("9. Danh sách mảng sau khi đảo ngược: " + colors);
                    break;
                case "12":
                    System.out.println("Bài 12 được chọn.");
                    ArrayList<String> subList = new ArrayList<>(colors.subList(1, 4));
                    System.out.println("10. Phần trích xuất của danh sách mảng: " + subList);
                    break;
                case "13":
                    if (colors.equals(otherColors)) {
                        System.out.println("11. Hai danh sách mảng là giống nhau");
                    } else {
                        System.out.println("11. Hai danh sách mảng không giống nhau");
                    }
                    break;
                case "14":
                    Collections.swap(colors, 1, 3);
                    System.out.println("12. Danh sách mảng sau khi hoán đổi phần tử: " + colors);
                    break;
                case "15":
                    ArrayList<String> combinedList = new ArrayList<>(colors);
                    combinedList.addAll(otherColors);
                    System.out.println("13. Danh sách mảng kết hợp: " + combinedList);
                    break;
                case "16":
                    ArrayList<String> clonedList = (ArrayList<String>) colors.clone();
                    System.out.println("14. Danh sách mảng được sao chép: " + clonedList);
                    break;
                case "17":
                    colors.clear();

                    System.out.println("ArrayList after clearing: " + colors);
                    break;
                case "18":
                    boolean isEmpty = colors.isEmpty();

                    System.out.println("Is ArrayList empty? " + isEmpty);
                    break;
                case "19":
                    colors.trimToSize();

                    System.out.println("ArrayList after trimming: " + colors);
                    break;
                case "20":
                    colors.ensureCapacity(10);

                    System.out.println("ArrayList after ensuring capacity: " + colors);
                    break;
                case "21":
                    colors.set(1, String.valueOf(3));

                    System.out.println("ArrayList after replacing: " + colors);
                    break;
                case "22":
                    for (int i = 0; i < colors.size(); i++) {
                        System.out.println("Element at index " + i + ": " + colors.get(i));
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
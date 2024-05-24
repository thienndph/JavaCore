package HashMap;

import java.util.*;

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
            HashMap<Integer, String> hash_map = new HashMap<Integer, String>();


            hash_map.put(1, "Red");
            hash_map.put(2, "Green");
            hash_map.put(3, "Black");
            hash_map.put(4, "White");
            hash_map.put(5, "Blue");

            switch (option) {
                case "1":
                    System.out.println("Bài 1 được chọn.");


                    for (Map.Entry<Integer, String> entry : hash_map.entrySet()) {
                        System.out.println(entry.getKey() + " " + entry.getValue());
                    }

                    break;
                case "2":
                    System.out.println("Bài 2 được chọn.");
                    System.out.println("Kích thước của HashMap: " + hash_map.size());
                    break;
                case "3":
                    System.out.println("Bài 3 được chọn.");

                    HashMap<Integer, String> hash_map1 = new HashMap<Integer, String>();
                    HashMap<Integer, String> hash_map2 = new HashMap<Integer, String>();


                    hash_map1.put(1, "Đỏ");
                    hash_map1.put(2, "Xanh lá");
                    hash_map1.put(3, "Đen");
                    System.out.println("Giá trị trong HashMap thứ nhất: " + hash_map1);


                    hash_map2.put(4, "Trắng");
                    hash_map2.put(5, "Xanh dương");
                    hash_map2.put(6, "Cam");
                    System.out.println("Giá trị trong HashMap thứ hai: " + hash_map2);

                    hash_map2.putAll(hash_map1);
                    System.out.println("Giá trị trong HashMap thứ hai sau khi sao chép: " + hash_map2);
                    break;
                case "4":
                    System.out.println("Bài 4 được chọn.");
                    System.out.println("HashMap ban đầu: " + hash_map);


                    hash_map.clear();

                    System.out.println("HashMap sau khi xóa: " + hash_map);

                    break;
                case "5":
                    System.out.println("Bài 5 được chọn.");
                    boolean result = hash_map.isEmpty();


                    System.out.println("Bản đồ có trống không: " + result);
                    break;
                case "6":
                    System.out.println("Bài 6 được chọn.");
                    HashMap<String, String> originalMap = new HashMap<>();
                    originalMap.put("1", "Red");
                    originalMap.put("2", "Green");
                    originalMap.put("3", "Blue");


                    HashMap<String, String> shallowCopy = (HashMap<String, String>) originalMap.clone();


                    shallowCopy.put("1", "Yellow");


                    System.out.println("Original Map: " + originalMap);
                    System.out.println("Shallow Copy: " + shallowCopy);
                    break;
                case "7":
                    System.out.println("Bài 7 được chọn.");
                    HashMap<String, String> map = new HashMap<>();
                    map.put("key1", "value1");
                    map.put("key2", "value2");
                    map.put("key3", "value3");
                    boolean containsKey = map.containsKey("key2");


                    if (containsKey) {
                        System.out.println("Bản đồ chứa khóa 'key2'.");
                    } else {
                        System.out.println("Bản đồ không chứa khóa 'key2'.");
                    }
                    break;
                case "8":
                    System.out.println("Bài 8 được chọn.");
                    // Thực hiện hành động cho Bài 8
                    break;
                case "9":
                    System.out.println("Bài 9 được chọn.");
                    HashMap<Integer, String> hash_map9 = new HashMap<Integer, String>();
                    hash_map.put(1, "Red");
                    hash_map.put(2, "Green");
                    hash_map.put(3, "Black");
                    hash_map.put(4, "White");
                    hash_map.put(5, "Blue");


                    Set<Map.Entry<Integer, String>> setView = hash_map.entrySet();


                    for (Map.Entry<Integer, String> entry : setView) {
                        System.out.println("Khóa: " + entry.getKey() + ", Giá trị: " + entry.getValue());
                    }
                    break;
                case "10":
                    System.out.println("Bài 10 được chọn.");
                    HashMap<Integer, String> hash_map10 = new HashMap<Integer, String>();
                    hash_map.put(1, "Đỏ");
                    hash_map.put(2, "Xanh lá");
                    hash_map.put(3, "Đen");
                    hash_map.put(4, "Trắng");
                    hash_map.put(5, "Xanh dương");

                    String valueForKey3 = hash_map.get(3);

                    System.out.println("Giá trị cho khóa 3 là: " + valueForKey3);
                    break;
                case "11":
                    System.out.println("Bài 11 được chọn.");
                    HashMap<String, String> map11 = new HashMap<>();
                    map11.put("key1", "value1");
                    map11.put("key2", "value2");
                    map11.put("key3", "value3");
                    Set<String> keys = map11.keySet();
                    for (String key : keys) {
                        System.out.println(key);
                    }
                    break;
                case "12":
                    System.out.println("Bài 12 được chọn.");
                    HashMap<String, String> map12 = new HashMap<>();
                    map12.put("key1", "value1");
                    map12.put("key2", "value2");
                    map12.put("key3", "value3");

                    // Lấy tất cả các giá trị từ bản đồ
                    Collection<String> values = map12.values();

                    // In ra tất cả các giá trị
                    for (String value : values) {
                        System.out.println(value);
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
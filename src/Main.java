package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Tạo một đối tượng Scanner để đọc đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập ngày tháng năm
        System.out.println("Nhap ngay thang nam (d/m/yyyy): ");
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int y = scanner.nextInt();

        // Tạo một đối tượng NextDay
        NextDay nextDay = new NextDay(d, m, y);

        scanner.close();

        // In ngày tiếp theo
        System.out.println("Ngày tiếp theo: " + nextDay.getNextDay());
    }
}

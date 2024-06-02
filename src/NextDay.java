package src;


import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class NextDay {
    private int d;
    private int m;
    private int y;

    public NextDay(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }

    // Phương thức kiểm tra đầu vào
    public boolean isValidDate() {
        if (m < 1 || m > 12) {
            return false; // Tháng không hợp lệ
        }
        if (d < 1 || d > 31) {
            return false; // Ngày không hợp lệ
        }
        if (m == 2) {
            // Kiểm tra năm nhuận
            if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                if (d > 29) {
                    return false; // Ngày không hợp lệ trong tháng 2 của năm nhuận
                }
            } else {
                if (d > 28) {
                    return false; // Ngày không hợp lệ trong tháng 2 của năm không nhuận
                }
            }
        }
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (d > 30) {
                return false; // Ngày không hợp lệ trong tháng có 30 ngày
            }
        }
        return true; // Ngày tháng hợp lệ
    }

    public String getNextDay() throws Exception {
        // Kiểm tra đầu vào
        if (!isValidDate()) {
            return "Invalid Date";
        }

        // Định dạng ngày tháng
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Khởi tạo đối tượng Calendar và đặt thời gian
        Calendar calendar = Calendar.getInstance();
        calendar.set(y, m - 1, d); // Trừ 1 cho tháng vì tháng trong Java bắt đầu từ 0

        // Tăng ngày lên 1
        calendar.add(Calendar.DATE, 1);

        // Lấy ngày tiếp theo
        Date nextDate = calendar.getTime();

        // Trả về ngày tiếp theo dưới dạng chuỗi
        return sdf.format(nextDate);
    }
}

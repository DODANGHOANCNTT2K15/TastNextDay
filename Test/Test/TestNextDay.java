package Test;

import src.NextDay;
import org.junit.Assert;
import org.junit.Test;

public class TestNextDay {

    @Test
    public void testNextDay_EndOfMonth() throws Exception {
        // Kiểm thử trường hợp ngày cuối tháng
        NextDay nextDay = new NextDay(31, 1, 2023);
        Assert.assertEquals("01/02/2023", nextDay.getNextDay());
    }

    @Test
    public void testNextDay_EndOfYear() throws Exception {
        // Kiểm thử trường hợp ngày cuối năm
        NextDay nextDay = new NextDay(31, 12, 2023);
        Assert.assertEquals("01/01/2024", nextDay.getNextDay());
    }

    @Test
    public void testNextDay_LeapYear() throws Exception {
        // Kiểm thử trường hợp ngày nhuận
        NextDay nextDay = new NextDay(28, 2, 2024);
        Assert.assertEquals("29/02/2024", nextDay.getNextDay());
    }

    @Test
    public void testNextDay_InvalidDate() throws Exception {
        // Kiểm thử trường hợp ngày không hợp lệ
        NextDay nextDay = new NextDay(31, 2, 2023);
        Assert.assertEquals("Invalid Date", nextDay.getNextDay());
    }
}

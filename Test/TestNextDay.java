package TastNextDay.Test;

import Source.NextDay;
import org.junit.Assert;
import org.junit.Test;

public class TestNextDay {
    @Test
    public void testNextDay() throws Exception {
        // Kiểm thử trường hợp ngày cuối tháng
        NextDay nextDay1 = new NextDay(31, 1, 2023);
        Assert.assertEquals("01/02/2023", nextDay1.getNextDay());

        // Kiểm thử trường hợp ngày cuối năm
        NextDay nextDay2 = new NextDay(31, 12, 2023);
        Assert.assertEquals("01/01/2024", nextDay2.getNextDay());

        // Kiểm thử trường hợp ngày nhuận
        NextDay nextDay3 = new NextDay(28, 2, 2024);
        Assert.assertEquals("29/02/2024", nextDay3.getNextDay());

        // Kiểm thử trường hợp ngày không hợp lệ
        NextDay nextDay4 = new NextDay(31, 2, 2023);
        Assert.assertEquals("Invalid Date", nextDay4.getNextDay());
    }
}

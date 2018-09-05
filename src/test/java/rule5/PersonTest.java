package rule5;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by u_kino07 on 2018. 9. 4..
 */
public class PersonTest {
    @Test
    public void test() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar.set(1950, Calendar.JANUARY, 1, 0, 0, 0);
        Date birth = calendar.getTime();
        Person person = new Person(birth);

        boolean result = person.isBabyBoomer();
        System.out.println(result); // 29ms
    }
}
package rule5;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by u_kino07 on 2018. 9. 4..
 */
public class Person {
    private final Date birthDate;

    public Person(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isBabyBoomer() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomStart = calendar.getTime();
        calendar.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomEnd = calendar.getTime();

        return birthDate.compareTo(boomStart) >= 0 &&
                birthDate.compareTo(boomEnd) < 0;
    }
}

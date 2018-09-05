package rule5;

/**
 * Created by u_kino07 on 2018. 9. 4..
 */
public class CarefulWrapper {
    public static void main(String[] args) {
        long sum = 0L; // 514ms (Long) -> 15ms (long)

        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}

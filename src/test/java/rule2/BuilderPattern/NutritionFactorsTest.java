package rule2.BuilderPattern;

import org.junit.Test;

/**
 * Created by u_kino07 on 2018. 9. 4..
 */
public class NutritionFactorsTest {
    @Test
    public void test() {
        NutritionFactors cocaCola = new NutritionFactors.Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();

        String testString = new StringBuilder().append(123).append('c').append(true).toString();
        System.out.println(testString);
    }
}
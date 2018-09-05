package rule4;

/**
 * Created by u_kino07 on 2018. 9. 4..
 */
public class UtilityClass {
    // 기본 생성자가 자동 생성되지 못하도록 하여 객체 생성 방지
    private UtilityClass() {
        throw new AssertionError(); // 클래스 안에서 실수로 호출하면 바로 알수 있도록 처리
    }
}

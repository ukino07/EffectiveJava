package rule3;

import java.io.Serializable;

/**
 * Created by u_kino07 on 2018. 9. 4..
 */
public class ElvisWithFinalField implements Serializable {
    public static transient final ElvisWithFinalField INSTANCE = new ElvisWithFinalField();

    private ElvisWithFinalField() {}

    // 싱글턴 상태 유지를 위해 구현
    private Object readResolve() {
        // 동일한 객체가 반환되도록 하면서
        // 가짜 객체는 GC 처리하도록 함
        return INSTANCE;
    }

    public void leaveTheBuilding() {}

}

package rule3;

/**
 * Created by u_kino07 on 2018. 9. 4..
 */
public class ElvisWithPublicStaticFactoryMethoad {
    private static final ElvisWithPublicStaticFactoryMethoad INSTANCE = new ElvisWithPublicStaticFactoryMethoad();
    private ElvisWithPublicStaticFactoryMethoad() {}

    public static ElvisWithPublicStaticFactoryMethoad getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {}
}

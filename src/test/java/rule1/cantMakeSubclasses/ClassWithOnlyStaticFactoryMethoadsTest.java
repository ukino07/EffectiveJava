package rule1.cantMakeSubclasses;

import org.junit.Test;

import java.util.List;
import java.util.Set;

/**
 * Created by u_kino07 on 2018. 9. 4..
 */
public class ClassWithOnlyStaticFactoryMethoadsTest {
    @Test
    public void test() {
        List list = new SubArrayList();
        Set treeSet = new SubTreeSet();
    }
}
package rule3;

import java.lang.reflect.Constructor;

/**
 * Created by u_kino07 on 2018. 9. 4..
 */
public class PrivateInvoker {
    public static void main(String[] args) throws Exception {
        Constructor<?> constructor = Private.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        Private p = (Private)constructor.newInstance();
    }
}

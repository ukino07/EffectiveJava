package rule1.cantMakeSubclasses;

/**
 * Created by u_kino07 on 2018. 9. 4..
 */
public class ClassWithOnlyStaticFactoryMethoads {

    private ClassWithOnlyStaticFactoryMethoads() {}

    public ClassWithOnlyStaticFactoryMethoads newClass() {
        return new ClassWithOnlyStaticFactoryMethoads();
    }
}

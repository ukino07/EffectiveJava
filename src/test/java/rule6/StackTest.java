package rule6;

import org.junit.Test;

/**
 * Created by u_kino07 on 2018. 9. 4..
 */
public class StackTest {
    @Test
    public void test() {
        Stack stack = new Stack();
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());

        System.out.println(stack);

        stack.pop();
        stack.pop();

        System.out.println(stack);

        stack.push(new Object());
        stack.push(new Object());

        System.out.println(stack);
    }
}
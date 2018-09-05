package rule6;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by u_kino07 on 2018. 9. 4..
 */
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 3;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];

    }

    public void push(Object element) {
        ensureCapacity();
        elements[size++] = element;
    }

//    public Object pop() {
//        if (size == 0) {
//            throw new EmptyStackException();
//        }
//
//        return elements[--size];
//    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }

        Object result = elements[--size];
//        elements[size] = null; // 만기 참조 제거
        return result;
    }

    // 적어도 하나 이상의 원소를 담을 공간을 보장.
    // 배열의 길이를 늘려야 할 때마다 대략 두 배씩 늘인다.
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    @Override
    public String toString() {
        return "Stack{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}

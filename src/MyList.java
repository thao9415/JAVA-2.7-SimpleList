import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];   //khai báo mảng

    public MyList() {
        element = new Object[DEFAULT_CAPACITY]; //khởi tạo mảng gồm 10 phần tử
    }

    private void ensureCapacity() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    public void addElement(E e) {
        if (size == element.length) {
            ensureCapacity();
        }
        element[size++] = e;
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) element[i];
    }


}

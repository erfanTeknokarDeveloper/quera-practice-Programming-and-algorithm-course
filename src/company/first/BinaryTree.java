package company.first;

public class BinaryTree<E> {
    E[] array = (E[]) new Object[10];
    int counter = 0;

    public void add(E value) {
        if (array.length < counter) {
            E[] newArray = (E[]) new Object[array.length + 10];
//            newArray= (E[]) Arrays.stream(array).toArray();
            newArray = array.clone();
            array = newArray.clone();
        }
        array[counter] = value;
        counter++;
    }

    public E[] getArray() {
        return array;
    }

}

package company.first;

import java.util.Arrays;

public class MyList2<E extends  Object> {

    E[] numbers = (E[]) new Object[20];
    E[] sortNumbers = (E[]) new Object[numbers.length];
    int counter = 0;

    public void add(E number) {
//        ArrayList<Object> objects = new ArrayList<>();
        if (numbers.length == counter) {
            numbers = add_element(numbers);
        }
        numbers[counter] = number;
        counter++;
    }

    public void listTreeAsSortedArray() {
        Arrays.sort(numbers);
    }


    public boolean search(E number) {

        E[] sortedArray = sorting();

        E[] rightArray = (E[]) new Object[numbers.length / 2];
        E[] leftArray = (E[]) new Object[numbers.length / 2];
        int counter = numbers.length / 2;

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = sortedArray[i];
        }
        for (int j = 0; j < rightArray.length; j++) {
            rightArray[j] = sortedArray[counter];
            if (counter != sortedArray.length) {
                counter++;
            }
        }

        if ((int)number >(int) rightArray[0]) {
            for (int i = 0; i < rightArray.length; i++) {
                if (rightArray[i] == number) {
                    return true;
                }
            }
        }
        if ((int)number >(int) leftArray[leftArray.length]) {
            for (int i = leftArray.length - 1; i >= 0; i--) {
                if (leftArray[i] == number) {
                    return true;
                }
            }
        }
        return false;
    }


//    ---------------------------------------------------------------------------------

    public E[] sorting() {
        sortNumbers = transformer(numbers);
        Arrays.sort(sortNumbers);
        return (E[])sortNumbers;
    }

    public E[] add_element(E myArray[]) {

        E[] newArray = (E[]) new Object[myArray.length + 10];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = myArray[i];
        }

        return newArray;

    }


    public E[] transformer(E myArray[]) {

        E[] newArray = (E[]) new Object[myArray.length];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = myArray[i];
        }
        return newArray;
    }

    public void getAll() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("-------------------------");

        System.out.println(counter);
    }


}

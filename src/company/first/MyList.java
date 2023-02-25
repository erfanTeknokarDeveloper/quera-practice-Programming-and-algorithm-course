package company.first;

import java.util.Arrays;

public class MyList {

    int[] numbers = new int[20];
    int[] sortNumbers = new int[numbers.length];
    int counter = 0;

    public void add(int number) {
        if (numbers.length == counter) {
            numbers = add_element(numbers);
        }
        numbers[counter] = number;
        counter++;
    }

    public void listTreeAsSortedArray() {
        Arrays.sort(numbers);
    }


    public boolean search(int number) {

        int[] sortedArray = sorting();

        int[] rightArray = new int[numbers.length / 2];
        int[] leftArray = new int[numbers.length / 2];
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

        if (number > rightArray[0]) {
            for (int i = 0; i < rightArray.length; i++) {
                if (rightArray[i] == number) {
                    return true;
                }
            }
        }
        if (number > leftArray[leftArray.length]) {
            for (int i = leftArray.length - 1; i >= 0; i--) {
                if (leftArray[i] == number) {
                    return true;
                }
            }
        }
        return false;
    }


//    ---------------------------------------------------------------------------------

    public int[] sorting() {
        sortNumbers = transformer(numbers);
        Arrays.sort(sortNumbers);
        return sortNumbers;
    }

    public int[] add_element(int myArray[]) {

        int[] newArray = new int[myArray.length + 10];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = myArray[i];
        }

        return newArray;

    }


    public int[] transformer(int myArray[]) {

        int[] newArray = new int[myArray.length];

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

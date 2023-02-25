package company.first;

public class Main2 {
    public static void main(String[] args) {
        MyList2<Integer> myList2  = new MyList2<>();
        myList2.add(15);
        myList2.add(25);
        myList2.add(35);
        myList2.add(32);
        myList2.add(33);
        myList2.add(34);
        myList2.add(35);
        myList2.add(36);
        myList2.add(37);
        myList2.add(378);
        myList2.add(39);
        myList2.add(35);



//        binaryTree.getAll();
        System.out.println(myList2.search(35));
//        System.out.println(myList2.search(378));

//        System.out.println(Arrays.toString(binaryTree.getArray()));
    }
}

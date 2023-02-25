package company.first;

public class Main {
    public static void main(String[] args) {
        MyList binaryTree = new MyList();
        binaryTree.add(15);
        binaryTree.add(25);
        binaryTree.add(35);
        binaryTree.add(32);
        binaryTree.add(33);
        binaryTree.add(34);
        binaryTree.add(35);
        binaryTree.add(36);
        binaryTree.add(37);
        binaryTree.add(378);
        binaryTree.add(39);
        binaryTree.add(35);

//        List<String> strings= new ArrayList<>();


//        binaryTree.getAll();
        System.out.println(binaryTree.search(35));
        System.out.println(binaryTree.search(378));

//        System.out.println(Arrays.toString(binaryTree.getArray()));
    }
}

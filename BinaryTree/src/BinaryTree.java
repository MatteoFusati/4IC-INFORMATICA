/**
 * Created by Francesco Rossato and Matteo Fusati on 30/10/2017.
 */
public class BinaryTree<T> {
    private T root;
    private BinaryTree right;
    private BinaryTree left;

    public BinaryTree(T info) {
        this(info, null, null);
    }
    public BinaryTree(T root, BinaryTree right, BinaryTree left) {
        this.root = root;
        this.right = right;
        this.left = left;
    }

    public BinaryTree getRight(){
        return this.right;
    }
    public BinaryTree getLeft(){
        return this.left;
    }
    public T getRoot() {
        return root;
    }

    public void setRoot(T root){
        this.root = root;
    }
    public void setRight(BinaryTree right) {
        this.right = right;
    }
    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public static void preOrderTraversal(BinaryTree binTree){
        if(binTree.getRoot() != null){
            System.out.print(binTree.getRoot() + ", ");
            preOrderTraversal(binTree.getLeft());
            preOrderTraversal(binTree.getRight());
        }
    }
    public static LinkedList afterOrderTraversal(BinaryTree binTree){
        if(binTree == null)
            return new LinkedList();
        LinkedList out = new LinkedList();
        out.add(afterOrderTraversal(binTree.getLeft()));
        out.add(afterOrderTraversal(binTree.getRight()));
        return out;

    }
    public static void inOrderTraversal(BinaryTree binTree){
        if(binTree.getRoot() != null){
            inOrderTraversal(binTree.getLeft());
            System.out.print(binTree.getRoot() + ", ");
            inOrderTraversal(binTree.getRight());
        }
    }
}

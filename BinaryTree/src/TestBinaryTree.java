import java.util.Random;

/**
 * Created by Francesco Rossato && Matteo Fusati on 30/10/2017.
 */
public class TestBinaryTree {
    public static void main(String[] args) {
        final int MAX = 1000;
        Random rnd = new Random();
        BinaryTree b0 = new BinaryTree(rnd.nextInt(MAX));
        BinaryTree b = b0;
        for(int i = 0; i < 100; i++){
            if(rnd.nextBoolean()) {
                b.setRight(new BinaryTree(rnd.nextInt(MAX)));
                b = b.getRight();
            }
            else {
                b.setLeft(new BinaryTree(rnd.nextInt(MAX)));
                b = b.getLeft();
            }
        }	
        BinaryTree.afterOrderTraversal(b0).toString();
    }
}

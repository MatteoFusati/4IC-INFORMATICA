import java.util.Iterator;

/**
 * Created by francesco.rossato on 09/10/2017.
 */
public class LinkedList <T> implements Iterable{
    private Node first = null;

    public LinkedList(T element) {
        this.first = new Node(element);
    }
    public LinkedList(T[] elements){
        this.first = new Node(elements[0]);
        Node n = first;
        for (int i = 1; i < elements.length; i++){
            n.setNext(new Node(elements[i]));
            n = n.getNext();
        }
    }
    public LinkedList(){

    }

    public Object get(int pos){
        if(pos < 0 || pos >= getLength())
            throw new IllegalArgumentException("Position is too big or negative");
        Node n = first;
        int i = 0;
        while(i < pos){
            n = n.getNext();
            i++;
        }
        return n.getData();
    }
    public void set(int pos, T element){
        if(pos < 0 || pos >= getLength())
            throw new IllegalArgumentException("Position is too big or negative");
        Node n = first;
        int i = 0;
        while(i < pos){
            n = n.getNext();
            i++;
        }
        n.setData(element);
    }
    public void add(T element){
        if(first == null)
            first = new Node(element);
        else {
            Node n = first;
            while(n.getNext() != null)
                n = n.getNext();
            n.setNext(new Node(element));
        }
    }
    public void add(LinkedList elements){
        for(Object element : elements)
            add((T) element);
    }
    public void add(T[] elements){
        for(T element : elements)
            add(element);
    }
    public int getLength(){
        Node n = first;
        int len = 0;
        while(n != null){
            len++;
            n = n.getNext();
        }
        return len;
    }

    public String toString(){
        Node n = first;
        String out = "";
        while (n != null){
            out += n.toString();
            out += " ";
            n = n.getNext();
        }
        return out;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            int pos = 0;
            @Override
            public boolean hasNext() {
                return pos < getLength();
            }

            @Override
            public Object next() {
                return get(pos++);
            }
        };
    }
}
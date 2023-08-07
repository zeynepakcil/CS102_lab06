package Part2;

import java.util.Iterator;
import java.util.LinkedList;

import org.w3c.dom.Node;

public class LinkedListCollection implements IMethods{
    private LinkedList<Integer> ll;

    public LinkedListCollection(){
        ll = new LinkedList<Integer>();
    }

    @Override
    public void add(int element) {
        ll.add(element);
    }

    @Override
    public boolean contains(int element) {
        return ll.contains(element);
    }

    @Override
    public void removeFirstOccurrence(int element) {
        if(ll.contains(element)) 
            ll.remove(element);
    }

    @Override
    public Iterator<Integer> getIterator() {
        Iterator iterator = ll.iterator();
        return iterator;
    }
    
}

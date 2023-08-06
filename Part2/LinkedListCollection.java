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
        for(int n: ll){
            if(n == element) return true;
        }
        return false;
    }

    @Override
    public void removeFirstOccurrence(int element) {
        for(int i = 0; i < ll.size(); i++){
            if(ll.get(i) == element) ll.remove(i);
        }
    }

    @Override
    public Iterator<Integer> getIterator() {
        Iterator iterator = ll.iterator();
        return iterator;
    }
    
}

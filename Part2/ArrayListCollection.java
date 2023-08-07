package Part2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection implements IMethods {
    private ArrayList<Integer> al;
    public ArrayListCollection(){
        al = new ArrayList<Integer>();
    }
    @Override
    public void add(int element) {
        al.add(element);
    }   

    @Override
    public boolean contains(int element) {
        return al.contains(element);
    }

    @Override
    public void removeFirstOccurrence(int element) {
        if(al.contains(element)) 
            al.remove(element);
    }

    @Override
    public Iterator<Integer> getIterator() {
        Iterator iterator = al.iterator();
        return iterator;
    }
    
}

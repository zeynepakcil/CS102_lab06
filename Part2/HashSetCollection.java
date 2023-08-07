package Part2;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollection implements IMethods{

    private HashSet<Integer> hs;

    public HashSetCollection(){
        hs = new HashSet<Integer>();
    }
    @Override
    public void add(int element) {
        hs.add(element);
    }

    @Override
    public boolean contains(int element) {
        return hs.contains(element);
    }

    @Override
    public void removeFirstOccurrence(int element) {
        if(hs.contains(element)) 
            hs.remove(element);
    }

    @Override
    public Iterator<Integer> getIterator() {
        Iterator iterator = hs.iterator();
        return iterator;
    }

    
}

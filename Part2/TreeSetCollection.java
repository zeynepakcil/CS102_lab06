package Part2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCollection implements IMethods{
    private TreeSet<Integer> ts;

    public TreeSetCollection(){
        ts = new TreeSet<Integer>();
    }
    @Override
    public void add(int element) {
        ts.add(element);
    }

    @Override
    public boolean contains(int element) {
        return ts.contains(element);
    }

    @Override
    public void removeFirstOccurrence(int element) {
        if(ts.contains(element)) 
            ts.remove(element);

    }

    @Override
    public Iterator<Integer> getIterator() {
        Iterator iterator = ts.iterator();
        return iterator;
    }

}

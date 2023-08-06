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
        for(int n: ts){
            if(n == element) return true;
        }
        return false;
    }

    @Override
    public void removeFirstOccurrence(int element) {
        Iterator iterator = getIterator();
        while(iterator.hasNext()){
            if((int)iterator.next() == element){
                iterator.remove();
                return ;
            }
        }
    }

    @Override
    public Iterator<Integer> getIterator() {
        Iterator iterator = ts.iterator();
        return iterator;
    }

}

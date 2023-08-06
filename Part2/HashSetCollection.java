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
        for(int n: hs){
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
        Iterator iterator = hs.iterator();
        return iterator;
    }

    
}

package Part2;

import java.util.Iterator;

public interface IMethods {
        void add(int element);
        boolean contains(int element);
        void removeFirstOccurrence(int element);
        Iterator<Integer> getIterator();
    
}

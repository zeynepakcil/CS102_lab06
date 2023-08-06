package Part2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection implements IMethods {
    ArrayList<Integer> al;
    public ArrayListCollection(){
        al = new ArrayList<Integer>();
    }
    @Override
    public void add(int element) {
        al.add(element);
    }   

    @Override
    public boolean contains(int element) {
        for(int n: al){
            if(n == element) return true;
        }
        return false;
    }

    @Override
    public void removeFirstOccurrence(int element) {
        for(int i = 0; i < al.size(); i++){
            if(al.get(i) == element){  
                al.remove(i);
                return ;
            }
        }
    }

    @Override
    public Iterator<Integer> getIterator() {
        Iterator iterator = al.iterator();
        return iterator;
    }
    
}

package Part2;

import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Test {
    public static void main(String[] args) {
        final int INT_NUMBER = 1000000;
        int[] array = new int[INT_NUMBER];
        for (int i = 0; i < INT_NUMBER; i++) {
            array[i] = (int) (Math.random() * 1000) + 1;
        }

        ArrayListCollection arrayList = new ArrayListCollection();
        HashSetCollection hashSet = new HashSetCollection();
        LinkedListCollection linkedList = new LinkedListCollection();
        TreeSetCollection treeSet = new TreeSetCollection();

        // ----------------------------------------------------------------------
        // Time taken while inserting integers
        // --------------------------
        // ArrayList
        long ALbegin1 = System.nanoTime();
        for (int i = 0; i < INT_NUMBER; i++)
            arrayList.add(array[i]);
        long ALend1 = System.nanoTime();
        long ALtime1 = ALend1 - ALbegin1;
        // --------------------------
        // HashSet
        long HSbegin1 = System.nanoTime();
        for (int i = 0; i < INT_NUMBER; i++)
            hashSet.add(array[i]);
        long HSend1 = System.nanoTime();
        long HStime1 = HSend1 - HSbegin1;
        // --------------------------
        // LinkedList
        long LLbegin1 = System.nanoTime();
        for (int i = 0; i < INT_NUMBER; i++)
            linkedList.add(array[i]);
        long LLend1 = System.nanoTime();
        long LLtime1 = LLend1 - LLbegin1;
        // --------------------------
        // TreeSet
        long TSbegin1 = System.nanoTime();
        for (int i = 0; i < INT_NUMBER; i++)
            treeSet.add(array[i]);
        long TSend1 = System.nanoTime();
        long TStime1 = TSend1 - TSbegin1;
        // ----------------------------------------------------------------------

        // Time taken to insert one additional element
        int el = (int) (Math.random() * 1000) + 1;
        // --------------------------
        // ArrayList
        long ALbegin2 = System.nanoTime();
        arrayList.add(el);
        long ALend2 = System.nanoTime();
        long ALtime2 = ALend2 - ALbegin2;
        // --------------------------
        // HashSet
        long HSbegin2 = System.nanoTime();
        hashSet.add(el);
        long HSend2 = System.nanoTime();
        long HStime2 = HSend2 - HSbegin2;
        // --------------------------
        // LinkedList
        long LLbegin2 = System.nanoTime();
        linkedList.add(el);
        long LLend2 = System.nanoTime();
        long LLtime2 = LLend2 - LLbegin2;
        // --------------------------
        // TreeSet
        long TSbegin2 = System.nanoTime();
        treeSet.add(el);
        long TSend2 = System.nanoTime();
        long TStime2 = TSend2 - TSbegin2;
        // ----------------------------------------------------------------------

        // The average time taken to check if a random integer is contained (average of
        // 100 tests)
        el = (int) (Math.random() * 1000) + 1;
        // --------------------------
        // ArrayList
        long ALbegin3 = System.nanoTime();
        arrayList.contains(el);
        long ALend3 = System.nanoTime();
        long ALtime3 = (ALend3 - ALbegin3) / 100;
        // --------------------------
        // HashSet
        long HSbegin3 = System.nanoTime();
        hashSet.contains(el);
        long HSend3 = System.nanoTime();
        long HStime3 = (HSend3 - HSbegin3) / 100;
        // --------------------------
        // LinkedList
        long LLbegin3 = System.nanoTime();
        linkedList.contains(el);
        long LLend3 = System.nanoTime();
        long LLtime3 = (LLend3 - LLbegin3) / 100;
        // --------------------------
        // TreeSet
        long TSbegin3 = System.nanoTime();
        treeSet.contains(el);
        long TSend3 = System.nanoTime();
        long TStime3 = (TSend3 - TSbegin3) / 100;
        // ----------------------------------------------------------------------

        // The average time taken to delete a random element from the original 1 million
        // integers (average of 100 tests)
        el = (int) (Math.random() * 1000) + 1;
        // --------------------------
        // ArrayList
        long ALbegin4 = System.nanoTime();
        arrayList.removeFirstOccurrence(el);
        long ALend4 = System.nanoTime();
        long ALtime4 = (ALend4 - ALbegin4) / 100;
        // --------------------------
        // HashSet
        long HSbegin4 = System.nanoTime();
        hashSet.removeFirstOccurrence(el);
        long HSend4 = System.nanoTime();
        long HStime4 = (HSend4 - HSbegin4) / 100;
        // --------------------------
        // LinkedList
        long LLbegin4 = System.nanoTime();
        linkedList.removeFirstOccurrence(el);
        long LLend4 = System.nanoTime();
        long LLtime4 = (LLend4 - LLbegin4) / 100;
        // --------------------------
        // TreeSet
        long TSbegin4 = System.nanoTime();
        treeSet.removeFirstOccurrence(el);
        long TSend4 = System.nanoTime();
        long TStime4 = (TSend4 - TSbegin4) / 100;
        // ----------------------------------------------------------------------

        // Time taken to traverse the collection using an iterator
        el = (int) (Math.random() * 1000) + 1;
        Iterator it;
        // --------------------------
        // ArrayList
        long ALbegin5 = System.nanoTime();
        it = arrayList.getIterator();
        while (it.hasNext())
            it.next();
        long ALend5 = System.nanoTime();
        long ALtime5 = (ALend5 - ALbegin5) / 100;
        System.out.println("hey");

        // --------------------------
        // HashSet
        long HSbegin5 = System.nanoTime();
        it = hashSet.getIterator();
        while (it.hasNext())
            it.next();
        long HSend5 = System.nanoTime();
        long HStime5 = (HSend5 - HSbegin5) / 100;
        // --------------------------
        // LinkedList
        long LLbegin5 = System.nanoTime();
        it = linkedList.getIterator();
        while (it.hasNext())
            it.next();
        long LLend5 = System.nanoTime();
        long LLtime5 = (LLend5 - LLbegin5) / 100;
        // --------------------------
        // TreeSet
        long TSbegin5 = System.nanoTime();
        it = treeSet.getIterator();
        while (it.hasNext())
            it.next();
        long TSend5 = System.nanoTime();
        long TStime5 = (TSend5 - TSbegin5) / 100;
        // ----------------------------------------------------------------------

        Object[][] data = {
                { "ArrayList: ", ALtime1, ALtime2, ALtime3, ALtime4, ALtime5 },
                { "HastSet: ", HStime1, HStime2, HStime3, HStime4, HStime5 },
                { "LinkedList: ", LLtime1, LLtime2, LLtime3, LLtime4, LLtime5 },
                { "TreeSet: ", TStime1, TStime2, TStime3, TStime4, TStime5 },
        };

        String[] columnNames = { "Data", "Time to insert all integers", "Time to insert one element",
                "Average time to check if a random integer is contained (av. of 100 test)", "Average time to delete a random element (av. of 100 test)",
                "Time to traverse the collection with iterator" };

        JTable table = new JTable(data, columnNames);
        JPanel panel = new JPanel();
        panel.add(table);

        TableModel model = new DefaultTableModel(data, columnNames) {
            @Override
            public Class getColumnClass(int column) {
                return getValueAt(0, column).getClass();
            }
        };
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setSize(1500, 500);
        
        panel.add(scrollPane);
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

    }
}

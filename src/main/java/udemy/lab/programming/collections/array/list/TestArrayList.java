package udemy.lab.programming.collections.array.list;

import java.util.*;

public class TestArrayList {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add("world");
        list.add(new TestArrayList());
        System.out.println(list);
        list.add(1,"Central city");
        ListIterator i = list.listIterator();

        while(i.hasNext()){
            System.out.println(i.next());
            if(i.hasPrevious()){
                System.out.println("has Previous Element");
            }
        }

        TreeSet set = new TreeSet();
        set.add(88);
        set.add(33);
        set.add(55);

        System.out.println(set);

        Set orderedSet = new TreeSet();
        orderedSet.add("A");
        orderedSet.add("3");
        orderedSet.add("b");
        orderedSet.add("B");
        System.out.println(orderedSet);


        List<String> lists= Arrays.asList(new String[]{"A","B","C"});

        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.addAll(Arrays.asList(new String[]{"A","B","C"}));
        System.out.println(list1);

        List<String> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(new String[]{"A"}));


    }
}

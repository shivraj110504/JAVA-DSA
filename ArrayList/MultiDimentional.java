package ArrayList;

import java.util.ArrayList;

public class MultiDimentional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list.add(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list.add(list2);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(70);
        list3.add(80);
        list3.add(90);
        list.add(list3);
        System.out.println(list);

    }
}

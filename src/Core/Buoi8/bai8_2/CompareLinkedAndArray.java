package Core.Buoi8.bai8_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareLinkedAndArray {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        //Get array
        long beforeRunGetArray = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayList.get(50000);
        }
        long afterRunGetArray = System.currentTimeMillis();
        long diffGetArray = afterRunGetArray - beforeRunGetArray;
        System.out.println("Get array: " + diffGetArray + "ms");



        //Get linked
        long beforeRunGetLinked = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedList.get(50000);
        }
        long afterRunGetLinked = System.currentTimeMillis();
        long diffGetLinked = afterRunGetLinked - beforeRunGetLinked;
        System.out.println("Get linked: " + diffGetLinked + "ms");



        //Remove array
        long beforeRunRemoveArray = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            arrayList.remove(50);
        }
        long afterRunRemoveArray = System.currentTimeMillis();
        long diffRemoveArray = afterRunRemoveArray - beforeRunRemoveArray;
        System.out.println("remove array: " + diffRemoveArray + "ms");




        //Remove linked
        long beforeRunRemoveLinked = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            linkedList.remove(50);
        }
        long afterRunRemoveLinked = System.currentTimeMillis();
        long diffRemoveLinked = afterRunRemoveLinked - beforeRunRemoveLinked;
        System.out.println("Remove linked: " + diffRemoveLinked + "ms");



    }
}

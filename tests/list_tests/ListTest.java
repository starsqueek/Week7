package list_tests;

import linkedList.list.List;
import linkedList.list.ListAccessError;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

public class ListTest<T> {

    @Test
    void testList() throws ListAccessError {
        List<T> testlist = new List<T>();

        int limit = 5;
        Random rand = new Random();
        ArrayList arrayl = new ArrayList();
        for(int index=0;index<limit;index++){
            arrayl.add(rand.nextInt((50 - 0) + 1) + 0);
        }
        T[] array = (T[]) arrayl.toArray((T[]) new Comparable[arrayl.size()]);
        for(int i=0;i<limit;i++){
            testlist.add(i,array[i]);
        }
        System.out.println(testlist.toString());
    }


}

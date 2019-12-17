package list_tests;

import linkedList.list.List;
import linkedList.list.ListAccessError;
import linkedList.list.SingleListLink;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.fail;

public class ListTest<T> {

    @Test
    void Listtest(int limit) throws ListAccessError {
        List<T> testlist = new SingleListLink<T>();

        Random rand = new Random();
        ArrayList arrayl = new ArrayList();
        for(int index=0;index<limit;index++){
            arrayl.add(rand.nextInt((50 - 0) + 1) + 0);
        }
        T[] array = (T[]) arrayl.toArray((T[]) new Comparable[arrayl.size()]);
        for(int i=0;i<limit;i++){
            testlist.add(i,array[i]);
        }
        System.out.println(testlist.get(0).toString());
        if(testlist.get(0) != array[0]){
            fail("Object not successfully added to list.");
        }
    }


    @Test
    void testListSize1(){
        try {
            Listtest(1);
        } catch (ListAccessError listAccessError) {
            listAccessError.printStackTrace();
        }
    }
}

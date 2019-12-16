package list_tests;

import linkedList.list.List;
import linkedList.list.ListAccessError;
import linkedList.list.Stack;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class ListTest<T> {

    @Test
    void testList() throws ListAccessError {
        List<T> testlist = new List<T>() {
            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public void add(int index, T value) throws ListAccessError {

            }

            @Override
            public T remove(int index) throws ListAccessError {
                return null;
            }

            @Override
            public T get(int index) throws ListAccessError {
                return null;
            }
        };

        int limit = 5;
        for(int i=0;i<limit;i++){
            System.out.println(testlist);
            testlist.add(0,8);
            System.out.println(testlist);
            testlist.add(0,94);
            testlist.add(0,12);
            System.out.println(testlist);
        }
        System.out.println(testlist);
    }


}

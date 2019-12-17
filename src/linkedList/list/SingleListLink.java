package linkedList.list;
import linkedList.node.ListNode;
import linkedList.node.SingleLinkNode;

/**
 * SingleLinkList for the List Interface
 * @author Stephen Roberts
 * @version 16/12/19
 * @param <T>
 */
public class SingleListLink<T> extends BasicList<SingleLinkNode<T>,T> implements List<T>
{

    /**
     * Gets the value of the node of the index
     * @param index
     * @return
     * @throws ListAccessError
     */
    ListNode<T> getNode(int index) throws ListAccessError {
        if (isEmpty()) {
            throw new ListAccessError("Cannot get node.  List is empty.");
        }
        if (index < 0) {
            throw new ListAccessError("Cannot get node.  Negative index.");
        }
        ListNode<T> currentNode = getRoot();
        while (index != 0 && currentNode != null) {
            currentNode = currentNode.getNext();
            index--;
        }
        if (currentNode == null) {
            throw new ListAccessError("Cannot get node.  Not enough nodes in the list.");
        }
        return currentNode;
    }

    /**
     * adds a object to the linked list
     * @param index the index at which the new entry should be added.
     * @param value the value to be added.
     * @throws ListAccessError
     */
    @Override
    public void add(int index, T value) throws ListAccessError {
        if (isEmpty()) {
            if(index == 0){
                setRoot(new SingleLinkNode<T>(value));
            }
            else{
                throw new ListAccessError("Cannot get node.  List is empty.");
            }
        }
        else {
            ListNode<T> currentNode = getRoot();
            currentNode.getNext();
            currentNode = new SingleLinkNode<T>(value);
        }
    }

    /**
     * removes a object from the linked list
     * @param index the index of the entry to be removed.
     * @return
     * @throws ListAccessError
     */
    @Override
    public T remove(int index) throws ListAccessError {
        if (isEmpty()) {
            throw new ListAccessError("Cannot get node.  List is empty.");
        }
        else {
            ListNode<T> currentNode = getRoot();
            while (index != 0 && currentNode != null) {
                currentNode = currentNode.getNext();
                index--;
            }
            if (currentNode == null) {
                throw new ListAccessError("Cannot get node.  Not enough nodes in the list.");
            }
            else {
                currentNode = new SingleLinkNode<T>(null);
            }
            return currentNode.getValue();
        }

    }

    /**
     * gets the object at the index value
     * @param index the index of the entry to be accessed.
     * @return
     * @throws ListAccessError
     */
    @Override
    public T get(int index) throws ListAccessError {
        return getNode(index).getValue();
    }
}

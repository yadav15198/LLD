package Task1StackImplentaionUsingInterface;

public class LinkedListStack implements Stack {
    LinkedList node = null;

    @Override
    public int push(int num) {
        LinkedList tempNode = new LinkedList(num);
        LinkedList iterator = node;
        if(iterator != null) {
            if(iterator.next == null){
                iterator.next = tempNode;
            }
            iterator = node.next;
        }else{
            node = tempNode;
        }
        return num;
    }

    @Override
    public int pop() {
        LinkedList iterator = node;
        while (iterator != null && iterator.next != null) {
            if (iterator.next.next == null) {
                int ans = iterator.next.val;
                iterator.next = null;
                return ans;
            }
        }
        LinkedList temp = node;
        if (temp != null && temp.next == null) {
            return temp.val;
        }
    return 0;
    }

    @Override
    public boolean isEmpty() {
        return node == null;
    }
}

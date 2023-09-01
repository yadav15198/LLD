package Task1StackImplentaionUsingInterface;

public class Client {
    public static void main(String[] args) {
        Stack st = new ArrayStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        st.pop();
        st.push(10);
        System.out.println(st.pop());

        Stack LinkStack = new ArrayStack();
        LinkStack.push(1);
        LinkStack.push(2);
        LinkStack.push(3);
        LinkStack.push(4);

        LinkStack.pop();
        LinkStack.push(10);
        System.out.println(LinkStack.push(11));

    }
}

package Task1StackImplentaionUsingInterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayStack implements Stack {
    int currentIndex = -1;
    List<Integer> arr = new ArrayList<>();
    @Override
    public int push(int num) {
        arr.add(num);
        currentIndex+=1;
        return num;
    }

    @Override
    public int pop() {
        int num = arr.get(currentIndex);
        arr.remove(currentIndex);
        currentIndex-=1;
        return num;

    }

    @Override
    public boolean isEmpty() {
        return currentIndex == -1;
    }
}

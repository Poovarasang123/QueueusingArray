import java.util.*;
public class Demo {
    public static void main(String[] args) {
        QueueusingArray<Integer> que = new QueueusingArray<>();
        que.enqueue(9);
        que.enqueue(8);
        que.enqueue(3);
        System.out.println("Deleted val is "+que.dequeue());
    }
}

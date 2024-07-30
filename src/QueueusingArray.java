public class QueueusingArray <T>{
    static final int MAX_SIZE = 30;
    T arr[];
    int front,rear;

    QueueusingArray(){
        arr =  (T[]) new Object[MAX_SIZE];
        front = -1;
        rear = -1;
    }
    public void enqueue(T val){
        if(rear == MAX_SIZE-1){
            throw new IndexOutOfBoundsException("Queue is full");
        }
        if(front==-1)
            front++;
        arr[++rear] = val;
    }
    T dequeue(){
        if(front==-1 || front>rear)
            throw new IndexOutOfBoundsException("Queue is empty");
        return arr[front++];
    }
}

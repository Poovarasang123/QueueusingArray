public class QueueusingArraySpaceoptmized <T>{
    static final int MAX_SIZE = 30;
    T arr[];
    int rear;

    QueueusingArraySpaceoptmized(){
        arr =  (T[]) new Object[MAX_SIZE];
        rear = -1;
    }
    public void enqueue(T val){
        if(rear == MAX_SIZE-1){
            throw new IndexOutOfBoundsException("Queue is full");
        }
        arr[++rear] = val;
    }
    T dequeue(){
        if(rear==-1)
            throw new IndexOutOfBoundsException("Queue is empty");
        T temp = arr[0];
        for(int i=1;i<=rear;i++){
            arr[i-1] = arr[i];
        }
        rear--;
        return temp;
    }
     
}
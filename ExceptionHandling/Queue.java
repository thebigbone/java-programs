import java.util.*;

public class Queue {

    private static int front, rear, capacity;   
    private static int queue[];   
     
    Queue(int size) {   
        front = rear = 0;   
        capacity = size;   
        queue = new int[capacity];   
    }   

    static void queueEnqueue(int item)  {   
        if (capacity == rear) {   
            System.out.printf("\nQueue is full\n");   
            return;   
        }   
        else {
        queue[rear] = item;   
        rear++;   
        }   
    return;   
    }   
    
    static void queueDequeue()  {    
        if (front == rear) {   
            System.out.printf("\nQueue is empty\n");   
            return;   
        }   
        else {   
            for (int i = 0; i < rear - 1; i++) {   
                queue[i] = queue[i + 1];   
            }  
            if (rear < capacity)   
                queue[rear] = 0;      
            rear--;   
        }   
        return;   
    }
       
       
    static void queueDisplay()   
    {   
        int i;   
        if (front == rear) {   
            System.out.printf("Queue is Empty\n");   
            return;   
        }   
        for (i = front; i < rear; i++) {   
            System.out.printf(" %d , ", queue[i]);   
        }   
        return;   
    }   
}

//class Producer implements Runnable {

//}

class Queue1 {
    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.queueEnqueue(1);
        q.queueEnqueue(2);
        q.queueEnqueue(3);
        q.queueDisplay();
    }   
}
import java.util.*;

class Queue {

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

class Producer extends Thread implements Runnable {
    Producer() {
        setPriority(6);
    }
    public void run() {
        System.out.println("priority of consumer is: " + Thread.currentThread().getPriority());   
    }
}

class Consumer extends Thread implements Runnable {
    Consumer() {
        setPriority(4);
    }
    public void run() {
        System.out.println("priority of consumer is: " + Thread.currentThread().getPriority());
    }
}

class Queue1 extends Thread {
    public static void main(String[] args) {
        Queue q = new Queue(10);
        /*q.queueEnqueue(1);
        q.queueEnqueue(2);
        q.queueEnqueue(3);
        q.queueEnqueue(10);
        q.queueDequeue();
        q.queueDequeue();

        q.queueDisplay();
        */
        Queue1 qq = new Queue1();
        qq.setPriority(Thread.MAX_PRIORITY);
        Producer p = new Producer();
        Consumer c = new Consumer();
        p.start();
        c.start();
    }   

}
package day9;
public class QueueOperations {
    int front=-1;
    int rear=-1;
    int arr[] = new int[5];
    void en(int data){
        if(rear==arr.length-1){
            System.out.println("Queue Overflow");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear++;
        arr[rear]=data;
        System.out.println(arr[rear]+" inserted");
    }
    void de(){
        if(front==-1 || front > rear){
            System.out.println("Queue underflow");
            return;
        }
        System.out.println(arr[front]+" deleted");
        front++;
    }
    void peak(){
        if(front==-1 || front > rear){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(arr[front]+" : is peek value");
    }
    void display(){
        if(front == -1 || front > rear){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            if(i==rear)
                System.out.println(arr[i]);
            else
                System.out.println(arr[i]+"->");
        }
    }
    void count(){
        if(front == -1 || front > rear){
            System.out.println(" Total no of elements in queue: 0");
            return;
        }
        System.out.println(" Total no of elements in queue: " + (rear - front + 1));
    }
    public static void main(String[] args) {
        QueueOperations ob = new QueueOperations();
        ob.en(32); 
        ob.en(23); 
        ob.en(43); 
        ob.en(55); 
        ob.de();
        ob.de();
        ob.peak();
        ob.display();
        ob.count();
    }
}
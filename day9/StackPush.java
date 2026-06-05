package day9;
public class StackPush {
    int arr[] = new int[5];
    int top = -1;
    void push(int data)
    {
        if(top == arr.length-1)
        {
            System.out.println("Stack is full");
            return;
        }
       ++top;
       arr[top] = data;
       System.out.println(arr[top]);
    }
    public static void main(String[] args) {
        StackPush ob = new StackPush();
        ob.push(90);
        ob.push(910);
        ob.push(190);
        ob.push(210);
        ob.push(908);
        ob.push(600);
    }
}

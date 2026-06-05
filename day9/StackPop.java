package day9;
public class StackPop {
 int arr[] = new int[5];
    int top = -1;
    void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack underflow");
            return;
        }
        System.out.println(arr[top]+" deleted");
        top--;
    }

    void push(int data)
    {
        if(top == arr.length-1)
        {
            System.out.println("Stack is full");
            return;
        }
       ++top;
       arr[top] = data;
       System.out.println(arr[top]+" inserted");
    }
    void peak(){
        if(top == -1)
        {
            System.out.println("no values in stack");
            return;
        }
        System.out.println(arr[top]+" is peak element");
    }
    boolean search(int data)
    {
        if(top == -1)
        {
            return false;
        }
        for(int i=0;i<=top;i++)
        {
            if(arr[i] == data)
            {
                return true;
            }
        }
        return false;
    }
    void display()
    {
        if(top == -1)
        {
            System.out.println("no elements in stack");
            return;
        }
        for(int i=top;i>=0;i--)
        {
            if(i == 0)
            System.out.println(arr[i]);
        else
            System.out.println(arr[i]+"->");
        }
    }
    void Count()
    {
        System.out.println((top+1));
    }
    public static void main(String[] args) {
        StackPop ob = new StackPop();
        ob.push(90);
        ob.push(910);
        ob.push(190);
        ob.push(210);
        ob.push(908);
        ob.push(600);
        ob.pop();
        ob.pop();
        ob.peak();
        System.out.println(ob.search(908));
        ob.display();
        ob.Count();
    }
}

// StackTest.java
// Linked list implementation of Stack

class Stack {
    
    class Node {
        int data;
        Node next;  
    }
    private Node top;
      
    public Stack()
    { 
        top = null;
    }
        
    public void push(int x) {
        Node  t = new Node();
        t.data = x;
        t.next = top;
        top = t;
    }

    // pop() method here
    // only to be called if list is non-empty.
    // Otherwise an exception should be thrown.
    public int pop() //throws StackException 
    {
    //    if(this.isEmpty())
    //        throw new StackException("poop");
        int x = top.data;
        top = top.next;
        return x;
    }

    public boolean isEmpty()
    {
        return top == null;
    }

    public void display() {
        Node t = top;     
        System.out.println("\nStack contents are:  ");
        
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }        
        System.out.println("\n");
    }

}


public class StackTest
{
    public static void main( String[] arg){
        Stack s = new Stack();
        //Console.Write("Stack is created\n");
        System.out.println("Stack is created\n");
        
        s.push(10); s.push(3); s.push(11); s.push(7);
        s.display();
        {
        int i = s.pop();
        
        System.out.println("Just popped " + i);
        s.display();
        }
        {
            int i = s.pop();
            
            System.out.println("Just popped " + i);
            s.display();
        }
    }
}



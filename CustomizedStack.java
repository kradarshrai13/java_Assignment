/**
 *Exception to indicate that Stack is full.
 */
class StackFullException extends RuntimeException {
     
    public StackFullException(){
        super();
    }
    
    public StackFullException(String message){
        super(message);
    }
    
}
 
/**
 *Exception to indicate that Stack is empty.
 */
class StackEmptyException extends RuntimeException {
     
    public StackEmptyException(){
        super();
    }
    
    public StackEmptyException(String message){
        super(message);
    }
    
}
 
 
/**
 * Stack class
 */
class Stack {
    private int size;
    private int[] stackAr;
    private int top; // top of stack
 
    /**
     * Constructor for initializing Array.
     */
    public Stack(int size) {
           this.size = size;
           stackAr = new int[size]; // Creation of Stack array
           top = -1; // initialize Stack to with -1
    }
 
    /**
     * Push items in stack, it will put items on top of Stack.
     */
    public void push(int value){
           if(isFull()){
                  throw new StackFullException("Cannot push "+value+", Stack is full");
           }
           stackAr[++top] = value;
    }
 
    /**
     * Pop items in stack, it will remove items from top of Stack.
     */
    public int pop() {
           if(isEmpty()){
                  throw new StackEmptyException("Stack is empty");
           }
           return stackAr[top--]; // remove item and decrement top as well.
    }
 
    /**
     * @return true if Stack is empty
     */
    public boolean isEmpty() {
           return (top == -1);
    }
 
    /**
     * @return true if stack is full
     */
    
    public boolean isFull() {
           return (top == size - 1);
    }
 
}
 
 
/**
 *  StackExample - Main class
 */
public class CustomizedStack {
    public static void main(String[] args) {
           Stack stack = new Stack(10); // Creation of Stack
           stack.push(88);
           stack.push(90);
           stack.push(45);
           stack.push(61);
           stack.push(73);
 
           System.out.print("Popped items: ");
           System.out.print(stack.pop()+" ");
           System.out.print(stack.pop()+" ");
           System.out.print(stack.pop()+" ");
           System.out.print(stack.pop()+" ");
           System.out.print(stack.pop()+" ");
           
           
    }
 
}
 

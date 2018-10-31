
public class SetOfStacks {
    static int capacity = 100;//capacity for each stack
    int[] array = new int [300];
    
    int numInStack;
    
    public SetOfStacks() {
        numInStack = 0;
        array = new int[capacity];
        
    }
    
    public SetOfStacks(int beginCap) {
        numInStack = 0;
        array = new int[beginCap];
    }
    
    protected void moveStack() {
        int[] newStack = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newStack[i] = array[i];
        }
        array = newStack;
    }
    
    public void push(int element) {
        if (array.length == capacity) {
            moveStack();
        }
        array[numInStack] = element;
        numInStack++;
    }
    
    public int pop() throws Error {
        if (array.length == 0) {
            throw new Error("Next stack is empty");
        }
        numInStack--;
        int result = array[numInStack];
        array[numInStack] = 0;
        return result;
    }
    
//    public void popAt(int StackNumber) {
//        StackNumber.capacity;
//    }
    
}
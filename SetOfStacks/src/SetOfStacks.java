
public class SetOfStacks {
    static int capacity = 100;//capacity for each stack
    int[] array = new int [300];
    
    static int stack0 = -1;
    static int stack1 = -1;
    static int stack2 = -2;
    int stack;
    
    public static void main(String[] args) {
        int stack = stack0;
        if (capacity > 100) {
            stack = stack1;
            }
        
        }
    
    private int lastStack(int stackNumber) {
        switch (stackNumber) {
        case 0:
            return stackNumber * capacity + stack0;
        case 1:
            return stackNumber * capacity + stack1;
        case 2:
            return stackNumber * capacity + stack2;
        } 
        throw new Error("Unexpected stack num.");
        }//test
            
    public int push (int stackNumber, int element) {
        array[lastStack(stackNumber) + 1] = element;
        
        switch (stackNumber) {
        case 0:
            return stack0 + 1;      
        case 1:
            return stack1 + 1;
        case 2:
            return stack2 + 1;
            
        default:
            throw new Error("Unexpected stack num.");
        }
    }
    public int pop(int stackNumber) {
        switch(stackNumber) {
        case 0:
            return stack0 - 1;
        case 1:
            return stack1 - 1;
        case 2:
            return stack2 - 1;
            default:
                throw new Error("Unexpected stack num");
        }
    }
}
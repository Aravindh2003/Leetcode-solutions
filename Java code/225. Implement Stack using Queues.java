class MyStack {

    public int top;
    public int[] arr;
    public MyStack() {
        top = -1;
        arr = new int[100]; 
    }
    
    public void push(int x) {
        top++;
        arr[top] = x;
    }
    
    public int pop() {
        int temp = arr[top];
        top--;
        return temp;
    }
    
    public int top() {
        return arr[top]; 
    }
    
    public boolean empty() {
        return top == -1;
    }
}

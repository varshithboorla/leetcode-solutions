class MyQueue {
    Stack<Integer> s;
    Stack<Integer> o;
    public MyQueue() {
        s = new Stack<>();
        o = new Stack<>();
    }
    
    public void push(int x) {
        if(o.size()==0)
            s.push(x);
        else{
            while(o.size()!=0){
                s.push(o.pop());
            }
            s.push(x);
        }
    }
    
    public int pop() {
        if(s.size()==0&&o.size()==0) return -1;
        if(o.size()==0){
            while(s.size()!=0){
                o.push(s.pop());
            }
        }
        return o.pop();
    }
    
    public int peek() {
        if(s.size()==0&&o.size()==0) return -1;
        if(o.size()==0){
            while(s.size()!=0){
                o.push(s.pop());
            }
        }
        return o.peek();
    }
    
    public boolean empty() {
        return s.size()==0&&o.size()==0?true:false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
class BrowserHistory {
     
    Stack<String> history;
    Stack<String> back;
    
    public BrowserHistory(String homepage) {
        back = new Stack<>();
        history = new Stack<>();
        history.push(homepage);
    }
    
    public void visit(String url) {
        history.push(url);
        back.clear();
    }
    
    public String back(int steps) {
        int i=0;
        while(history.size() > 1 && i <steps )
        {
          back.push(history.pop()); 
          i++;
        }       
        return(history.peek());
    }
    
    public String forward(int steps) {
        int i=0;
        while( !back.isEmpty()  && i <steps )
        {
            history.push(back.pop());
            i++;
        } 
        return(history.peek()); 
    }
}
​
/**
 * Your BrowserHistory object will be instantiated and called as such:

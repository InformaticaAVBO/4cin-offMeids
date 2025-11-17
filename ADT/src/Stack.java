public class Stack {
    
        Stack<Integer> stack = new Stack<>();

        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        
        System.out.println("Top dello stack: " + stack.peek()); 

        
        int removed = stack.pop();
        System.out.println("Elemento rimosso: " + removed); 

        
        System.out.println("Lo stack è vuoto? " + stack.isEmpty()); 

       
        System.out.println("Pop: " + stack.pop()); 
        System.out.println("Pop: " + stack.pop()); 

        
        System.out.println("Lo stack è vuoto? " + stack.isEmpty()); 
    
}

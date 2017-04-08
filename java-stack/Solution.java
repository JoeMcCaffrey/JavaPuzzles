import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         Stack<Character> s1 = new Stack<>();
         String input=sc.next();
         if(input.length() % 2 == 1) {
             
             System.out.println("false");
         }
         else {
         
             for(int i=0; i< input.length(); i++) {
                 
                 char b = input.charAt(i);
                 
                 if(b == '{' || b== '[' || b == '(') {
                     s1.push(b);
                 }
                 else if(b == '}' && !s1.isEmpty() && s1.peek() == '{') {
                     s1.pop();
                 }
                 else if(b == ']' && !s1.isEmpty() && s1.peek() == '[') {
                     s1.pop();
                 }
                 else if(b == ')' && !s1.isEmpty() && s1.peek() == '(' ) {
                     s1.pop();
                 }
                 else{
                     s1.push(b);                     
                 }
             }
            System.out.println(s1.isEmpty());
             
         }
          
      }
      
   }
}


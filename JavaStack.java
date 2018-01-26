
/*
 *  In JavaStack class we create the main functions for our stack
 */

public class JavaStack{

	int maxSize;
	int top;
	char array[];
	
	/*
	 * Constructs a new stack array with a maximum size of 20 characters
	 */
	public JavaStack(int n){
		
		maxSize = n;
		top = 0;
		array = new char[maxSize];
		
	}
	

	/*
	 * if stack is empty returns true otherwise returns false
	 */
	public boolean empty(){
		
		if (top == 0){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	/*
	 * push a new character on top of the stack array
	 */
	public void push(char c){
		
		if (top < maxSize){
			array[top] = c;
			top++;
		}
		else{
			System.out.println("Stack Overflow! You must enter maximum 20 characters.");
		}
	}
	
	/*
	 * pop the last character from the top of the stack array
	 */
	public char pop(){
		
		char temp;
		
		if(top > 0){
			temp = array[top-1];
			array[top-1] = 0;  // set null at old price
			top--;
			return(temp);
		}
		else{
			System.out.println("Empty Stack! Not a balanced sentence!");
			return ('x');
		}
		
	}
	
	
	
	
}

import java.util.Scanner;

public class AdvantageProblem{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		JavaStack newStack = new JavaStack(20);
		
		String sentence;
		boolean result;
		//int i;
		//char open_br;
		
		Scanner s = new Scanner(System.in);
		
		do{
			System.out.println("Enter a sentence maximum 20 characters:");
			sentence = s.nextLine();
			
		}while(sentence.length() > 20);
		
		
	    result = checkBalance(sentence, newStack);
		if (result == true){
			System.out.println("You gave a balanced sentenced!");
		}
		else{
			System.out.println("Not a balanced sentenced!");
		}
		
	}
	
	/*
	 * This method checks if the sentence is balanced using the methods from JavaStack class.
	 */
	public static boolean checkBalance(String sen, JavaStack newStack){
		
		int i;
		char open_br;
		
		for (i = 0; i < sen.length(); i++){
			if ((sen.charAt(i) == '(') || (sen.charAt(i) == '{') || (sen.charAt(i) == '[')){
				newStack.push(sen.charAt(i));
			}
			if ((sen.charAt(i) == ')') || (sen.charAt(i) == '}') || (sen.charAt(i) == ']')){
				open_br = newStack.pop();
				if (((sen.charAt(i) == ')') && (open_br == '(')) || ((sen.charAt(i) == '}') && (open_br == '{')) || ((sen.charAt(i) == ']') && (open_br == '['))){
					continue;
				}
				else{
					return false;
					//break;
				}
			}
		}
		
		return true;
		
	}

}

import java.util.*;

public class polishParser {

	public static boolean isInteger(String string) {
		try {
			Integer.parseInt(string);
			return true;
		}
		catch (NumberFormatException n) {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String inputList[] = input.split("\\s+");
				
		
		for (int i = inputList.length - 1; i >= 0; i--) {
			if (isInteger(inputList[i])) {
					st.push(Integer.parseInt((inputList[i])));
			}
			else if (inputList[i].equals("+")) {
				st.push(st.pop()+st.pop());
			}
			else if (inputList[i].equals("-")) {
				st.push(st.pop()-st.pop());
			}
			else if (inputList[i].equals("x")) {
				st.push(st.pop()*st.pop());
			}	
		}
		System.out.println(st.pop());
		s.close();
	}
}
		


public class Tomas {

	public static boolean isLowerVowel(char x) {
		return x=='a' || x=='e'|| x=='i' || x=='o' || x=='u';
	}
	
	
	public static void main(String args[]) {
		System.out.println("A : " + Tomas.isLowerVowel('a'));
		System.out.println("X : " + Tomas.isLowerVowel('x'));
	}
	
}

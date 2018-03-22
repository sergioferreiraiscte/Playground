
public class Invocacao {

	public static int funcaoRecursiva(int x) {
		System.out.println("Entrei na função recursiva paarmetro : " + x);
		int y = x+1;
		System.out.println("Vou retornar : " + y);
		return y;
	}
	
	public  static void main(String args[]) {
		System.out.println("Vou Entrei no main");
		System.out.println("Um println");
		int z = funcaoRecursiva(2);
		System.out.println("Vou terminar main : " + z);
	}

}

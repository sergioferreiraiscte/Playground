import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MoedaAoAr {

	public static Moeda lancamento() {
		Random r = new Random();
		if ( r.nextBoolean() ) 
			return Moeda.CARA;
		else
			return Moeda.COROA;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quer escolher CARA ou COROA ? ");
		String linha = sc.nextLine();

		Moeda escolhido = Moeda.valueOf(linha);

		System.out.println("Quantos lançamentos? ");
		int n = sc.nextInt();

		ArrayList<Moeda> lancamentos = new ArrayList<Moeda>();
		int numAcertos = 0;
		for (int i = 0 ; i <= n ; i++ ) {
			Moeda resultado = MoedaAoAr.lancamento();
			if (resultado == escolhido)
				numAcertos++;
			lancamentos.add(resultado);
			System.out.println("Moeda lançada : " + resultado);
		}
		System.out.println("% acertos : " + numAcertos * 100 / n);

	}

}

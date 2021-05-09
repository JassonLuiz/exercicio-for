import java.util.Scanner;

public class exercicio_for {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o seu nome: ");
		String name = sc.nextLine();
		
		for(int i=0; i<10; i++) {
			System.out.println(name);
		}
		
		sc.close();
	}

}

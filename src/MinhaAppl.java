
import java.util.Scanner;
import java.util.InputMismatchException;

public class MinhaAppl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int a, b, r;
		String nome;
		int id;
		float preco;
		int opcao=1;
		
		r=0;
		
		
		do {
		try {
			//a = teclado.nextInt();
			//b = teclado.nextInt();
			//r=a/b;
			//System.out.println("voce deve digitar um valor inteiro");
			Produto p = new Produto();
			System.out.println("digit o ID");
			id = Integer.parseInt(teclado.nextLine());
			p.setId(id);
			
			System.out.println("digit o nome");
			nome = teclado.nextLine();
			p.setNome(nome);
			System.out.println("digit o preo");
			preco = Float.parseFloat(teclado.nextLine());
			p.setPreco(preco);
			System.out.println("continua 1 sim 0 nao");
			opcao = Integer.parseInt(teclado.nextLine());
		}
		catch (NumberFormatException e) {
			System.out.println("digit um valor valido");
			
		}
		catch (MyException e) {
			System.out.println("erro ao cadastrar produto " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("erro com usuario " + e.getMessage());
		}
	
		catch (Exception e){
			System.out.println (e.getClass().getName());
			System.out.println (e.getMessage());
		} 
		
		
		}while (opcao!=0);
			
		teclado.close();
	}

}

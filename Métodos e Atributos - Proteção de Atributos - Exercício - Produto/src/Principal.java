import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		//Importando um "Novo Scanner"
		Scanner in = new Scanner(System.in);
		
		//Instanciando um novo objeto (produto1)
		Produto produto1 = new Produto();
		
		//Mensagem para Usuário e Leitura de Variável (nome)
		System.out.println("Insira o Nome do Produto:");
		produto1.setNome(in.next());
		
		//Mensagem para Usuário e Leitura de Variável (precoCusto)
		System.out.println("Insira o Preço de Custo do Produto:");
		produto1.setPrecoCusto(in.nextDouble());
		
		//Mensagem para Usuário e Leitura de Variável (precoCusto)
		System.out.println("Insira o Preço de Venda do Produto:");
		produto1.setPrecoVenda(in.nextDouble());
		
		if(produto1.getPrecoCusto() >= produto1.getPrecoVenda()) {
			// Finalizada as operações
		} else {
			//calculo da margem de lucro
			produto1.calcularMargemLucro();
			
			//apresentação das informações do produto
			produto1.apresentarInformacoesProduto();
			
		}
		
		in.close();
	}
}
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		//Importando um "Novo Scanner"
		Scanner in = new Scanner(System.in);
		
		//Instanciando um novo objeto (produto1)
		Produto produto1 = new Produto();
		
		//Mensagem para Usu�rio e Leitura de Vari�vel (nome)
		System.out.println("Insira o Nome do Produto:");
		produto1.setNome(in.next());
		
		//Mensagem para Usu�rio e Leitura de Vari�vel (precoCusto)
		System.out.println("Insira o Pre�o de Custo do Produto:");
		produto1.setPrecoCusto(in.nextDouble());
		
		//Mensagem para Usu�rio e Leitura de Vari�vel (precoCusto)
		System.out.println("Insira o Pre�o de Venda do Produto:");
		produto1.setPrecoVenda(in.nextDouble());
		
		if(produto1.getPrecoCusto() >= produto1.getPrecoVenda()) {
			// Finalizada as opera��es
		} else {
			//calculo da margem de lucro
			produto1.calcularMargemLucro();
			
			//apresenta��o das informa��es do produto
			produto1.apresentarInformacoesProduto();
			
		}
		
		in.close();
	}
}
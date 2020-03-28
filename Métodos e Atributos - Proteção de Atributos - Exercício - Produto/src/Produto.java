import java.text.DecimalFormat;
public class Produto {
	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;
	
	//Importando um novo Decimal Format
	DecimalFormat df = new DecimalFormat("0.00");
	
	//Criando M�todos dos Tipos Get e Set para cada atributo da classe
	
	//Get para Nome
	public String getNome() {
		return nome;
	}
	//Set para Quantidade de Patas
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	//Get para Pre�o de Custo
	public double getPrecoCusto() {
		return precoCusto;
	}
	//Set para Pre�o de Custo
	public void setPrecoCusto (double precoCusto) {
		this.precoCusto = precoCusto;
	}
	
	//Get para Pre�o de Venda
	public double getPrecoVenda() {
		return precoVenda;
	}
	//Set para Pre�o de Venda
	public void setPrecoVenda (double precoVenda) {
		if (precoVenda == this.precoCusto) {
			System.out.println("O Pre�o de Venda � Igual ao Pre�o de Custo!\n");
			System.out.println("Reinicie o Programa e Modifique os Pre�os.");
		} else if (precoVenda > this.precoCusto){
			this.precoVenda = precoVenda;
		} else {
			System.out.println("O Pre�o de Venda � Menor do que o Pre�o de Custo!\n");
			System.out.println("Reinicie o Programa e Modifique os Pre�os.");
		}
	}
	
	//Get para Pre�o de Venda
	public double getMargemLucro() {
		return margemLucro;
	}
	
	//M�todo para Calcular Margem de Lucro
	public void calcularMargemLucro() {
		this.margemLucro = this.precoVenda - this.precoCusto;
	}
	
	//M�todo para Calcular a Margem de Lucro em Porcetagem
	public double getMargemLucroPercentual() {
		return margemLucro/(precoCusto/100);
	}
	
	//M�todo para Apresentar as Informa��es do Produto
	public void apresentarInformacoesProduto() {
		System.out.println("Nome do Produto: "+this.getNome());
		System.out.println("Valor de Custo do Produto: R$ " + this.getPrecoCusto());
		System.out.println("Valor de Venda do Produto: R$ " + this.getPrecoVenda());
		System.out.println("Margem de Lucro do Produto: R$ " + df.format(this.getMargemLucro()));
		System.out.println("Percentual da Margem de Lucro do Produto: " + df.format(this.getMargemLucroPercentual()) + " %");
	}
}
public class Animal {
	private int quantidadePatas;
	private String especie;
	private double pesoAnimal;
	
	//Criando M�todo Construtor com Par�metro
	public Animal (int quantidadePatas, String especie, double pesoAnimal) {
		this.quantidadePatas = quantidadePatas;
		this.especie = especie;
		this.pesoAnimal = pesoAnimal;
	}
	
	//Criando M�todos dos Tipos Get e Set para cada atributo da classe
	
	//Get para Quantidade de Patas
	public int getQuantidadePatas() {
		return quantidadePatas;
	}
	//Set para Quantidade de Patas
	public void setQuantidadePatas (int quantidadePatas) {
		this.quantidadePatas = quantidadePatas;
	}
	
	//Get para Esp�cie
	public String getEspecie() {
		return especie;
	}
	//Set para Esp�cie
	public void setEspecie (String especie) {
		this.especie = especie;
	}
	
	//Get para Peso do Animal
	public double getPesoAnimal() {
		return pesoAnimal;
	}
	//Set para Peso do Animal
	public void setPesoAnimal (double pesoAnimal) {
		this.pesoAnimal = pesoAnimal;
	}
	public void apresentarAnimal() {
		System.out.println("Quantidade de Patas do Animal: " +this.getQuantidadePatas()+" patas");
		System.out.println("Esp�cie do Animal: " +this.getEspecie());
		System.out.println("Peso do Animal: " +this.getPesoAnimal());
	}
}
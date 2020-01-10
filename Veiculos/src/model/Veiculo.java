package model;

public class Veiculo {

	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private double km;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;
	private boolean isligado;

	
	
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isIsligado() {
		return isligado;
	}

	public void setIsligado(boolean isligado) {
		this.isligado = isligado;
	}

	
	
	public void abastecer(int litros) {
		
		this.litrosCombustivel = this.litrosCombustivel + litros;

		if (this.litrosCombustivel <=100) {
	
			System.out.println("A quantidade de Combustivel é de: " + this.litrosCombustivel);

		} else {
			this.litrosCombustivel = this.litrosCombustivel - litros;
			
			System.out.println("Você excedeu o limite de 100 litros.");
		}

	}

	public void acelerar() {

		if (this.isligado == true && this.litrosCombustivel > 0) {

			this.velocidade = this.velocidade + 20;
			this.litrosCombustivel = this.litrosCombustivel - 1;

		} else {

			System.out.println("O carro está desligado, não é possivel acelerar");

		}

	}



}

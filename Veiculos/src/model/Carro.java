package model;

public class Carro extends Veiculo {

	private String portas;
	private int ano;
	
	
	

	public String getPortas() {
		return portas;
	}

	public void setPortas(String portas) {
		this.portas = portas;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
	
	public void abastecer(String litros) {
		
		this.setLitrosCombustivel(this.getLitrosCombustivel()+Integer.parseInt(litros));

		
		if (this.getLitrosCombustivel() <=100) {
			
			
			System.out.println("A quantidade de Combustivel é de: " + this.getLitrosCombustivel());

		} else {
			

			this.setLitrosCombustivel(this.getLitrosCombustivel()-Integer.parseInt(litros));
			System.out.println("Você excedeu o limite de 100 litros.");

	}



	}
	
	public void acelerar() {

		if (this.isIsligado()  == true && this.getLitrosCombustivel() > 0) {
			
			this.setVelocidade(this.getVelocidade() + 20);
			
			this.setLitrosCombustivel(this.getLitrosCombustivel() - 1);

		} else {

			System.out.println("O carro está desligado, não é possivel acelerar");

		}

	}


}

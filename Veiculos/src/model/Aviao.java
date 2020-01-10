package model;

public class Aviao extends Veiculo {

	private String tipo;
	private String uso;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}
	
	public void abastecer(int litros) {
		
		this.setLitrosCombustivel(this.getLitrosCombustivel()+litros);
		
		if (this.getLitrosCombustivel() <= 1000) {
			
			System.out.println("A quantidade de Combustivel é de: " + this.getLitrosCombustivel());

		} else {
			
			this.setLitrosCombustivel(this.getLitrosCombustivel()-litros);

			System.out.println("Você excedeu o limite de 1000 litros.");

		}

	}
	
	
	public void acelerar() {

		if (this.isIsligado()  == true && this.getLitrosCombustivel() > 0) {
			
			this.setVelocidade(this.getVelocidade() + 50);
			
			this.setLitrosCombustivel(this.getLitrosCombustivel() - 1);

		} else {

			System.out.println("O avião está desligado, não é possivel acelerar");

		}

	}

	
	

}

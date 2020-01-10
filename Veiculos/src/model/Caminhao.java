package model;

public class Caminhao extends Veiculo {
	
	
	
	public void abastecer(float litros) {

		this.setLitrosCombustivel(this.getLitrosCombustivel()+(int)litros);
		if (this.getLitrosCombustivel() < 101) {

			System.out.println("A quantidade de Combustivel � de: " + this.getLitrosCombustivel());

		} else {
			
			this.setLitrosCombustivel(this.getLitrosCombustivel()-(int)litros);
			System.out.println("Voc� excedeu o limite de 100 litros.");

		}

	}
	
	
	public void acelerar() {

		if (this.isIsligado()  == true && this.getLitrosCombustivel() > 0) {
			
			this.setVelocidade(this.getVelocidade() + 50);
			
			this.setLitrosCombustivel(this.getLitrosCombustivel() - 1);

		} else {

			System.out.println("O caminh�o est� desligado, n�o � possivel acelerar");

		}

	}

}

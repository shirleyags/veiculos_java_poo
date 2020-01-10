package main;

import model.Aviao;
import model.Caminhao;
import model.Carro;


public class Main {

	public static void main(String[] args) {
		
		
		Carro carro = new Carro();
		carro.acelerar();
		carro.abastecer(200);
		
		Aviao aviao = new Aviao();
		aviao.acelerar();
		aviao.abastecer(3000);
		
		Caminhao caminhao = new Caminhao();
		caminhao.acelerar();
		caminhao.abastecer(101);
		
		

	}

}

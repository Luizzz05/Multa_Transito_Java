package model;

public class Carro {

	private String modelo;
	private String placa;
	private int ano;
	private String cor;
	private int velocidadeCarro;
	
	public Carro() {
		super();

	}
	public Carro(String modelo, String placa, int ano, String cor, int velocidadeCarro) {
		super();
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.cor = cor;
		this.velocidadeCarro = velocidadeCarro;
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
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getVelocidadeCarro() {
		return velocidadeCarro;
	}
	public void setVelocidadeCarro(int velocidadeCarro) {
		this.velocidadeCarro = velocidadeCarro;
	}

}

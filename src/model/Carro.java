package model;

public class Carro {

	private String modelo;
	private String placa;
	private String ano;
	private String cor;
	private String velocidadeCarro;
	
	public Carro() {
		super();

	}
	public Carro(String modelo, String placa, String ano, String cor, String velocidadeCarro) {
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
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getVelocidadeCarro() {
		return velocidadeCarro;
	}
	public void setVelocidadeCarro(String velocidadeCarro) {
		this.velocidadeCarro = velocidadeCarro;
	}

}

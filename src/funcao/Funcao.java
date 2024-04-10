package funcao;

import javax.swing.JOptionPane;

import model.Carro;

public class Funcao {

	static Carro c = new Carro();
	public void printcarro() {
		int ano, velocidadeCarro;
		String sano, svelocidadeCarro;
		
		c.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro: "));
		c.setPlaca(JOptionPane.showInputDialog("Digite a Placa do carro: "));
		sano = JOptionPane.showInputDialog("Digite o ano de fabricação: ");
		c.setAno(ano = Integer.parseInt(sano));
		c.setCor(JOptionPane.showInputDialog("Digite a cor do carro: "));
		svelocidadeCarro = JOptionPane.showInputDialog("Digite a velocidade do carro: ");
		c.setVelocidadeCarro(Integer.parseInt(svelocidadeCarro));
		
		
		JOptionPane.showMessageDialog(null, "Os dados co carro são: Modelo: "+ c.getModelo()
																	+ " Placa: " + c.getPlaca()
																	+ " Ano: "+ c.getAno()
																	+ " Cor: " + c.getCor()
																	+ " Velocidade: " + c.getVelocidadeCarro());
	}
	
	   public static void multaTransito() {
	    	int velocidadeVia = 80;
	        int velocidadeExcedida = c.getVelocidadeCarro() - velocidadeVia;
	        if (velocidadeExcedida > 0) {
	            double multa = calcularMulta(velocidadeExcedida, velocidadeExcedida);
	            JOptionPane.showMessageDialog(null, "Multa a ser paga: R$" + multa);
	        } else {
	        	JOptionPane.showMessageDialog(null, "O carro está dentro do limite de velocidade.");
	        }
	    }

	    public static double calcularMulta(int velocidadeExcedida, int velocidadeVia) {
	        double multa;
	        if (velocidadeExcedida <= 10) {
	            multa = 130.00;
	        } else if (velocidadeExcedida <= 20) {
	            multa = 230.00;
	        } else if (velocidadeExcedida <= 30) {
	            multa = 580.00;
	        } else {
	            multa = 967.52;
	        }
	        return multa;
	    }
}

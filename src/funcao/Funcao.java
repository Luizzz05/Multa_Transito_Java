package funcao;

import javax.swing.JOptionPane;

import model.Carro;

public class Funcao {

	static Carro c = new Carro();
	
	
	   public static void multaTransito() {
	    	int velocidadeVia = 80;
	        int velocidadeExcedida = c.getVelocidadeCarro() - velocidadeVia;
	        if (velocidadeExcedida > 0) {
	            double multa = calcularMulta(velocidadeExcedida, velocidadeExcedida);
	            JOptionPane.showMessageDialog(null, "Multa a ser paga: R$" + multa);
	        } else {
	        	JOptionPane.showMessageDialog(null, "O carro está dentro do limite de velocidade." + c.getModelo());
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

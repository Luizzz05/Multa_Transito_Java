package funcao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import model.Carro;


public class Arquivo {
	
	static Carro c = new Carro();
    public void readCarro(String arquivo) {
        File path = new File("/home/luiz/Documentos/eclipse-workspace/Atividade_Java/src/Temp/" + arquivo);
        Scanner read = null;
        try {
            read = new Scanner(path);
            StringBuilder conteudo = new StringBuilder();
            while (read.hasNextLine()) {
                conteudo.append(read.nextLine()).append("\n"); // Adiciona cada linha ao StringBuilder
                
            }
            JOptionPane.showMessageDialog(null, conteudo.toString(), "Relatório das Multas", JOptionPane.INFORMATION_MESSAGE); // Exibe o conteúdo completo do arquivo
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            if (read != null) {
                read.close();
            }
        }
    }
	public void writeCarro(String arquivo, double multa) throws IOException{
		String path = "/home/luiz/Documentos/eclipse-workspace/Atividade_Java/src/Temp/" + arquivo;
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
			
			
			c.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro: "));
			c.setPlaca(JOptionPane.showInputDialog("Digite a Placa do carro: "));
			c.setAno(JOptionPane.showInputDialog("Digite o ano de fabricação: "));
			c.setCor(JOptionPane.showInputDialog("Digite a cor do carro: "));
			c.setVelocidadeCarro(JOptionPane.showInputDialog("Digite a velocidade do carro: "));

	        int velocidadeVia = 80; // velocidade máxima permitida
	        int velocidadeCarro = Integer.parseInt(c.getVelocidadeCarro());
	        int velocidadeExcedida = velocidadeCarro - velocidadeVia;


	        if (velocidadeExcedida > 0) {
	            multa = calcularMulta(velocidadeExcedida, velocidadeVia);
	        }
			
			bw.write(c.getModelo());
			bw.write("; ");
			bw.write(c.getPlaca());
			bw.write("; ");
			bw.write(c.getAno());
			bw.write("; ");
			bw.write(c.getCor());
			bw.write("; ");
			bw.write(c.getVelocidadeCarro());
			bw.write("; ");
			bw.write(String.valueOf(multa)); // Escreve o valor da multa no arquivo
            bw.write("\n");
			
			
			bw.close();
						
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void printCarro() {
		
		JOptionPane.showMessageDialog(null, "Modelo: "+ c.getModelo()
											+ "\nPlaca: " + c.getPlaca()
											+ "\nAno: "+ c.getAno()
											+ "\nCor: " + c.getCor()
											+ "\nVelocidade: " + c.getVelocidadeCarro(),
											"As informações do carro são: ", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void multaTransito(){
    	int velocidadeVia = 80;
        int velocidadeExcedida = Integer.parseInt(c.getVelocidadeCarro()) - velocidadeVia;
        if (velocidadeExcedida > 0) {
            double multa = calcularMulta(velocidadeExcedida, velocidadeVia);
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

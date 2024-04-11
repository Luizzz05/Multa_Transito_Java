package funcao;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Carro;


public class Arquivo {
	
	static Carro c = new Carro();
	List<Carro> list = new ArrayList<>();
	public void readCarro(String arquivo) throws IOException {
		String path = "/home/luiz/Documentos/eclipse-workspace/Atividade_Java/src/Temp/multas.csv" + arquivo;//Simplificado
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){ //Simplificado
			String line = br.readLine(); //Simplificado
			line = br.readLine();
			while(line != null) { //Simplificado
//				JOptionPane.showMessageDialog(null, line); //Simplificado
				
				String[] vect = line.split(";");
				String modelo = vect[0];
				String placa = vect[1];
				String ano = vect[2];
				String cor = vect[3];
				String velocidadeCarro = vect[4];
				Double calcularMulta = Double.parseDouble(vect[5]);
				
				Carro prod = new Carro(modelo, placa, ano, cor, velocidadeCarro);
				
				list.add(prod);
				
				line = br.readLine(); //Simplificado
				
			}
			System.out.println("Informação da multa");
			for(Carro c :list) {
				JOptionPane.showMessageDialog(null, c);
			}
			
		}
	}
	
	public void writeCarro(String arquivo, int multa) throws IOException{
		String path = "/home/luiz/Documentos/eclipse-workspace/Atividade_Java/src/Temp/" + arquivo;
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
			
			
			c.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro: "));
			c.setPlaca(JOptionPane.showInputDialog("Digite a Placa do carro: "));
			c.setAno(JOptionPane.showInputDialog("Digite o ano de fabricação: "));
			c.setCor(JOptionPane.showInputDialog("Digite a cor do carro: "));
			c.setVelocidadeCarro(JOptionPane.showInputDialog("Digite a velocidade do carro: "));

			
			bw.write(c.getModelo());
			bw.write(";");
			bw.write(c.getPlaca());
			bw.write(";");
			bw.write(c.getAno());
			bw.write(";");
			bw.write(c.getCor());
			bw.write(";");
			bw.write(c.getVelocidadeCarro());
			
			bw.write("\n");
			bw.close();
						
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void printcarro() {
		
		JOptionPane.showMessageDialog(null, "Os dados co carro são: Modelo: "+ c.getModelo()
																	+ " Placa: " + c.getPlaca()
																	+ " Ano: "+ c.getAno()
																	+ " Cor: " + c.getCor()
																	+ " Velocidade: " + c.getVelocidadeCarro());
	}

	public static void multaTransito(){
    	int velocidadeVia = 80;
        int velocidadeExcedida = Integer.parseInt(c.getVelocidadeCarro()) - velocidadeVia;
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

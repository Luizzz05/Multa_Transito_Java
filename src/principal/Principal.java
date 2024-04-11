package principal;

import java.io.IOException;
import javax.swing.JOptionPane;

import funcao.Arquivo;
import funcao.Funcao;
import model.Carro;

public class Principal {

	public static void main(String[] args) throws  IOException {
		String arquivo;
        Carro carro = new Carro();
        Arquivo arq =new Arquivo();
      
      
        
        arquivo = JOptionPane.showInputDialog("Digite o caminho e o nome do arquivo. exemplo: ''ini.txt'': ");
        arq.writeCarro(arquivo);
        arq.printcarro();
        arq.multaTransito();
        arq.readCarro(arquivo);
        System.out.println("");
    }

 
}


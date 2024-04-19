package principal;

import java.io.IOException;
import javax.swing.JOptionPane;

import funcao.Arquivo;
import model.Carro;

public class Principal {

	public static void main(String[] args) throws IOException {
        String arquivo;
        Arquivo arq = new Arquivo();

        arquivo = JOptionPane.showInputDialog("Digite o caminho e o nome do arquivo, por exemplo: ''ini.txt'': ");
        arq.writeCarro(arquivo, 0);
        arq.printCarro();
        arq.multaTransito();
        arq.readCarro(arquivo);
    }
}


package Telas;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.File;
import java.awt.Container;
import java.awt.event.ActionListener;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import metodos.somEfeito;

public class Som{
    JFrame tela;
    Container cont;
    JPanel botaoJPanel;
    JButton somBotao;
    String clickSom;
    somEfeito se = new somEfeito();
    botaoManipulador bM = new botaoManipulador();


    public static void main(String[] args) {
        new Som();
    }

    public Som() {
        tela = new JFrame();
        tela.setSize(800,600);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.getContentPane().setBackground(Color.black);
        cont = tela.getContentPane();
        tela.setLayout(null);
        tela.setVisible(true);


        botaoJPanel = new JPanel();
        botaoJPanel.setBounds(300,300,200,100);
        botaoJPanel.setBackground(Color.black);
        cont.add(botaoJPanel);

        somBotao = new JButton("TESTE SOM");
        somBotao.setFocusPainted(false);
        somBotao.addActionListener(bM);
        botaoJPanel.add(somBotao);

        clickSom = ".//res//res//audio//dado.mp3";
    }
    public class botaoManipulador implements ActionListener{
    	public void ActionPerformed(ActionEvent event) {
    		se.setFile(clickSom);
    		se.play();
    	}
    }
}


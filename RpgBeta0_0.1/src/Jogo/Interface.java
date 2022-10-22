package Jogo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Jogo.Jogo.EscolhaManipulador;

public class Interface {
	JFrame tela;
	JPanel tituloNomePanel, botaoInicioPanel, textoPrincipalPanel, botaoAcaoPanel;
	public JPanel playerPanel;
	public JLabel tituloNomeLabel, vidaLabel, numeroVidaLabel, armaLabel, nomeArmaLabel;
	public JButton botaoInicio, escolha1, escolha2, escolha3, escolha4;
	Font fonteNormal = new Font("Times New Roman", Font.PLAIN, 28);
	Font tituloFonte = new Font("Times New Roman", Font.PLAIN, 90);
	public JTextArea areaPrincipalTexto;
	Container Cont;
	
	
	public void criatTela(EscolhaManipulador eManipulador, foto ft) {
		tela = new JFrame();
		tela.setSize(800,600);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.getContentPane().setBackground(Color.black);
		tela.setLayout(null);
		tela.setVisible(true);
		Cont = tela.getContentPane();
		
//Titulo da Tela inicial 
		
		tituloNomePanel = new JPanel();
		tituloNomePanel.setBounds(100, 100, 600, 150);
		tituloNomePanel.setBackground(Color.black);
		tituloNomeLabel = new JLabel("ADM TEC");
		tituloNomeLabel.setForeground(Color.white);
		tituloNomeLabel.setFont(tituloFonte);		

		
//Botao de inicio conteiner
		
		botaoInicioPanel = new JPanel();
		botaoInicioPanel.setBounds(300,400,200,100);
		botaoInicioPanel.setBackground(Color.black);

//Botao
		
		botaoInicio = new JButton("Inicio");
		botaoInicio.setBackground(Color.black);
		botaoInicio.setForeground(Color.white);
		botaoInicio.setFont(fonteNormal);
		botaoInicio.addActionListener(eManipulador);
		botaoInicio.setActionCommand("start");
		botaoInicio.setFocusPainted(false);

		tituloNomePanel.add(tituloNomeLabel);
		botaoInicioPanel.add(botaoInicio);
		
		Cont.add(tituloNomePanel);
		Cont.add(botaoInicioPanel);
		
		textoPrincipalPanel = new JPanel();
		textoPrincipalPanel.setBounds(50,350,430,250);
		textoPrincipalPanel.setBackground(Color.black);
		Cont.add(textoPrincipalPanel);
		
//Area possivel para o texto
		
		areaPrincipalTexto = new JTextArea("Teste");
		areaPrincipalTexto.setEditable(false);
		areaPrincipalTexto.setBounds(50,350,430,250);
		areaPrincipalTexto.setBackground(Color.black);
		areaPrincipalTexto.setForeground(Color.white);
		areaPrincipalTexto.setFont(fonteNormal);
		areaPrincipalTexto.setLineWrap(true);
		textoPrincipalPanel.add(areaPrincipalTexto);
		
		botaoAcaoPanel = new JPanel();
		botaoAcaoPanel.setBounds(500,350,250,150);
		botaoAcaoPanel.setBackground(Color.black);
		botaoAcaoPanel.setLayout(new GridLayout(4,1));
		Cont.add(botaoAcaoPanel);
		
//Escolhas 1,2,3 e 4
		
		escolha1 = new JButton("Atacar");
		escolha1.setBackground(Color.black);
		escolha1.setForeground(Color.white);
		escolha1.setFont(fonteNormal);
		escolha1.setFocusPainted(false);
		escolha1.addActionListener(eManipulador);
		escolha1.setActionCommand("e1");
		botaoAcaoPanel.add(escolha1);
		
		escolha2 = new JButton("Itens");
		escolha2.setBackground(Color.black);
		escolha2.setForeground(Color.white);
		escolha2.setFont(fonteNormal);
		escolha2.setFocusPainted(false);
		escolha2.addActionListener(eManipulador);
		escolha2.setActionCommand("e2");
		botaoAcaoPanel.add(escolha2);
		
		escolha3 = new JButton("Defender");
		escolha3.setBackground(Color.black);
		escolha3.setForeground(Color.white);
		escolha3.setFont(fonteNormal);
		escolha3.setFocusPainted(false);
		escolha3.addActionListener(eManipulador);
		escolha3.setActionCommand("e3");
		botaoAcaoPanel.add(escolha3);
		
		escolha4 = new JButton("Fugir");
		escolha4.setBackground(Color.black);
		escolha4.setForeground(Color.white);
		escolha4.setFont(fonteNormal);
		escolha4.setFocusPainted(false);
		escolha4.setActionCommand("e4");
		escolha4.addActionListener(eManipulador);
		botaoAcaoPanel.add(escolha4);
		
//Player
		
		playerPanel = new JPanel();
		playerPanel.setBounds(500,100,270,50);
		playerPanel.setBackground(Color.black);
		playerPanel.setLayout(new GridLayout(2,2));
		Cont.add(playerPanel);
		
//Status
		
		vidaLabel = new JLabel("Vida:");
		vidaLabel.setFont(fonteNormal);
		vidaLabel.setForeground(Color.white);
		playerPanel.add(vidaLabel);
		
		numeroVidaLabel = new JLabel();
		numeroVidaLabel.setFont(fonteNormal);
		numeroVidaLabel.setForeground(Color.white);
		playerPanel.add(numeroVidaLabel);
		
		armaLabel = new JLabel("Arma:");
		armaLabel.setFont(fonteNormal);
		armaLabel.setForeground(Color.white);
		playerPanel.add(armaLabel);
		
		nomeArmaLabel = new JLabel();
		nomeArmaLabel.setFont(fonteNormal);
		nomeArmaLabel.setForeground(Color.white);
		playerPanel.add(nomeArmaLabel);

	//imagem
		Cont.add(ft.fotoJPanel);

	}
}

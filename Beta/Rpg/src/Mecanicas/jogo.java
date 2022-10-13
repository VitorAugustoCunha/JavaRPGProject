package Mecanicas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Event;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class jogo {
	
//Variaveis
	JFrame tela;
	Container Cont;
	JPanel tituloNomePanel, botaoInicioPanel, textoPrincipalPanel, botaoAcaoPanel, playerPanel;
	JLabel tituloNomeLabel, vidaLabel, numeroVidaLabel, armaLabel, nomeArmaLabel;
	Font tituloFonte = new Font("Times New Roman", Font.PLAIN, 90);
	JButton botaoInicio, escolha1, escolha2, escolha3, escolha4;
	Font fonteNormal = new Font("Times New Roman", Font.PLAIN, 28);
	JTextArea areaPrincipalTexto;
	TituloTelaManipulador ttManipulador = new TituloTelaManipulador();
	int vidaPlayer, vidaMonstro;
	String armaPlayer, posicao;
	EscolhaManipulador eManipulador = new EscolhaManipulador();
	
//Princiapal
	
	public static void main(String[] args) {
		new jogo();
		
	}
		
		public jogo(){
			
//Funções
			
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
			botaoInicio.addActionListener(ttManipulador);
			botaoInicio.setFocusPainted(false);

			tituloNomePanel.add(tituloNomeLabel);
			botaoInicioPanel.add(botaoInicio);
			
			Cont.add(tituloNomePanel);
			Cont.add(botaoInicioPanel);
		}

//Metodos principal do jogo, o jogo em si
		
	public void criarTelaJogo(){
		
//Tela do jogo
		
		tituloNomePanel.setVisible(false);
		botaoInicioPanel.setVisible(false);
		
		textoPrincipalPanel = new JPanel();
		textoPrincipalPanel.setBounds(100,100,600,150);
		textoPrincipalPanel.setBackground(Color.black);
		Cont.add(textoPrincipalPanel);
		
//Area possivel para o texto
		
		areaPrincipalTexto = new JTextArea("");
		areaPrincipalTexto.setBounds(100,100,600,150);
		areaPrincipalTexto.setBackground(Color.black);
		areaPrincipalTexto.setForeground(Color.white);
		areaPrincipalTexto.setFont(fonteNormal);
		areaPrincipalTexto.setLineWrap(true);
		textoPrincipalPanel.add(areaPrincipalTexto);
		
		botaoAcaoPanel = new JPanel();
		botaoAcaoPanel.setBounds(250,350,300,150);
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
		playerPanel.setBounds(100,15,600,50);
		playerPanel.setBackground(Color.black);
		playerPanel.setLayout(new GridLayout(1,4));
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
		
		metodosPlaye();
	}
	
//player metodos (criar uma nova classe para botar os metodos)
//Referente a historia
	
	public void metodosPlaye(){
		vidaPlayer = 10;
		armaPlayer = "Espada";
		vidaMonstro = 20;
		
		nomeArmaLabel.setText(armaPlayer);
		numeroVidaLabel.setText("" + vidaPlayer);
		portao();
	}
	
	public void ganhou() {
		
	}
	
	public void perdeu() {
		posicao = "perdeu";
		areaPrincipalTexto.setText("THE END MORREU");
		
		escolha1.setText("Reiniciar");
		escolha2.setText("");
		escolha3.setText("");
		escolha4.setText("");
	}
	
	public void portao() {
		posicao = "portao";
		areaPrincipalTexto.setText("TESTE Chegaste na cidade o que você fará?");
		
		escolha1.setText("Falar com guarda");
		escolha2.setText("Usar sua espada");
		escolha3.setText("Cagar na frente");
		escolha4.setText("Andar");
	
	}
	
	public void falarGuarda() {
		posicao = "falarGuarda";
		areaPrincipalTexto.setText("Segiondo");
		
		escolha1.setText("falar ola");
		escolha2.setText("legal");
		escolha3.setText("bala");
		escolha4.setText("Andar");
	
	}
	
	public void boss() {
		posicao = "boss";
		areaPrincipalTexto.setText("BOOOOOOOOOOOOOSSSS");
		
		escolha1.setText("lutar");
		escolha2.setText("correr");
		escolha3.setText("");
		escolha4.setText("");
	
	}
	
	public void luta() {
		posicao = "luta";
		areaPrincipalTexto.setText("Vida do monstro:" + vidaMonstro + "\n\n O Que vai fazer?");
		
		escolha1.setText("atacar");
		escolha2.setText("correr");
		escolha3.setText("");
		escolha4.setText("");
	
	}
	
	public void danoPlayer() {
		posicao = "atacar";
		int playerDano = 0;
		
		if(armaPlayer.equals("Espada")) {
			playerDano = new java.util.Random().nextInt(5);
		}
		else if(armaPlayer.equals("Espada Lonahga")) {
			playerDano = new java.util.Random().nextInt(10);
		}
		
		areaPrincipalTexto.setText("Seu dano foi "+ playerDano);
		
		vidaMonstro = vidaMonstro - playerDano;
		escolha1.setText(">");
		escolha2.setText("");
		escolha3.setText("");
		escolha4.setText("");
		
	}
	
	public void danoMonstro(){
		posicao = "defender";
		int monstroDano = 0;
		monstroDano = new java.util.Random().nextInt(9);
		
		areaPrincipalTexto.setText("O monstro atacou voce e voce sofreu " + monstroDano);
		
		vidaPlayer = vidaPlayer - monstroDano;
		numeroVidaLabel.setText("" + vidaPlayer);
		
		escolha1.setText(">");
		escolha2.setText("");
		escolha3.setText("");
		escolha4.setText("");
	}
	
	
//Click funcao

	public class TituloTelaManipulador implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			criarTelaJogo();
			
		}
	}
	
	public class EscolhaManipulador implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			String suaEscolha = event.getActionCommand();
			
			switch(posicao){
			case "portao":
				switch(suaEscolha){
				case "e1": falarGuarda(); break;
				case "e2": break;
				case "e3": break;
				case "e4": break;
				}
				break;
			case "falarGuarda":
				switch(suaEscolha) {
				case "e1": break;
				case "e2": break;
				case "e3": boss(); break;
				case "e4": break;
				}
				break;
			case "boss":
				switch(suaEscolha) {
				case "e1": luta(); break;
				case "e2": falarGuarda(); break;
				case "e3": break;
				case "e4": break;
				}
				break;
			case "luta":
				switch(suaEscolha){
				case "e1": danoPlayer();
				case "e2": break;
				case "e3": break;
				case "e4": break;
				}
				break;
			case "atacar":
				switch(suaEscolha){
				case "e1": danoMonstro();
				case "e2": break;
				case "e3": break;
				case "e4": break;
				}
				break;
			case "defender":
				switch(suaEscolha) {
				case "e1": 
					if(vidaPlayer<1){
						perdeu();
					}
					luta(); break;
				case "e2": break;
				case "e3": break;
				case "e4": break;
				}
				break;
			case "perdeu":
				switch(suaEscolha){
				case "e1": break;
				case "e2": portao();break;
				case "e3": break;
				case "e4": break;
				}
				break;
			
			}
			
			
		}
	}
	
}

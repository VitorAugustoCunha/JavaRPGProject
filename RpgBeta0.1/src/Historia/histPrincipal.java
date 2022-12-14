package Historia;


import javax.swing.ImageIcon;

import Armas.canivete;
import Armas.espadaLonga;
import Jogo.Interface;
import Jogo.Jogo;
import Jogo.foto;
import Jogo.player;
import Jogo.visibilidadeControlador;
import Monstros.SuperMonstros;
import Monstros.goblin;

public class histPrincipal {
	Jogo jogo;
	Interface inter;
	visibilidadeControlador vc;
	player player = new player();
	SuperMonstros monstro;
	foto ft;
	
	
	
	public histPrincipal(Jogo j, Interface gameInterface, visibilidadeControlador vControlador, foto ftFoto) {
		jogo = j;
		inter = gameInterface;
		vc = vControlador;
		ft = ftFoto;
	}
	
	public void padraoSetup() {
		player.vidaPlayer = 10;
		inter.numeroVidaLabel.setText(""+player.vidaPlayer);
		
		player.armaAtual = new canivete();
		inter.nomeArmaLabel.setText(player.armaAtual.nomeArma);
		player.amuleto = 0;
	}
	public void escolherPossicao(String novaPissicao) {
		switch(novaPissicao) {
		case "ini1": ini1(); break;
		case "ini2": ini2(); break;
		case "ini3": ini3(); break;
		case "ini4": ini4(); break;
		case "ini5": ini5(); break;
		case "ini6": ini6(); break;
		case "ini7": ini7(); break;
		case "ini8": ini8(); break;
		case "ini9": ini9(); break;
		case "ficar": ficar(); break;
		case "fim": fim(); break;
		case "sair": sair(); break;
		case "sairSFalar": sairSFalar(); break;
		case "pegarArma": pegarArma(); break;
		case "cena2": cena2(); break;
		case "praia": praia(); break;
		case "lutar1": lutar1(); break;
		case "lutar2": lutar2(); break;
		case "ataque1": ataque1(); break;
		case "vitoria1": vitoria1(); break;
		case "derrota": derrota(); break;
		case "vitoria1cont": vitoria1cont(); break;
		case "paraTitulo": paraTitulo(); break;
		case "desarmado": desarmado(); break;
		case "fugir1": fugir1(); break;
		case "florestaChamas": florestaChamas(); break;
		case "fc1": fc1(); break;
		case "fc2": fc2(); break;
		case "praia1": praia1(); break;
		case "praia2": praia2(); break;
		case "final1": final1(); break;
		case "atacargp": atacargp(); break;
		case "t1": t1(); break;
		case "t2": t2(); break;
		case "final2": final2(); break;
		case "negociar": negociar(); break;
		case "assustar": assustar(); break;
		}
	}
	public void paraTitulo() {
		padraoSetup();
		vc.MostrarTitulo();
	}
	public void derrota() {
		ft.imagemICone = new ImageIcon(".//res//17.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		inter.areaPrincipalTexto.setText("Voc?? morreu \nGame over");
		player.amuleto = player.amuleto + 1;

		inter.escolha1.setText("Ir para tela de inicio");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		inter.escolha2.setVisible(false);
		inter.escolha3.setVisible(false);
		inter.escolha4.setVisible(false);
		jogo.novaPosicao1 = "paraTitulo";
		jogo.novaPosicao2 = "";
		jogo.novaPosicao3 = "";
		jogo.novaPosicao4 = "";
		jogo.novaPosicao1 = "paraTitulo";
	}
	public void playerLuta() {
		int playerDamage = new java.util.Random().nextInt(player.armaAtual.danoArma);
		
		if(player.armaAtual.equals("Canivete")) {
			playerDamage = new java.util.Random().nextInt(3);
		}
		else if (player.armaAtual.equals("Luva")) {
			playerDamage = new java.util.Random().nextInt(1);
		}
		inter.areaPrincipalTexto.setText("Voc?? atacou o "+monstro.nomeMonstro+" e deu "+playerDamage+" no alvo");
		monstro.vidaMonstro = monstro.vidaMonstro - playerDamage;

		inter.escolha1.setText(">");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");

		if(monstro.vidaMonstro > 0){
			jogo.novaPosicao1 = "atacarMostro";
			jogo.novaPosicao2 = "";
			jogo.novaPosicao3 = "";
			jogo.novaPosicao4 = "";
		}
		else if(monstro.vidaMonstro < 0){
			jogo.novaPosicao1 = "vitoria";
			jogo.novaPosicao2 = "";
			jogo.novaPosicao3 = "";
			jogo.novaPosicao4 = "";
		}
	}

	public void ini1(){
		ft.imagemICone = new ImageIcon(".//res//1.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("Era uma vez um pequeno macaquinho\nque habitava em uma ilha l?? ele\ntinha uma casa na maior das ??rvores");
		inter.escolha1.setText(">");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		inter.escolha2.setVisible(false);
		inter.escolha3.setVisible(false);
		inter.escolha4.setVisible(false);
		inter.playerPanel.setVisible(false);
		inter.armaLabel.setVisible(false);
		inter.nomeArmaLabel.setVisible(false);
		
		jogo.novaPosicao1 = "ini2";
	}
	public void ini2(){
		ft.imagemICone = new ImageIcon(".//res//2.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("Local este que era invejado pelos\noutros animais a casa era grande\ne bonita");
		inter.escolha1.setText(">");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		jogo.novaPosicao1 = "ini3";
	}
	public void ini3(){
		ft.imagemICone = new ImageIcon(".//res//3.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("Sua madeira era da melhor qualidade\nposs??vel a olhar pela janela via-se\numa paisagem t??o bela quanto o\nnascer do sol");
		inter.escolha1.setText(">");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		jogo.novaPosicao1 = "ini4";
	}
	public void ini4(){
		ft.imagemICone = new ImageIcon(".//res//4.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("Esse macaquinho se chamava "+player.nomePlayer+"\ne trabalhava como guarda da ilha em\nque vivia");
		inter.escolha1.setText(">");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		jogo.novaPosicao1 = "ini5";
	}
	public void ini5(){
		ft.imagemICone = new ImageIcon(".//res//5.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("Com o passar dos anos "+player.nomePlayer+"\nencontrou enquanto andava pela ilha\no seu amor");
		inter.escolha1.setText(">");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		jogo.novaPosicao1 = "ini6";
	}
	public void ini6(){
		ft.imagemICone = new ImageIcon(".//res//9.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("Jessica, uma macaquinha f??mea da sua\nmesma ra??a os dois se apaixonaram\nlogo foram morar juntos");
		inter.escolha1.setText(">");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		jogo.novaPosicao1 = "ini7";
	}
	public void ini7(){
		ft.imagemICone = new ImageIcon(".//res//10.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("A vida de"+player.nomePlayer+" parecia estar\ndando certo at?? que no\nanivers??rio de 1 ano de\nrelacionamento com Jessica");
		inter.escolha1.setText(">");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		jogo.novaPosicao1 = "ini8";
	}
	public void ini8(){
		ft.imagemICone = new ImageIcon(".//res//6.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("Piratas atacaram a ilha em meio\na confus??o do ataque "+player.nomePlayer+"\nse ver tendo que tomar uma decis??o:");
		inter.escolha1.setText(">");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		jogo.novaPosicao1 = "ini9";
	}
	public void ini9(){
		inter.playerPanel.setVisible(true);
		ft.imagemICone = new ImageIcon(".//res//7.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("Jessica:\n"+player.nomePlayer+" Voc?? n??o pode ir lutar\n?? muito perigoso e n??o quero\nque voc?? se arrisque.");
		inter.escolha2.setVisible(true);
		inter.escolha3.setVisible(true);

		inter.escolha1.setText("ficar");
		inter.escolha2.setText("Sair");
		inter.escolha3.setText("Sair sem falar");
		inter.escolha4.setText("");

		jogo.novaPosicao1 = "ficar";
		jogo.novaPosicao2 = "sair";
		jogo.novaPosicao3 = "sairSFalar";

	}
	public void fim(){
		padraoSetup();
		vc.MostrarTitulo();
	}
	public void ficar(){
		ft.imagemICone = new ImageIcon(".//res//8.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("Voc?? viveu feliz");
		inter.escolha2.setVisible(false);
		inter.escolha3.setVisible(false);

		inter.escolha1.setText("Fim");
		jogo.novaPosicao1 = "fim";
	}
	public void sair(){
		inter.escolha2.setVisible(false);
		inter.escolha3.setVisible(false);
		inter.escolha4.setVisible(false);
		ft.imagemICone = new ImageIcon(".//res//11.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("Eu n??o posso ficar aqui e ver todos\nmorrendo pelas m??os dos piratas,\neu vou proteger nossa ilha.");
		inter.escolha1.setText(">");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		jogo.novaPosicao1 = "pegarArma";
	}
	public void pegarArma(){
		inter.escolha2.setVisible(false);
		inter.escolha3.setVisible(false);
		inter.escolha4.setVisible(false);
		inter.armaLabel.setVisible(true);
		inter.nomeArmaLabel.setVisible(true);
		ft.imagemICone = new ImageIcon(".//res//12.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("jessica:\nEst?? bem ent??o pelo menos leve isto\ncom voc?? *ganhou canivete*\n" + player.nomePlayer +":\nbrigado, mas agora tenho que ir");
		inter.escolha1.setText(">");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		jogo.novaPosicao1 = "cena2";
	}
	public void sairSFalar(){
		player.armaAtual = new espadaLonga();
		inter.nomeArmaLabel.setText(player.armaAtual.nomeArma);
		inter.escolha2.setVisible(false);
		inter.escolha3.setVisible(false);
		inter.escolha4.setVisible(false);
		inter.armaLabel.setVisible(true);
		inter.nomeArmaLabel.setVisible(true);
		ft.imagemICone = new ImageIcon(".//res//14.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("Jessica:\nN??o v??, l?? fora ?? muito perigoso\nVoc?? foi desarmado para batalha");
		inter.escolha1.setText(">");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		jogo.novaPosicao1 = "cena2";
	}
	public void cena2(){
		ft.imagemICone = new ImageIcon(".//res//15.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("Ao sair de sua casa, Voc?? se depara\ncom ??rvores em chamas e no horizonte\num navio pirata que permanece\natracado na costa da ilha.");
		inter.escolha2.setVisible(true);
		inter.escolha1.setText("Ir pela praia");
		inter.escolha2.setText("Floresta chamas");
		jogo.novaPosicao1 = "praia";
		jogo.novaPosicao2 = "florestaChamas";
	}
	public void praia(){
		ft.imagemICone = new ImageIcon(".//res//16.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("Voc?? encurtou o caminho bastante\ngra??as a sua escolha inteligente,\nmas voc?? encontra 3 piratas na\n sua frente, voc?? ira:");
		inter.escolha2.setVisible(true);
		inter.escolha1.setText("Lutar");
		inter.escolha2.setText("Fugir");
		jogo.novaPosicao1 = "lutar1";
		jogo.novaPosicao2 = "fugir1";
	}
	public void florestaChamas(){
		ft.imagemICone = new ImageIcon(".//res//13.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("Ao escolher o caminho mais longo, voc?? acaba passando pelas ??rvores em\nchamas, e l?? voc?? encontra um\nsoldado");
		inter.escolha1.setText(">");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		inter.escolha2.setVisible(false);
		jogo.novaPosicao1 = "fc1";
	}
	public void fc1(){
		ft.imagemICone = new ImageIcon(".//res//13.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("ele estava preso embaixo de um tronco\nem chamas, vendo essa situa????o, voc?? decide ajudar, assim salvando o\nsoldado");
		inter.escolha1.setText(">");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		jogo.novaPosicao1 = "fc2";
	}
	public void fc2(){
		ft.imagemICone = new ImageIcon(".//res//13.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		player.amuleto = 1;
		inter.areaPrincipalTexto.setText("o soldado mesmo machucado decide\najudar voc??, indo para a praia tentar\nespantar os piratas.");
		inter.escolha1.setText(">");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		jogo.novaPosicao1 = "praia1";
	}
	public void lutar1(){
		monstro = new Monstros.pirata();
		ft.imagemICone = new ImageIcon(".//res//16.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText(monstro.nomeMonstro+": "+monstro.vidaMonstro+"\nO qu?? voc?? vai fazer?");
		inter.escolha2.setVisible(true);
		inter.escolha2.setVisible(true);
		if(player.armaAtual.nomeArma.equals("Luva")){
			jogo.novaPosicao1 = "desarmado";
			jogo.novaPosicao2 = "fugir1";
		}
		else if(player.armaAtual.nomeArma.equals("Canivete")){
			jogo.novaPosicao1 = "lutar2";
			jogo.novaPosicao2 = "fugir1";
		}
		inter.escolha1.setText("Lutar");
		inter.escolha2.setText("Fugir");

	}
	public void fugir1(){
		ft.imagemICone = new ImageIcon(".//res//17.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		inter.areaPrincipalTexto.setText("Voc?? tenta fugir dos piratas\nindo para floresta em chamas\n mas acaba morendo");
		player.amuleto = player.amuleto + 1;

		inter.escolha1.setText("inicio");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		inter.escolha2.setVisible(false);
		inter.escolha3.setVisible(false);
		inter.escolha4.setVisible(false);
		jogo.novaPosicao1 = "paraTitulo";
		jogo.novaPosicao2 = "";
		jogo.novaPosicao3 = "";
		jogo.novaPosicao4 = "";
		jogo.novaPosicao1 = "paraTitulo";
	}
	public void desarmado(){
		ft.imagemICone = new ImageIcon(".//res//17.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		inter.areaPrincipalTexto.setText("Voc?? morreu por estar\nDesarmado");
		player.amuleto = player.amuleto + 1;

		inter.escolha1.setText("inicio");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		inter.escolha2.setVisible(false);
		inter.escolha3.setVisible(false);
		inter.escolha4.setVisible(false);
		jogo.novaPosicao1 = "paraTitulo";
		jogo.novaPosicao2 = "";
		jogo.novaPosicao3 = "";
		jogo.novaPosicao4 = "";
		jogo.novaPosicao1 = "paraTitulo";
	}
	public void lutar2(){
		ft.imagemICone = new ImageIcon(".//res//18.png");
		int playerDamage = new java.util.Random().nextInt(player.armaAtual.danoArma);
		
		if(player.armaAtual.nomeArma.equals("Canivete")) {
			playerDamage = new java.util.Random().nextInt(3);
		}
		else if (player.armaAtual.nomeArma.equals("Luva")) {
			playerDamage = new java.util.Random().nextInt(1);
		}
		inter.areaPrincipalTexto.setText("Voc?? atacou o "+monstro.nomeMonstro+" e deu "+playerDamage+" no alvo");
		monstro.vidaMonstro = monstro.vidaMonstro - playerDamage;
		inter.escolha2.setVisible(false);
		inter.escolha1.setText(">");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");

		if(monstro.vidaMonstro > 0){
			jogo.novaPosicao1 = "ataque1";
			jogo.novaPosicao2 = "";
			jogo.novaPosicao3 = "";
			jogo.novaPosicao4 = "";
		}
		else if(monstro.vidaMonstro < 0){
			jogo.novaPosicao1 = "vitoria1";
			jogo.novaPosicao2 = "";
			jogo.novaPosicao3 = "";
			jogo.novaPosicao4 = "";
		}
	}
	public void ataque1(){
			ft.imagemICone = new ImageIcon(".//res//16.png");
			ft.fotoJLabel.setIcon(ft.imagemICone);
			int ataqueMonsto = new java.util.Random().nextInt(monstro.danoMonstro);
			player.vidaPlayer = player.vidaPlayer - ataqueMonsto;
			inter.numeroVidaLabel.setText(""+player.vidaPlayer);
			inter.areaPrincipalTexto.setText(monstro.monstroAtaqueMensagem+"\nVoc?? sofreu "+ataqueMonsto+" De dano");
	
			inter.escolha1.setText(">");
			inter.escolha2.setText("");
			inter.escolha3.setText("");
			inter.escolha4.setText("");
	
			if(player.vidaPlayer > 0) {
				jogo.novaPosicao1 = "lutar2";
				jogo.novaPosicao2 = "";
				jogo.novaPosicao3 = "";
				jogo.novaPosicao4 = "";
			}
			else if(player.vidaPlayer < 1) {
				jogo.novaPosicao1 = "derrota";
				jogo.novaPosicao2 = "";
				jogo.novaPosicao3 = "";
				jogo.novaPosicao4 = "";
			}
	}
	public void vitoria1(){
		ft.imagemICone = new ImageIcon(".//res//8.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		inter.areaPrincipalTexto.setText("Voc?? luta Bravamente com os piratas, em meio a troca de golpes sua esgrima conseguiu superar a esgrima dos piratas ");
		inter.escolha1.setText(">");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		jogo.novaPosicao1 = "vitoria1cont";
		jogo.novaPosicao2 = "";
		jogo.novaPosicao3 = "";
		jogo.novaPosicao4 = "";
	}
	public void vitoria1cont(){
		ft.imagemICone = new ImageIcon(".//res//11.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("e voc?? vence, por??m eles ainda\nconseguem te ferir, mas Voc??\nbravamente continua a caminhar at??\na praia.");
		inter.escolha1.setText("Praia");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		jogo.novaPosicao1 = "praia1";
	}
	public void praia1(){
		ft.imagemICone = new ImageIcon(".//res//16.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("Chegando na praia voc?? se depara com um total de 5 piratas, aparentemente este ?? o que sobrou dos inimigos");
		inter.escolha1.setText("Praia");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		jogo.novaPosicao1 = "praia2";
	}
	public void praia2(){
		inter.escolha2.setVisible(true);
		inter.escolha3.setVisible(true);
		ft.imagemICone = new ImageIcon(".//res//15.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("Eles est??o tocando fogo nos arredores e atacando qualquer um que se aproximem deles.");
		inter.escolha1.setText("Atacar");
		inter.escolha2.setText("Assustar");
		inter.escolha3.setText("Negociar");

		jogo.novaPosicao1 = "atacargp";
		jogo.novaPosicao2 = "assustar";
		jogo.novaPosicao3 = "negociar";
	}
	public void atacargp(){
		if(player.amuleto == 1){
			ft.imagemICone = new ImageIcon(".//res//19.png");
			ft.fotoJLabel.setIcon(ft.imagemICone);
			ft.fotoJPanel.add(ft.fotoJLabel);
			inter.areaPrincipalTexto.setText("Voc?? ataca os piratas junto com seu aliado, e depois do confronto voc??s conseguem derrotar os piratas usando um duro trabalho em equipe");
			inter.escolha1.setText(">");
			inter.escolha2.setText("");
			inter.escolha3.setText("");
			inter.escolha4.setText("");
			jogo.novaPosicao1 = "final1";
		}
		else if(player.amuleto == 0){
			ft.imagemICone = new ImageIcon(".//res//20.png");
			ft.fotoJLabel.setIcon(ft.imagemICone);
			ft.fotoJPanel.add(ft.fotoJLabel);
			inter.areaPrincipalTexto.setText("mesmo ferido voc?? decide atacar os piratas, a batalha se inicia e um grande corte ?? feito em seu corpo, os piratas s??o muito fortes");
			inter.escolha1.setText("Praia");
			inter.escolha2.setText("");
			inter.escolha3.setText("");
			inter.escolha4.setText("");
			jogo.novaPosicao1 = "t1";
		}
	}
	public void t1() {
		ft.imagemICone = new ImageIcon(".//res//17.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("ent??o vendo que voc?? n??o vai ser capaz de vencer, voc?? tenta se render aos piratas, por??m eles te ignoram e te matam.");
		inter.escolha1.setText("inicio");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		jogo.novaPosicao1 = "paraTitulo";
	}
	public void assustar(){
		if(player.amuleto == 1){
			ft.imagemICone = new ImageIcon(".//res//19.png");
			ft.fotoJLabel.setIcon(ft.imagemICone);
			ft.fotoJPanel.add(ft.fotoJLabel);
			inter.areaPrincipalTexto.setText("Voc?? e seu aliado tentam assustar os piratas arremessando pedras e galhos em sua dire????o, o que parecia n??o fazer efeito");
			inter.escolha1.setText(">");
			inter.escolha2.setText("");
			inter.escolha3.setText("");
			inter.escolha4.setText("");
			jogo.novaPosicao1 = "t2";
		}
		else if(player.amuleto == 0){
			ft.imagemICone = new ImageIcon(".//res//17.png");
			ft.fotoJLabel.setIcon(ft.imagemICone);
			ft.fotoJPanel.add(ft.fotoJLabel);
			inter.areaPrincipalTexto.setText("Voc?? tenta usar ??rvores que estavam perto da praia para criar uma distra????o para os piratas, mas voc?? morre no processo.");
			inter.escolha1.setText("Praia");
			inter.escolha2.setText("");
			inter.escolha3.setText("");
			inter.escolha4.setText("");
			jogo.novaPosicao1 = "paraTitulo";
		}
	}
	public void t2(){
		ft.imagemICone = new ImageIcon(".//res//19.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("realmente deu certo gra??as ao trabalho em equipe de" + player.nomePlayer + "e seu aliado. Assim voc??s conseguiram afugentar os piratas.");
		inter.escolha1.setText(">");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		jogo.novaPosicao1 = "final2";
	}
	public void negociar(){
		ft.imagemICone = new ImageIcon(".//res//17.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("Voc?? tenta negociar com os piratas mas infelizmente eles n??o te d??o ouvidos e acabam por te atacar e te derrotam.");
		inter.escolha1.setText("inicio");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		jogo.novaPosicao1 = "paraTitulo";
	}
	public void final1(){
		ft.imagemICone = new ImageIcon(".//res//21.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("Parab??ns voc?? conseguiu salvar a ilha do nosso macaquinho, obrigado por jogar esse pequeno projeto.");
		inter.escolha1.setText("inicio");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		jogo.novaPosicao1 = "paraTitulo";
	}
	public void final2(){
		ft.imagemICone = new ImageIcon(".//res//5.png");
		ft.fotoJLabel.setIcon(ft.imagemICone);
		ft.fotoJPanel.add(ft.fotoJLabel);
		inter.areaPrincipalTexto.setText("Voc?? voltou para seu amor. obrigado por jogar esse pequeno projeto.");
		inter.escolha1.setText("inicio");
		inter.escolha2.setText("");
		inter.escolha3.setText("");
		inter.escolha4.setText("");
		jogo.novaPosicao1 = "paraTitulo";
	}
}

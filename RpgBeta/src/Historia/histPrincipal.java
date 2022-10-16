package Historia;

import Armas.canivete;
import Jogo.Interface;
import Jogo.Jogo;
import Jogo.player;
import Jogo.visibilidadeControlador;

public class histPrincipal {
	Jogo jogo;
	Interface inter;
	visibilidadeControlador vc;
	player player = new player();
	
	
	
	public histPrincipal(Jogo j, Interface gameInterface, visibilidadeControlador vControlador) {
		jogo = j;
		inter = gameInterface;
		vc = vControlador;	
		
	}
	
	public void padraoSetup() {
		player.vidaPlayer = 10;
		inter.numeroVidaLabel.setText(""+player.vidaPlayer);
		
		player.armaAtual = new canivete();
		inter.nomeArmaLabel.setText(player.armaAtual.nomeArma);
	}
}

package Jogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Historia.histPrincipal;

public class Jogo {
	foto ft = new foto();
	Interface inter = new Interface();
	EscolhaManipulador eManipulador = new EscolhaManipulador();
	visibilidadeControlador vc = new visibilidadeControlador(inter, ft);
	histPrincipal histP = new histPrincipal(this, inter, vc, ft);
	public String novaPosicao1, novaPosicao2, novaPosicao3, novaPosicao4;
	
	public static void main(String[] args) {
		new Jogo();
		
	}
	
	public Jogo() {
		inter.criatTela(eManipulador, ft);
		vc.MostrarTitulo();
		histP.padraoSetup();

	}
	
	public class EscolhaManipulador implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			String suaEscolha = event.getActionCommand();
			
			switch(suaEscolha) {
			case "start": vc.Mostrartitologame(); histP.portaoInicio(); break;
			case "e1": histP.escolherPossicao(novaPosicao1); break;
			case "e2": histP.escolherPossicao(novaPosicao2);break;
			case "e3": histP.escolherPossicao(novaPosicao3);break;
			case "e4": histP.escolherPossicao(novaPosicao4);break;
			
			}
			
		}
	}
	
}

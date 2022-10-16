package Jogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Historia.histPrincipal;

public class Jogo {
	Interface inter = new Interface();
	EscolhaManipulador eManipulador = new EscolhaManipulador();
	visibilidadeControlador vc = new visibilidadeControlador(inter);
	histPrincipal histP = new histPrincipal(this, inter, vc);
	
	public static void main(String[] args) {
		new Jogo();
		
	}
	
	public Jogo() {
		inter.criatTela(eManipulador);
		vc.MostrarTitulo();
		histP.padraoSetup();
	}
	
	public class EscolhaManipulador implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			String suaEscolha = event.getActionCommand();
			
			switch(suaEscolha) {
			case "start": vc.Mostrartitologame(); break;
			case "e1": break;
			case "e2": break;
			case "e3": break;
			case "e4": break;
			
			}
			
		}
	}
	
}

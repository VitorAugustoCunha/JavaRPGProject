package Jogo;

public class visibilidadeControlador {
	Interface inter;
	
	public visibilidadeControlador(Interface userInter) {
		inter = userInter;
		
		
	}
	
	public void MostrarTitulo() {
		//Mostrar tela de titulo
		inter.tituloNomePanel.setVisible(true);
		inter.botaoInicioPanel.setVisible(true);
		
		//apagar tela do jogo
		inter.textoPrincipalPanel.setVisible(false);
		inter.botaoAcaoPanel.setVisible(false);
		inter.playerPanel.setVisible(false);
	}
	
	public void Mostrartitologame() {
		//Mostrar tela de titulo
		inter.tituloNomePanel.setVisible(false);
		inter.botaoInicioPanel.setVisible(false);
		
		//apagar tela do jogo
		inter.textoPrincipalPanel.setVisible(true);
		inter.botaoAcaoPanel.setVisible(true);
		inter.playerPanel.setVisible(true);
	}
}

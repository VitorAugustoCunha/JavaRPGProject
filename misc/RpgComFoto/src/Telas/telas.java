package Telas;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Container;

public class telas {
    JFrame janelaTela;
    Container cont;
    JPanel fotoPanel;
    JLabel fotoJLabel;
    ImageIcon imagemIcon;


    public static void main(String[] args) {
        new telas();
    }
    public telas(){
        janelaTela = new JFrame();
        janelaTela.setSize(800, 600);
        janelaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaTela.getContentPane().setBackground(Color.black);
        janelaTela.setLayout(null);
        cont = janelaTela.getContentPane();

        fotoPanel = new JPanel();
        fotoPanel.setBounds(150,100,500,300);
        fotoPanel.setBackground(Color.blue);
        cont.add(fotoPanel);

        fotoJLabel = new JLabel();
        imagemIcon = new ImageIcon(".//res//descarregar.jpg");

        fotoJLabel.setIcon(imagemIcon);
        fotoPanel.add(fotoJLabel);




        janelaTela.setVisible(true);
    }
}
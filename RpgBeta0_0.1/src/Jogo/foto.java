package Jogo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class foto {
    public JPanel fotoJPanel;
    public JLabel fotoJLabel;
    public ImageIcon imagemICone;

    public foto(){
        fotoJPanel = new JPanel();
        fotoJPanel.setBounds(50, 50, 400, 250);
        fotoJPanel.setBackground(Color.blue);
        fotoJPanel.setVisible(false);
        fotoJLabel = new JLabel();
    }
}

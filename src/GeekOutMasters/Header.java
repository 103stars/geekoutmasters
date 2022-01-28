package GeekOutMasters;

import javax.swing.*;
import java.awt.*;

/**
 * This class is used for ...
 * @autor 202040393    LASSO MEDINA ALEJANDRO				alejandro.lasso@correounivalle.edu.co
 * 2043203	LOPEZ CESPEDES SEBASTIAN ALEXIS				sebastian.cespedes@correounivalle.edu.co
 * @version v.1.0.0 date14/12/2021
 */
public class Header extends JLabel {
    /**
     * Constructor of the Header class
     * @param title String that contains Header text
     * @param colorBackground Color object to be assigned for the Header background
     */
    public Header(String title, Color colorBackground){
        this.setText(title);
        this.setBackground(colorBackground);
        this.setForeground(new Color(255,255,255));
        this.setFont(new Font(Font.DIALOG,Font.BOLD,20));
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setOpaque(true);
    }
}

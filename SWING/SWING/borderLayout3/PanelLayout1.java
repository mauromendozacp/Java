
package borderLayout3;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelLayout1 extends JPanel{ //CAPAS O LAMINA

    public PanelLayout1() {
        
        setLayout(new FlowLayout(FlowLayout.LEFT,20,10)); //HE COLOCADO FLOWLAYOUT "LADO IZQUIERDO"
                                                           //"separacion entre botones de 20 y 10 de alto"
        add(new JButton("Amarilo"));
        add(new JButton("Rojo"));

    }
    
}

package java_clase5.pkg1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseClickHandler extends MouseAdapter {
    public MouseClickHandler() {}
    
    public void mouseClicked(MouseEvent e){
        System.out.print("Click " + e.getButton());
    }
}


package thread_GUI;

//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class TestSwing implements ActionListener,Runnable{
    
    JFrame marco ;
    JPanel lamina ;
    JButton startButton ;

    public TestSwing() {
        
        marco = new JFrame("Test");
        lamina = new JPanel();
        startButton = new JButton("Boton");
//        boton.setActionCommand("Boton Presionado"); //sin esto solo deja fondo amarillo
       
    }
    
    public void marco(){
    
       marco.setBounds(300, 200, 200, 300); 
       lamina.add(startButton); //boton agregado a la lamina
       startButton.setActionCommand("Boton Presionado"); //sin esto solo deja fondo amarillo
       startButton.addActionListener(this); //boton a la escucha "PERO ESTA EL BOTON EN LA LAMINA"
       marco.add(lamina); //lamina agregada al marco
       //marco.add(lamina, BorderLayout.SOUTH); //agrega la lamina al sur
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       marco.setVisible(true);
       
       
    }
    
     @Override
    public void actionPerformed(ActionEvent ae) {
      
         if (ae.getSource() == startButton) {
             
             System.out.println("El comando es: " + ae.getActionCommand());
             lamina.setBackground(Color.yellow);
             run();
         }
      

    }
    
      @Override
    public void run() {
        
          for (int i = 0; i < 10; i++) {
              System.out.println(""+i);
              try {
                  Thread.sleep(100);
              } catch (InterruptedException ex) {
                  Logger.getLogger(TestSwing.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        TestSwing t = new TestSwing();
        Thread t1 = new Thread();
        t.marco();
        t1.start();
    } 

  
    
}

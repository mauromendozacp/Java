
package theadhilos_swingworkers;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;

public class MainSwingWorker {

    private JScrollPane elScroll;
    private JFrame elMarco;
    private JButton boton;
    private JTextArea area;
    public SwingWorker worker;
    
    public void go(){
    
        elMarco = new JFrame("actualizacion swing");
        elMarco.setLayout(new GridLayout(2, 1));
        
        boton = new JButton("Clickeame");
        area = new JTextArea("edite esto");
        elScroll = new JScrollPane(area);
        
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Boton clickeado"+Thread.currentThread().getName());
                
                worker = new SwingWorker(){

                    @Override
                    protected Object doInBackground() throws Exception {
                        for (int i = 0; i < 100; i++) {
                            Thread.sleep(1000);
                            System.out.println(""+i);
                        }
                        return null;
                    }
                     
                };
               worker.execute();
            }
        });
        
        elMarco.add(boton);
        elMarco.add(elScroll);
        elMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        elMarco.setBounds(10, 10, 300, 200);
        elMarco.setVisible(true);

    }
    public static void main(String[] args) {
        // TODO code application logic here
        new MainSwingWorker().go();
        
    }
    
}

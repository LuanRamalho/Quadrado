import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Quadrado extends JPanel {
        
    public Quadrado() 
    {        
        super.setPreferredSize( new Dimension( 800, 800 ) ); 
        super.setBackground( Color.YELLOW );
    }
    
    public void paintComponent( Graphics g ) 
    {
        super.paintComponent(g); 
        g.setColor(Color.BLUE);
        g.fillRect(10, 30, 300, 300);  
        g.setColor(Color.DARK_GRAY);
        g.fillRect(350, 30, 300, 300);
        g.setColor(Color.red);
        g.fillRect(10, 350, 300, 300);
        g.setColor(Color.GREEN);
        g.fillRect(350, 350, 300, 300);
    }
           
    public static void main(String[] args) 
    {
        Quadrado painel = new Quadrado();
        
        JFrame f = new JFrame();
        f.setContentPane( painel ); 
        f.setTitle( "Quadrado" ); 
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        f.setSize( 1000, 768 ); 
        f.setLocationRelativeTo( f );                
        f.setVisible( true );
    }
    
}
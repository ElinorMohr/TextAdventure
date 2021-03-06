package textadventure;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Blotto
 */
public class Menu extends JFrame implements ActionListener {

    //Initializes our buttons
    JButton newGameButton   = new JButton("New Game");
    JButton loadGameButton  = new JButton("Load Game");
    JButton tutorialButton  = new JButton("Tutorial");  
    
    
    public Menu(){
        
 
       
        //Adds ActioListener too our buttons
        newGameButton.addActionListener(this);
        loadGameButton.addActionListener(this);
        tutorialButton.addActionListener(this);       
        
        
        //Creates our startmenu frame
        this.setTitle("Adventures of Sir Hero");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setResizable(true);
        this.setLocationRelativeTo(null);        
        this.setLayout(new GridLayout(3, 1));    
        
        //Adds our buttons to our gridlayout
        this.add(newGameButton);
        this.add(loadGameButton);
        this.add(tutorialButton);        
        
        
        this.setVisible(true);
        
        
    }

    //ActionListener who decides what our buttons can do
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource() == newGameButton){
            String name = JOptionPane.showInputDialog(this, "What is your name");
            World world = new World(name);
            GUI gui = new GUI(world);
            this.dispose();
        }
        else if (ae.getSource() == loadGameButton){
            
        }
        else if (ae.getSource() == tutorialButton){
            Tutorial tutorial = new Tutorial();
        }
        
        
    }


    
    
}

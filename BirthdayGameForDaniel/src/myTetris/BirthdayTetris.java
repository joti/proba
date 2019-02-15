
package myTetris;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class BirthdayTetris extends JFrame{

    private JLabel statusBar;
    
    
    public BirthdayTetris(){
        statusBar = new JLabel("0"); //a sorszámokat ide
        add(statusBar, BorderLayout.SOUTH);
        Board board = new Board(this);
        add(board);
        
        // még egy add
        board.start();
        
        setSize(200, 400);
        setTitle("Szülinapi tetrisz :)");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public JLabel getStatusBar(){
        return statusBar;
    }
    
    public static void main(String[] args) {
        BirthdayTetris myTetris = new BirthdayTetris();
        myTetris.setLocationRelativeTo(null);
        myTetris.setVisible(true);
        SoundPlayer.soundPlay();
        
    }
}

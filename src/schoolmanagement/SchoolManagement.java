/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagement;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import view.AlunoForm;

/**
 *
 * @author joaov
 */
public class SchoolManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 400;
        
        JFrame frame = new JFrame("s");
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setContentPane(new AlunoForm().getContentPane());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}


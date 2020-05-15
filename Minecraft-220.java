import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.*;
import pop.java;

package JApplet;
 
    public static void main(String[] args)
    {
        System.out.println("There's an virus");//Opcion 1
int game2=0;
int game= 0;
int game3=0;
int gamef=0;
int so= 0;

       int juego= JOptionPane.showConfirmDialog(null,"There's an virus","Windows defender", JOptionPane.YES_NO_CANCEL_OPTION);//Opcion 2

          if (juego == JOptionPane.YES_OPTION){
        game2 = JOptionPane.showOptionDialog(null, "Your computer will get corrupted due to the virus caused by bill gates", "Windows defender", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
}


if (game2== JOptionPane.YES_OPTION){
  game = JOptionPane.showOptionDialog(null, "I lied", "An lie.", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
}
}

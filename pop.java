import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Principal extends JApplet {

 ImageIcon icono;
 JLabel l;

 public void init(){
this.setSize(500,500);
  icono=new ImageIcon(getClass().getResource("Wana_Decrypt0r_screenshot.png"));
  l=new JLabel("Este es una imagen en un JLabel",icono,SwingConstants.CENTER);
  add(l);
 }
}


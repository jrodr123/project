import javax.swing.*;
import java.awt.*;
public class GUI{
public static void main (String [] args){

   JFrame main = new JFrame("BLACK JACK");
    main.setVisible(true);
    main.setSize(900,750);
    main.setResizable(false);
    main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel(new GridBagLayout());
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    JPanel panel6 = new JPanel();
    GridBagConstraints layout = new GridBagConstraints();
    
    JButton play = new JButton("PLAY");
    layout.gridx = 0;
    layout.gridy = 0;
    panel2.add(play,layout);
    JButton hit = new JButton("HIT");
    layout.gridx = 1;
    layout.gridy = 0;
    panel2.add(hit,layout);
    JButton stand = new JButton("STAND");
    layout.gridx = 2;
    layout.gridy = 0;
    panel2.add(stand,layout);
    panel1.setBackground(Color.BLUE);
    panel1.setSize(900,550);
    main.add(panel1);

    panel2.setBackground(Color.ORANGE);
   panel2.setSize(900,590);
    main.getContentPane().add(panel2, BorderLayout.SOUTH);
    panel2.add(play);
    panel2.add(hit);
    panel2.add(stand);
    panel3.setBounds(900,900,900,900);
   //panel3.setSize(20,20);
       panel3.setBackground(Color.RED);

    panel1.add(panel3);
    
    panel4.setBounds(900,900,900,900);
   //panel3.setSize(20,20);
       panel4.setBackground(Color.RED);
    panel1.add(panel4);

panel5.setBounds(900,900,900,900);
   //panel3.setSize(20,20);
       panel5.setBackground(Color.RED);
    panel1.add(panel5);
    panel6.setBounds(900,900,900,900);
   //panel3.setSize(20,20);
       panel6.setBackground(Color.RED);
    panel1.add(panel6);
  	}
   }

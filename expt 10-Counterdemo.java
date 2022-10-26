import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Counterdemo extends JFrame implements ActionListener {
   private JLabel label;
   private JTextField text;
   private JButton addBtn;
   private int count;
   public Counterdemo() {
      setTitle("Counter");
      setLayout(new FlowLayout());
      count = 0;
      label = new JLabel("Count:");
      text = new JTextField("0", 5);
      addBtn = new JButton("counting");
      addBtn.addActionListener(this);
      add(label);
      add(text);
      add(addBtn);
      setSize(375, 250);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
   }
   public void actionPerformed(ActionEvent ae) {
      if (ae.getSource() == addBtn) {
         count++;
         text.setText(String.valueOf(count));
         repaint();
      } 
   }
   
   public static void main(String[] args) {
      new Counterdemo();
   }

}

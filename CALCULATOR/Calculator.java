import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends JApplet {
   public void init() {
      CalculatorPanel calc=new CalculatorPanel();
      getContentPane().add(calc);
      }
   }

   class CalculatorPanel extends JPanel implements ActionListener {
     JPanel b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,add,subtract, multiply, divide,;
  
      static JTextField result = new JTextField("0",45);
      static String lastCommand = null;
      JOptionPane d = new JOptionPane();
      double preRes=0,secVal=0,res;

      private static void assign(String no)
        {
            if (result.getText().equals("0"))
                {
                    result.settext "no"
                        else
                            {
                            
                      }
                }
        }
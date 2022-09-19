package events_01_actioneventdemo1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Events_01_ActionEventDemo1 implements ActionListener
{
    JFrame jF;
    JLabel juid;
    JTextField jTF;
    JLabel jpwd;
    JTextField jTF1;
    JButton jbtnsub;
    JLabel jl1;
    Dialog dlg;
    Dialog dlg1;

    public Events_01_ActionEventDemo1() 
    {
        setupJFrame();

        juid = new JLabel("UID:");
        jF.add(juid);

        jTF = new JTextField(15);
        jF.add(jTF);
        
         jpwd = new JLabel("PASSWORD:");
        jF.add(jpwd);

        jTF1 = new JTextField(15);
        
        jF.add(jTF1);
        
        jbtnsub = new JButton("SUBMIT");
        jF.add(jbtnsub);
        jl1 = new JLabel("");
        jF.add(jl1);
        
        jbtnsub.addActionListener(this);

        jF.setVisible(true);
    }
   
    public void actionPerformed(ActionEvent e)
    {
        
             if(jTF.getText().equals(jTF1.getText()))
             {
                 dlg.setVisible(true);
             }
             else
             {
                  dlg1.setVisible(true);
             }
    }
    
    
    void setupJFrame()
    {
        jF = new JFrame("Event");
        jF.setLayout(new FlowLayout());
        jF.setSize(300, 300);
        jF.getContentPane().setBackground(Color.yellow);
        jF.setLocationRelativeTo(null);
         dlg = new Dialog(jF, "My Dialog",true);
        dlg.setLayout(new FlowLayout());
        dlg.add(new Label("SUCCESSFUL LOGIN"));
      dlg.setSize(300,300);
      dlg.setLocationByPlatform(true);
        dlg.add(new Button("OK"));
          dlg1 = new Dialog(jF, "My Dialog",true);
        dlg1.setLayout(new FlowLayout());
        dlg1.add(new Label("UNSUCCESSFUL LOGIN"));
      
        dlg1.add(new Button("OK"));
        dlg1.setSize(500, 500);        
        jF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) 
    {
        new Events_01_ActionEventDemo1();
    }
    
}

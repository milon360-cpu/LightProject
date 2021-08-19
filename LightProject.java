
package Project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class LightProject extends JFrame implements ActionListener
{
    private ImageIcon icon,light;
    private Container c;
    private JLabel on,off;
    private JToggleButton btn;
    private Font font;
    private Cursor cursor;
    LightProject()
    {
        font = new Font("Cambria",Font.BOLD,30);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Switch");
        this.setResizable(false);
        this.setBounds(600,200,500,600);
        setIcon_();
        c = this.getContentPane();
        this.setLayout(null);
        c.setBackground(Color.white);
        
        light = new ImageIcon("off.jpg");
        off = new JLabel(light);
        off.setBounds(96,20,light.getIconWidth(),light.getIconHeight());
        c.add(off);
        
        btn = new JToggleButton("OFF");
        btn.setBounds(205,505,90,35);
        btn.setFont(font);
        btn.setCursor(cursor);
        btn.setFocusPainted(false);
        c.add(btn);
        btn.addActionListener(this);
    }
    void setIcon_()
    {
       icon = new ImageIcon("on.jpg") ;
       this.setIconImage(icon.getImage());
    }
    public static void main(String[] args)
    {
        LightProject frame = new LightProject();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if(btn.isSelected())
        {
            off.setBounds(0,0,0,0);
      
            btn.setText("ON");
            light = new ImageIcon("on.jpg");
            on = new JLabel(light);
            on.setBounds(96,20,light.getIconWidth(),light.getIconHeight());
            c.add(on);
        }
        else
        {
            off.setBounds(96,20,light.getIconWidth(),light.getIconHeight());
            btn.setText("OFF");
        }
    }
}

 import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
class CheckExample  implements ItemListener {
    JCheckBox checkbox = new JCheckBox("Check Me!");
    JButton b = new JButton("UnCheck!");

    CheckExample() {
        JFrame fr = new JFrame("Checkbox Example");
        checkbox.addItemListener(this);

        fr.add( checkbox);
        b.setBounds(100, 150,  100, 50);
        fr.add(b);

        fr.setSize(400,400);
        fr.setLayout(null);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void itemStateChanged(ItemEvent ie) {

        if( checkbox.isSelected()){
            b.setText("Check");
        }else{
            b.setText("UnCheck");
        }
    }

    public static void main (String args[])
    {
        new CheckExample();
    }
}
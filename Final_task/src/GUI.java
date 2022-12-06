import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.AncestorListener;

public class GUI extends JFrame{
    private JButton button_1 = new JButton("Start");
    private JRadioButton radio_1 = new JRadioButton("Xml");
    private JRadioButton radio_2 = new JRadioButton("Txt");
    private JRadioButton radio_3 = new JRadioButton("Json");
    public GUI(){
        super("Сhoose a format");
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2,3,2,2));
        ButtonGroup group = new ButtonGroup();
        group.add(radio_1);
        group.add(radio_2);
        group.add(radio_3);
        container.add(radio_1);
        radio_1.setSelected(true);
        container.add(radio_2);
        container.add(radio_3);
        container.add(button_1);
    }

}

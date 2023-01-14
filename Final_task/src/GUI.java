import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;

public class GUI extends JFrame{
    private JButton button = new JButton("Start");
    private JLabel label1 = new JLabel("Select the input file format");
    private JLabel label2 = new JLabel("Select the output file format");
    private JLabel label3 = new JLabel("Archiving");
    private JRadioButton radioButton1 = new JRadioButton("input.txt");
    private JRadioButton radioButton2 = new JRadioButton("input.xml");
    private JRadioButton radioButton3 = new JRadioButton("input.json");
    private JRadioButton radioButton4 = new JRadioButton("output.txt");
    private JRadioButton radioButton5 = new JRadioButton("output.xml");
    private final JRadioButton radioButton6 = new JRadioButton("output.json");
    private JRadioButton radioButton7 = new JRadioButton("zip");
    private JRadioButton radioButton8 = new JRadioButton("rar");
    private JRadioButton radioButton9 = new JRadioButton("Not necessary");

    public GUI() throws IOException {
        super("Final task");
        this.setBounds(100,100,350,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(4,4,2,2));
        container.add(label1);
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButton1);
        buttonGroup1.add(radioButton2);
        buttonGroup1.add(radioButton3);
        container.add(radioButton1);
        radioButton1.setSelected(true);
        container.add(radioButton2);
        container.add(radioButton3);
        container.add(label2);
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(radioButton4);
        buttonGroup2.add(radioButton5);
        buttonGroup2.add(radioButton6);
        container.add(radioButton4);
        radioButton4.setSelected(true);
        container.add(radioButton5);
        container.add(radioButton6);
        container.add(label3);
        ButtonGroup buttonGroup3 = new ButtonGroup();
        buttonGroup3.add(radioButton7);
        buttonGroup3.add(radioButton8);
        buttonGroup3.add(radioButton9);
        container.add(radioButton7);
        container.add(radioButton8);
        container.add(radioButton9);
        radioButton9.setSelected(true);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }
    class ButtonEventListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String message = "";
            if(radioButton1.isSelected())
                message += "txt ";
            else if(radioButton2.isSelected())
                message += "xml ";
            else message += "json ";
            if(radioButton4.isSelected())
                message += "txt ";
            else if (radioButton5.isSelected())
                message += "xml ";
            else message += "json ";
            if(radioButton7.isSelected())
                message += "zip";
            else if (radioButton8.isSelected())
                message += "rar";
            else message += "not";
            TXTWritter txtWritter = new TXTWritter();
            try {
                txtWritter.TXTWRITER(message, "CUI.txt");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}

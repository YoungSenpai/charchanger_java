package tk.youngsenpais;
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.*;

public class Prog extends JFrame{

    JButton transform;
    JButton copy;
    JTextField line;
    JTextField c1, c2;
    JLabel copytext;
    Handler handler = new Handler();


    public Prog(String s){
        super(s);
        setLayout(new FlowLayout());

        transform = new JButton("transform");
        copy = new JButton("copy to buffer");
        line = new JTextField(16);
        c1 = new JTextField(7);
        c2 = new JTextField(7);
        copytext = new JLabel("nothing");

        add(transform);
        add(copy);
        add(line);
        add(c1);add(c2);
        add(copytext);
        transform.addActionListener(handler);
        copy.addActionListener(handler);
    }

    public void code(){
        String text = line.getText();
        String ch1 = c1.getText();
        String ch2 = c2.getText();

        copytext.setText(text.replace(ch1, ch2));
    }

    public void copytobuffet(String str){
        StringSelection ss = new StringSelection(str);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    }




    public class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == transform) {
                code();
            }
            if (e.getSource() == copy) {
                copytobuffet(copytext.getText());
            }
        }
    }
}

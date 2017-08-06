package tk.youngsenpais;
import javax.swing.*;

public class Main extends JFrame{

    public static void main(String[] args) {
        Prog p = new Prog("0xffffff");
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setSize(210, 200);
        p.setVisible(true);
        p.setResizable(true);
        p.setLocationRelativeTo(null);
    }
}

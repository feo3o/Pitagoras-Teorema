import javax.swing.*;

public class Frame extends JFrame {


    Panel panel;
    Frame(){
        this.setSize(450,200);
        this.setName("Pitagoras Theorem");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new Panel();

        //add components
        this.add(panel);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

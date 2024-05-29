import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel implements ActionListener {

    JLabel ask_A;
    JLabel ask_B;
    JLabel nota;
    JTextField a;
    JTextField b;

    JButton confirm;

    JLabel resultado;
    JTextField result;

    double firstNumber;
    double secondNumber;

    Panel() {
        this.setPreferredSize(new Dimension(450, 200));
        this.setOpaque(true);
        this.setBackground(new Color(96, 130, 182));
        this.setLayout(null);

        ask_A = new JLabel("Digite um valor (a): ");
        ask_A.setBounds(10, 10, 200, 30);
        ask_A.setFont(new Font("Verdana", Font.PLAIN, 17));
        ask_A.setForeground(Color.green);

        ask_B = new JLabel("Digite outro valor (b): ");
        ask_B.setBounds(10, 40, 200, 30);
        ask_B.setFont(new Font("Verdana", Font.PLAIN, 17));
        ask_B.setForeground(Color.green);

        nota = new JLabel("Obs: a^2 + b^2 = c^2");
        nota.setBounds(10, 70, 250, 30);
        nota.setForeground(Color.yellow);
        nota.setFont(new Font("Verdana", Font.PLAIN, 17));

        resultado = new JLabel("Resultado: ");
        resultado.setBounds(10, 100, 200, 30);
        resultado.setFont(new Font("Verdana", Font.BOLD, 17));

        result = new JTextField();
        result.setBounds(10, 130, 350, 25);
        result.setBackground(new Color(96, 130, 182));
        result.setBorder(null);
        result.setFont(new Font("Verdana", Font.BOLD, 17));
        result.setForeground(Color.red);



        a = new JTextField();
        a.setBounds(210, 17, 100, 20);
        a.setPreferredSize(new Dimension(150, 20));

        b = new JTextField();
        b.setBounds(210, 47, 100, 20);
        b.setPreferredSize(new Dimension(150, 20));

        confirm = new JButton("Calc");
        confirm.setBackground(Color.white);
        confirm.setForeground(new Color(95, 133, 117));
        confirm.setBounds(320, 47, 70, 20);
        confirm.addActionListener(this);
        confirm.setFocusable(false);

        this.add(ask_A);
        this.add(a);
        this.add(ask_B);
        this.add(b);
        this.add(nota);
        this.add(confirm);
        this.add(resultado);
        this.add(result);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == confirm) {

            if(a.getText().isEmpty() && b.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Você deve inserir valores numéricos", "Erro", JOptionPane.PLAIN_MESSAGE);
            }

            firstNumber = Double.parseDouble(a.getText());
            secondNumber = Double.parseDouble(b.getText());

            if(firstNumber != 0 && secondNumber != 0 ){
                double c = firstNumber * firstNumber + secondNumber * secondNumber;
                double c_result = Math.sqrt(c);
                String resultadoFinal = String.valueOf(c_result);

                result.setText(resultadoFinal);
            }
        }
    }
}

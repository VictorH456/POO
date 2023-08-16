package Projetos.Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Screen {
    JTextField num1;
    JTextField num2;
    JTextField sinal;
    public Screen() {
        JFrame jFrame = new JFrame("Teste");
        jFrame.setVisible(true);
        jFrame.setSize(800,500);
        //jFrame.setTitle("Teste");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        JButton jButton = new JButton("Clique");
        jButton.setBounds(100,200,250,70);

        Font font = new Font("Arial",Font.BOLD,40);
        jButton.setFont(font);
        jButton.setForeground(new Color(235, 241, 238));
        jButton.setBackground(new Color(9, 10, 9));
        jButton.setFocusPainted(false);
        jFrame.add(jButton);

        num1 = new JTextField();
        num1.setBounds(100,100,100,100);
        num1.setFont(new Font("Arial",Font.ITALIC,40));

        sinal = new JTextField();
        sinal.setBounds(200,100,100,100);
        sinal.setFont(new Font("Arial",Font.ITALIC,40));


        num2 = new JTextField();
        num2.setBounds(300,100,100,100);
        num2.setFont(new Font("Arial",Font.ITALIC,40));


        jFrame.add(num1);
        jFrame.add(num2);
        jFrame.add(sinal);

        jButton.addActionListener(this::teste);

        }
        public void teste(ActionEvent actionEvent) {
        Double Num1 = Double.parseDouble(num1.getText());
        Double Num2 = Double.parseDouble(num2.getText());
        double Resultado = 0;

            switch (sinal.getText()) {
                case "+" -> Resultado = Num1 + Num2;
                case "-" -> Resultado = Num1 - Num2;
                case "*" -> Resultado = Num1 * Num2;
                case "/" -> Resultado = Num1 / Num2;
                case "**" -> Resultado = Math.pow(Num1,Num2);
                case "//" -> Resultado = Math.pow(Num1,1/Num2);
                default -> Resultado = Double.parseDouble("Você digitou algo errado");
            }


        JOptionPane.showMessageDialog(null, (Resultado), "Você escreveu",JOptionPane.ERROR_MESSAGE);
        }
}

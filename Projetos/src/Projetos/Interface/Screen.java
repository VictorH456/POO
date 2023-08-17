package Projetos.Interface;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Objects;

public class Screen {
    JTextField expressao;
    boolean verificacao = true;
    String sinal;
    String sinais_possiveis[] = {"-","*","+","**","/","//"};
    double numero1 = 0;
    double numero2 = 0;
    double Resultado;
    public Screen() {
        JFrame jFrame = new JFrame("Teste");
        jFrame.setVisible(true);
        jFrame.setSize(800,500);
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

        expressao = new JTextField();
        expressao.setBounds(100,100,250,100);
        expressao.setFont(new Font("Arial",Font.ITALIC,40));

        jFrame.add(expressao);
        jButton.addActionListener(this::teste);
        }
        public void teste(ActionEvent actionEvent) {

        String expressaodiv[] = expressao.getText().split(" ");
        sinal = expressaodiv[1];

        try {
            numero1 = Double.parseDouble(expressaodiv[0]);
            numero2 = Double.parseDouble(expressaodiv[2]);
        } catch (NumberFormatException ignored){
            sinal = "@";
        }

        Resultado = 0;

            switch (sinal) {
                case "+" -> Resultado = numero1 + numero2;
                case "-" -> Resultado = numero1 - numero2;
                case "*" -> Resultado = numero1 * numero2;
                case "/" -> Resultado = numero1 / numero2;
                case "**" -> Resultado = Math.pow(numero1,numero2);
                case "//" -> Resultado = Math.pow(numero1,1/numero2);
                default -> verificacao = false;
            }


        JOptionPane.showMessageDialog(null, ((verificacao)?Resultado:"Você digitou algo errado"), "Você escreveu",JOptionPane.ERROR_MESSAGE);
        }
}

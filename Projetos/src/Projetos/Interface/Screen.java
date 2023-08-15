package Projetos.Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Screen {
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

        jButton.addActionListener(this::teste);

        }
        public void teste(ActionEvent actionEvent) {
            JOptionPane.showMessageDialog(null,"Tudo certo");
        }
}

package Projetos.Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TesteJDV {
    public TesteJDV() {
        //Criação da tela
        JFrame jFrame = new JFrame("Jogo da Velha");
        jFrame.setVisible(true);
        jFrame.setSize(800,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        //Criação da barras


        //Criação do botão
        JButton jButton = new JButton();
        jButton.setBounds(100,200,250,70);
        jButton.setForeground(new Color(255, 255, 255));
        jButton.setBackground(new Color(255, 255, 255));
        jButton.setBorderPainted(false);
        jButton.setFocusPainted(false);
        jFrame.add(jButton);

        //Função/método do botão
        jButton.addActionListener(this::teste);

    }
    public void teste(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null,"Tudo certo");
    }
}

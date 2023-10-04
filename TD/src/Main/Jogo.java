package Main;

import javax.swing.*;

public class Jogo extends JFrame{

    private Tela tela;

    public Jogo(){

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        tela = new Tela();
        add(tela);

    }

    public static void main(String[] args){
        System.out.println("Sou O MELHOR");

        Jogo jogo = new Jogo();
    }

}


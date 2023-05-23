package br.newtonpaiva.lp.domain;
import javax.swing.*;
import java.util.jar.JarEntry;

public class Main {
    public static void main(String [] args){

        JFrame frame;
        JLabel txt1, txt2, txt3;
        JTextField t1,t2;

        // creating instance of JFrame with name "first way"
        frame=new JFrame("Sorveteria LP");

        txt1 = new JLabel("Nome do Cliente:");
        t1 = new JTextField();

        txt1.setBounds(50,50, 100,30);
        t1.setBounds(50,80,400,30);
        frame.add(txt1);
        frame.add(t1);

        txt2 = new JLabel("Escolha o sabor:");
        String sabores[]={"Chocolate","Morango","Creme","Ovomaltine","Doce de Leite"};
        JComboBox cb=new JComboBox(sabores);
        cb.setBounds(50, 150,120,20);
        txt2.setBounds(50,120,100,30);
        frame.add(cb);
        frame.add(txt2);

        txt3 = new JLabel("Quantidade:");
        t2 = new JTextField();
        txt3.setBounds(50,170, 100,30);
        t2.setBounds(50,200,70,30);
        frame.add(txt3);
        frame.add(t2);

        // creates instance of JButton
        JButton button = new JButton("Adicionar mais sabor");
        button.setBounds(50, 280, 170, 50);

        JButton button2 = new JButton("Confirmar");
        button2.setBounds(280, 280, 170, 50);

        frame.add(button);
        frame.add(button2);

        // setting close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // sets 500 width and 600 height
        frame.setSize(500, 600);

        // uses no layout managers
        frame.setLayout(null);

        // makes the frame visible
        frame.setVisible(true);
    }
}

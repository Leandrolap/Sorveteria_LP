package br.newtonpaiva.lp.domain;

import javax.swing.*;
import java.awt.*;

public class MainDescricao {
    public static void main(String [] args){
        JFrame frame;

        JLabel txt1, txt2, txt3, txt4, txt5;

        frame=new JFrame("Sorveteria LP");

        txt1 = new JLabel("Deseja colocar cobertura?");
        JRadioButton r1=new JRadioButton("SIM");
        JRadioButton r2=new JRadioButton("NÃO");
        r1.setBounds(75,50,100,30);
        r2.setBounds(75,100,100,30);
        txt1.setBounds(50,50, 100,30);
        frame.add(txt1);
        frame.add(r1);
        frame.add(r2);

        txt2 = new JLabel("Sabor da cobertura:");
        String cobertura[]={"Chocolate","Ovomaltine","Doce de Leite"};
        JComboBox cb=new JComboBox(cobertura);
        cb.setBounds(50, 150,120,20);
        txt2.setBounds(50,50, 100,30);

        txt3 = new JLabel("Tipo de recipiente:");
        String recipiente[]={"Pote","Casquinha"};
        JComboBox cbx=new JComboBox(recipiente);
        cbx.setBounds(50, 150,120,20);
        txt2.setBounds(50,50, 100,30);

        txt4 = new JLabel("Tamanho do recipiente:");
        String trecipiente[]={"Pote","Casquinha"};
        JComboBox cbxx=new JComboBox(recipiente);
        cbx.setBounds(50, 150,120,20);
        txt2.setBounds(50,50, 100,30);

        txt5 = new JLabel("Valor do sorvete:");
    }
}

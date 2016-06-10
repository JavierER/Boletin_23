package boletin_23;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class Frame {
    
    public void crearInterfaz(){
    JFrame marco = new JFrame("Boletin 23");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        
        JLabel Nombre = new JLabel("Nombre");
        JLabel Pass = new JLabel("Pass");
        JTextField Tnome = new JTextField(20);
        JPasswordField pass = new JPasswordField(20);
        JButton Pulsar = new JButton("Premer");
        JButton Limpiar = new JButton("Limpar");
        
        String[]list={"Elemento 1","Elemento 2","Elemento 3"};
        JList lista = new JList(list);
        JButton bt = new JButton("Boton");
        JTextArea txtArea=  new JTextArea(5,10);
        
        
        marco.setSize(400, 600);
        panel1.setSize(400, 300);
        panel2.setSize(400,300);
        
        Nombre.setBounds(10, 10, 150, 100);
        Pass.setBounds(10, 100, 150, 100);
        Pulsar.setBounds(150, 210, 85, 30);
        Tnome.setBounds(150, 50, 150, 30);
        pass.setBounds(150, 140, 150, 30);
        Limpiar.setBounds(250, 210, 85, 30);
        
        lista.setBounds(30, 340, 110, 50);
        bt.setBounds(30, 400, 85, 35);
        txtArea.setBounds(30, 450, 80, 40);
        
        panel1.add(Nombre);
        panel1.add(Tnome);
        panel1.add(Pass);
        panel1.add(pass);
        panel1.add(Pulsar);
        panel1.add(Limpiar);
        panel1.setBackground(Color.GREEN);
        
        panel2.add(lista);
        panel2.add(bt);
        panel2.add(txtArea);
        panel2.setBackground(Color.RED);
        
        panel1.setLayout(null);
        panel2.setLayout(null);
        marco.add(panel1);
        marco.add(panel2);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
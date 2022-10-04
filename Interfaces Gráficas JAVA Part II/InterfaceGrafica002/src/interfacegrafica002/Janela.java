package interfacegrafica002;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Janela extends JFrame implements ItemListener{
    
    JLabel label1;
    JRadioButton radio1, radio2;
    ButtonGroup radioGroup;
    
    public void criarComponentes(){
        this.label1 = new JLabel("Sharkboy");
        this.label1.setFont(new Font("Arial", Font.PLAIN, 50));
        
        this.radio1 = new JRadioButton("Negrito");
        this.radio2 = new JRadioButton("Itálico");
        this.radioGroup = new ButtonGroup();
    }
    
    private void setarAtributosButtonGroup(){
        this.radioGroup.add(this.radio1);
        this.radioGroup.add(this.radio2);
    }
    
    private void setarAtributosJanela(){
        this.setTitle("Negrito ou Itálico");
        this.setBounds(450, 280, 500, 200);
        this.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        this.getContentPane().add(this.label1);
        this.getContentPane().add(this.radio1);
        this.getContentPane().add(this.radio2);
        this.getContentPane().add(new JPanel());
    }
    
    private void addActionListeners(){
        this.radio1.addItemListener(this);
        this.radio2.addItemListener(this);
    }
    
    public Janela(){
        this.criarComponentes();
        this.setarAtributosJanela();
        this.setarAtributosButtonGroup();
        this.addActionListeners();
    }
    
    @Override
    public void itemStateChanged(ItemEvent action){
        if(action.getSource() == this.radio1)
            this.label1.setFont(new Font("Arial", Font.BOLD, 50));
        if(action.getSource() == this.radio2)
            this.label1.setFont(new Font("Arial", Font.ITALIC, 50));
    }
}

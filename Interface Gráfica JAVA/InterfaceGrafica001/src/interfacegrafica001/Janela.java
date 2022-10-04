package interfacegrafica001;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Janela extends JFrame implements ItemListener{
    
    JLabel label1;
    JCheckBox check1, check2;
    
    private void criarComponentes(){
        this.label1 = new JLabel("Sharkboy");
        
        this.label1.setFont(new Font("Arial", Font.PLAIN, 50));
        
        this.check1 = new JCheckBox("Negrito");
        this.check2 = new JCheckBox("Itálico");
    }
    
    private void setarComponentes(){
       this.setTitle("Negrito & Itálico");
       this.setBounds(450, 280, 500, 200);
       this.getContentPane().setBackground(new Color (190, 190, 190));
       this.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
       this.getContentPane().add(this.label1);
       this.getContentPane().add(this.check1);
       this.getContentPane().add(this.check2);
    }
    
    private void addActionListeners(){
        this.check1.addItemListener(this);
        this.check2.addItemListener(this);
    }
    
    public Janela(){
        this.criarComponentes();
        this.setarComponentes();
        this.addActionListeners();
    }
    
    @Override
    public void itemStateChanged(ItemEvent action){
        if(this.check1.isSelected() && this.check2.isSelected())
            this.label1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 50));
        else if(this.check1.isSelected())
            this.label1.setFont(new Font("Arial", Font.BOLD, 50));
        else if(this.check2.isSelected())
            this.label1.setFont(new Font("Arial", Font.ITALIC, 50));
        else
            this.label1.setFont(new Font("Arial", Font.PLAIN, 50));            
    }
}

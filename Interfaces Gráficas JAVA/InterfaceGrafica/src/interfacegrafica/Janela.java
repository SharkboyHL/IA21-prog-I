package interfacegrafica;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Janela extends JFrame implements ActionListener, ItemListener{
        
        JLabel label1, label2;
        JTextField tAdicionar, t1, t2;
        JComboBox combo;
        JButton novoItem;
        JPanel panel;
        
        private void criarComponentesJanela(){
            this.label1 = new JLabel("Animais") ;
            this.label2 = new JLabel("Novo Animal");
            this.label1.setForeground(Color.BLUE);
            this.label1.setFont(new Font("Arial", Font.BOLD, 15));
            this.novoItem  = new JButton("Adiciona Item");
            this.t1 = new JTextField();
            this.t2 = new JTextField();
            this.tAdicionar = new JTextField();
            
            String[] animais = {"Leão", "Elefante", "Cobra", "Jaboti"};
            combo = new JComboBox(animais);
            this.panel = new JPanel();
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.novoItem && this.tAdicionar.getText().length() != 0){
            this.combo.addItem(tAdicionar.getText());
            this.tAdicionar.setText("");
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        this.t1.setText(" O valor selecionado é: "+ this.combo.getSelectedItem().toString());
        this.t2.setText("Existem " + String.valueOf(this.combo.getItemCount()) + " itens");
    }
     
    private void setarAtributos(){
        this.setTitle("Usando JComboBox");
        this.setBounds(50, 50, 400, 170);
        this.getContentPane().setBackground(new Color (190, 190, 190));
        this.getContentPane().setLayout(new GridLayout (4,2));
        this.getContentPane().add(this.label1);
        this.getContentPane().add(this.combo);
        this.getContentPane().add(this.t1);
        this.getContentPane().add(this.t2);
        this.getContentPane().add(this.label2);
        this.getContentPane().add(this.tAdicionar);
        this.getContentPane().add(this.panel);
        this.getContentPane().add(this.novoItem);
    }
    
    private void adicionarListeners(){
        this.novoItem.addActionListener(this);
        this.combo.addItemListener(this);
    }
    
    public Janela(){
        this.criarComponentesJanela();
        this.setarAtributos();
        this.adicionarListeners();
    }
}

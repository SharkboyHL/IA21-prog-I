package interfacegrafica02;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Janela extends JFrame implements ActionListener, ItemListener{
    
    JLabel label1, label2, label3, label4, label5, label6, label7;
    JTextField t1, t2, t3, t4, t5;
    JPasswordField p1;
    JComboBox combo;
    JButton enviar;
    JPanel painel;
    
    private void criarComponentesJanela(){
        this.label1 = new JLabel("Nome Completo");
        this.label2 = new JLabel("Endereço");
        this.label3 = new JLabel("Estado");
        this.label4 = new JLabel("Telefone");
        this.label5 = new JLabel("E-mail");
        this.label6 = new JLabel("Login");
        this.label7 = new JLabel("Senha");
        
        this.label1.setFont(new Font("Arial", Font.BOLD, 15));
        this.label2.setFont(new Font("Arial", Font.BOLD, 15));
        this.label3.setFont(new Font("Arial", Font.BOLD, 15));
        this.label4.setFont(new Font("Arial", Font.BOLD, 15));
        this.label5.setFont(new Font("Arial", Font.BOLD, 15));
        this.label6.setFont(new Font("Arial", Font.BOLD, 15));
        this.label7.setFont(new Font("Arial", Font.BOLD, 15));
        
        this.p1 = new JPasswordField();
        this.p1.setEchoChar('*');
        
        this.enviar = new JButton("Enviar");
        
        this.t1 = new JTextField();
        this.t2 = new JTextField();
        this.t3 = new JTextField();
        this.t4 = new JTextField();
        this.t5 = new JTextField();
        
        String[] estados = {"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Espírito Santo", 
            "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", 
            "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", 
            "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins", "Distrito Federal"};
        combo = new JComboBox(estados);
        
        this.painel = new JPanel();
    }
    
    @Override
    public void actionPerformed(ActionEvent alert){
        if (alert.getSource() == this.enviar){
            String s = "Usuário: " + this.t1.getText() 
                    + "\nEndereço: " + this.t2.getText() 
                    + "\nEstado: " + this.combo.getSelectedItem() 
                    + "\nTelefone: " + this.t3.getText() 
                    + "\nE-mail: " + this.t4.getText() 
                    + "\nLogin: " + this.t5.getText() 
                    + "\nSenha: " + new String(this.p1.getPassword());
            JOptionPane.showMessageDialog(null, s, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    @Override
    public void itemStateChanged(ItemEvent alert){
    }
    
    private void setarAtributos(){
        this.setTitle("Cadastro de Usuário");
        this.setBounds(400, 180, 600, 400);
        this.getContentPane().setBackground(new Color(190, 190, 190));
        this.getContentPane().setLayout(new GridLayout (8,2));
        this.getContentPane().add(this.label1);
        this.getContentPane().add(this.t1);
        this.getContentPane().add(this.label2);
        this.getContentPane().add(this.t2);
        this.getContentPane().add(this.label3);
        this.getContentPane().add(this.combo);
        this.getContentPane().add(this.label4);
        this.getContentPane().add(this.t3);
        this.getContentPane().add(this.label5);
        this.getContentPane().add(this.t4);
        this.getContentPane().add(this.label6);
        this.getContentPane().add(this.t5);
        this.getContentPane().add(this.label7);
        this.getContentPane().add(this.p1);
        this.getContentPane().add(this.painel);
        this.getContentPane().add(this.enviar);
    }
    
    private void adicionarListeners(){
        this.enviar.addActionListener(this);
        this.combo.addItemListener(this);
    }
    
    public Janela(){
        this.criarComponentesJanela();
        this.setarAtributos();
        this.adicionarListeners();
    }
}
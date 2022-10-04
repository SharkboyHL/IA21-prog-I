package interfacegrafica003;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Janela extends JFrame implements ActionListener{
    
    JMenuBar menuBar; 
    JTextField t1;
    JMenu menuConta, menuAjuda;
    JMenuItem contaCorrente, contaEspecial, contaPoupanca, contaInvestimento, mSair;
    
    private void criarComponentes(){
        this.setBounds(450, 250, 480, 280);
        this.setTitle("Menu Contas");
        this.t1 = new JTextField(30);
        this.t1.setForeground(Color.blue);
        this.t1.setFont(new Font("Arial", Font.BOLD, 15));
        this.menuBar = new JMenuBar();
        this.menuConta = new JMenu("Contas");
        this.menuAjuda = new JMenu("Ajuda");
        this.contaCorrente = new JMenuItem("Conta Corrente");
        this.contaEspecial = new JMenuItem("Conta Especial");
        this.contaPoupanca = new JMenuItem("Conta Poupanca");
        this.contaInvestimento = new JMenuItem("Conta Investimento");
        this.mSair = new JMenuItem("Sair");
    }
    
    public void addComponentes(){
        this.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        this.getContentPane().add(t1);
        this.setJMenuBar(this.menuBar);
        this.menuConta.add(this.contaCorrente);
        this.menuConta.add(this.contaEspecial);
        this.menuConta.add(this.contaPoupanca);
        this.menuConta.add(this.contaInvestimento);
        this.menuBar.add(this.menuConta);
        this.menuBar.add(this.menuAjuda);
        this.menuBar.add(this.mSair);
    }
    
    public void addActionListeners(){
        this.contaCorrente.addActionListener(this);
        this.contaEspecial.addActionListener(this);
        this.contaPoupanca.addActionListener(this);
        this.contaInvestimento.addActionListener(this);
        this.mSair.addActionListener(this);
    }
    
    public Janela(){
        this.criarComponentes();
        this.addComponentes();
        this.addActionListeners();
    }
    
    @Override
    public void actionPerformed(ActionEvent action){
        if(action.getSource() == contaCorrente)
            t1.setText("Conta Escolhida: Conta Corrente");
        else if(action.getSource() == contaEspecial)
            t1.setText("Conta Escolhida: Conta Especial");
        else if(action.getSource() == contaPoupanca)
            t1.setText("Conta Escolhida: Conta Poupança");
        else if(action.getSource() == contaInvestimento)
            t1.setText("Conta Escolhida: Conta Investimento");
        else if(action.getSource() == mSair)
            System.exit(0);
    }
}

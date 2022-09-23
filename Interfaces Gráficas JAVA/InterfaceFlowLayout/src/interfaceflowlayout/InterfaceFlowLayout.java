package interfaceflowlayout;

import javax.swing.JFrame;

public class InterfaceFlowLayout {
    public static void main(String[] args) {
    
        JFrame window = new Janela();
        window.setBounds(250, 50, 280, 170);
        window.setTitle("FlowLayout");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}

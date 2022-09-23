package interfacegridlayout;

import javax.swing.JFrame;

public class InterfaceGridLayout {
    public static void main(String[] args) {

        JFrame window = new Janela();
        window.setBounds(250, 50, 600, 170);
        window.setTitle("GridLayout");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }    
}

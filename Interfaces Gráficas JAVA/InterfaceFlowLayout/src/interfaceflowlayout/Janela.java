package interfaceflowlayout;

import java.awt.*;
import javax.swing.*;

public class Janela extends JFrame{
    
    FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 10, 10);
    
    public Janela(){
        this.setLayout(layout);
        this.add(new JLabel("O rato roeu a roupa do rei de Roma"));
        this.add(new JLabel("5 minutos para daqui a pouco"));
        this.add(new JLabel("Cara caramba cara cara oh"));
        this.add(new JLabel("A"));
        this.add(new JLabel("B"));
    }
}

package ex001;
public class Ex001 {
    public static void main(String[] args) {

        // Classe mãe
        
        Bola ball = new Bola ("Vermelha", 15, "Borracha");
            
        System.out.println("Sua bola criada: ");
        System.out.println("Cor: " + ball.mostraCor());
        System.out.println("Circunferencia: " + ball.mostraCirc());
        System.out.println("Material: " + ball.mostraMater());
    }    
}

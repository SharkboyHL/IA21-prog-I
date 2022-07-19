package ex003;
public class Ex003 {
    public static void main(String[] args) {
        
        Pessoa human = new Pessoa ("Henrique", 17, 76.5, 180);
        
        System.out.println("Nome: " + human.mostrarNome());
        System.out.println("Idade: " + human.mostrarIdade());
        System.out.println("Peso: " + human.mostrarPeso());
        System.out.println("Altura: " + human.mostrarAltura());
        System.out.println("===============================");
        System.out.println("Envelhecer: " + human.envelhecer(2));
        System.out.println("Engordar: " + human.engordar(1));
        System.out.println("Emagrecer: " + human.emagrecer(3));
        System.out.println("Crescer: " + human.crescer(2));
    }    
}
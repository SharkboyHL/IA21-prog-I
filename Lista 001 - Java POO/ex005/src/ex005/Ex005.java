package ex005;
public class Ex005 {
    public static void main(String[] args) {
        
        Tamagushi bichinho = new Tamagushi("Luna", 100, 40, 10, ".");
        
        System.out.println("Nome: " + bichinho.mostrarNome());
        System.out.println("Idade: " + bichinho.mostrarIdade());
        System.out.println("Saúde: " + bichinho.mostrarSaude());
        System.out.println("Fome: " + bichinho.mostrarFome());
        System.out.println("Humor: " + bichinho.mostrarHumor());
    }
}

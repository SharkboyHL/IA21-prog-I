package diagrama2;
import java.util.Scanner;
public class Diagrama2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

//        ANIMAL
        System.out.print("Insira o nome do animal: ");
        String animalNome = scan.nextLine();
        System.out.print("Insira a raça do animal: ");
        String animalRaca = scan.nextLine();

//        CACHORRO
        System.out.print("\nInsira o nome do cachorro: ");
        String cachorroNome = scan.nextLine();
        System.out.print("Insira a raça do cachorro: ");
        String cachorroRaca = scan.nextLine();

//        GATO
        System.out.print("\nInsira o nome do gato: ");
        String gatoNome = scan.nextLine();
        System.out.print("Insira a raça do gato: ");
        String gatoRaca = scan.nextLine();

//        CRIANDO OBJETOS
        Animal animalia = new Animal(animalNome, animalRaca);
        Cachorro     dog = new Cachorro(cachorroNome, cachorroRaca);
        Gato cat = new Gato(gatoNome, gatoRaca);

//        OUTPUT: ANIMAL
        System.out.println("\n================================");
        System.out.println("O nome do seu animal: " + animalia.getNome());
        System.out.println("A raça do seu animal: " + animalia.getRaca());
        System.out.println(animalia.caminha());

//        OUTPUT: CACHORRO
        System.out.println("================================");
        System.out.println("O nome do seu cachooro: " + dog.getNome());
        System.out.println("A raça do seu cachorro: " + dog.getRaca());
        System.out.println("O som de seu latido: " + dog.latir() + " !");
        System.out.println(dog.caminha());

//        OUTPUT: GATO
        System.out.println("================================");
        System.out.println("O nome do seu gato: " + cat.getNome());
        System.out.println("A raça do seu gato: " + cat.getRaca());
        System.out.println("O som de seu miado: " + cat.miar() + " !");
        System.out.println(cat.caminha());
        System.out.println("================================");
    }
}
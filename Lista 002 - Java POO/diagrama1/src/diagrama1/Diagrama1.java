package diagrama1;
import java.util.Scanner;
public class Diagrama1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

//        EMPREGADO
        System.out.println("Cadastrando Empregado...");
        System.out.print("Insira o seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Insira o seu E-mail: ");
        String email = teclado.nextLine();
        System.out.print("Insira o seu salário (Empregado): ");
        double salario = teclado.nextDouble();

//        CHEFE
        teclado.nextLine();
        System.out.println("\nCadastrando Chefe...");
        System.out.print("Insira o seu nome: ");
        String nomeChefe = teclado.nextLine();
        System.out.print("Insira o seu E-mail: ");
        String emailChefe = teclado.nextLine();
        System.out.print("Insira o seu salário (Chefe): ");
        double salarioChefe = teclado.nextDouble();
        System.out.print("Insira o seu benefício: ");
        double beneficio = teclado.nextDouble();

//        ESTÁGIARIO
        teclado.nextLine();
        System.out.println("\nCadastrando Estágiario...");
        System.out.print("Insira o seu nome: ");
        String nomeEstagiario = teclado.nextLine();
        System.out.print("Insira o seu E-mail: ");
        String emailEstagiario = teclado.nextLine();
        System.out.print("Insira o seu salário (Estágiario): ");
        double salarioEstagiario = teclado.nextDouble();
        System.out.print("Insira o desconto do seu salário: ");
        double desconto = teclado.nextDouble();

        Empregado worker = new Empregado(1, nome, email, salario);
        Chefe boss = new Chefe(2, nomeChefe, emailChefe, salarioChefe, beneficio);
        Estagiario junior = new Estagiario(1, nomeEstagiario, emailEstagiario, salarioEstagiario, desconto);

        System.out.println("\n===================================================================");
        System.out.println("O nome do Empregado é: " + worker.getNome());
        System.out.println("O salário do Empregado antes do aumento: R$" + worker.getSalario());
        System.out.println("O salário do Empregado depois do aumento: R$" + worker.aumentoSalario(20));
        System.out.println("===================================================================");

        System.out.println("O nome do Chefe é: " + boss.getNome());
        System.out.println("O salário do Chefe antes do aumento: R$" + boss.getSalario());
        System.out.println("O salário do Chefe depois do aumento e de seus benefícios: R$" + boss.aumentoSalarial(10));
        System.out.println("===================================================================");

        System.out.println("O nome do Estágiario é: " + junior.getNome());
        System.out.println("O salário do Estágiario antes do aumento e dos descontos descontos: R$" + junior.getSalario());
        System.out.println("O salário do Estágiario depois do aumento e dos descontos: R$" + junior.aumentoSalarial(30));
        System.out.println("===================================================================");
    }
}
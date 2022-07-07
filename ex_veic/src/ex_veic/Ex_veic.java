package ex_veic;
public class Ex_veic {
    public static void main(String[] args) {
     
        Veiculos minivan = new Veiculos(7, 80, 9);
        Veiculos sportcar = new Veiculos (2, 9, 35);
        Moto moto = new Moto (2, 10, 20, "honda");
        
        System.out.print("Minvan pode transportar " + minivan.get_passageiros() + " passageiros");
        System.out.println(" com uma autonomia de " + minivan.calcular_consumo() + " quilômetros");
        System.out.print("Carro esportivo pode transportar " + sportcar.get_passageiros() + " passageiros");
        System.out.println(" com autonomia de " + sportcar.calcular_consumo() + " quilômetros");
        System.out.print("Moto " + moto.get_marca() + " pode trasnportar " + moto.get_passageiros() + "passageitos ");
        System.out.println(" com uma autonomia de " + moto.calcular_consumo() + " quilômetros");
    }
}

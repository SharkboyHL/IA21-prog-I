package ex006;
public class Ex006 {
    public static void main(String[] args) {
    
        Veiculos minivan = new Veiculos(7, 80 ,9);
        Veiculos sportcar = new Veiculos(2, 9, 35);
        Moto moto = new Moto (2, 10, 20, "Honda");
        
        System.out.print("Minivan pode transportar " + minivan.mostrarPassageiros() + " passageiros");
        System.out.println(" com uma autonomia de " + minivan.calcularConsumo() + " quilômetros");
        System.out.print("Carro esportivo pode transportar " + sportcar.mostrarPassageiros() + " passageiros");
        System.out.println(" com uma autonomia de " + sportcar.calcularConsumo() + " quilômetros");
        System.out.print("Moto " + moto.mostrarMarca() + " pode transportar " + moto.mostrarPassageiros() + " passageiros");
        System.out.println(" com uma autonomia de " + moto.calcularConsumo() + " quilômetros");
    }    
}

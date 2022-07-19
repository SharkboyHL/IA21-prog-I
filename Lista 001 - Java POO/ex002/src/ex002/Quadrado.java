package ex002;
public class Quadrado {
    private double lado;
    
    public Quadrado(double ld){
        this.lado = ld;
    }
    
    public void mudarLado(){
        this.lado = lado;
    }
    
    public double retornarLado(){
        return lado;
    }
    
    public double calcularArea(){
        return (this.lado * this.lado);
    }
}



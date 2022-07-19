package ex001;
public class Bola {
    
    // Declaração dos atributos:
    private String cor;
    private double circunferencia;
    private String material;
    
    // Metodo Construtor:
    public Bola(String color, double circ, String mater){
        this.cor = color;
        this.circunferencia = circ;
        this.material = mater;
    }
    
    // Metodos para retornarem valores
    public void trocaCor(){
        this.cor = cor;
    }
    
    public String mostraCor(){
        return this.cor;
    }
    
    public double mostraCirc(){
        return this.circunferencia;
    }
    
    public String mostraMater(){
        return this.material;
    }
}

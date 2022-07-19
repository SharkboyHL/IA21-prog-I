package ex003;
public class Pessoa {
    
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    
    public Pessoa (String name, int ida, double pes, double alt){
        
        this.nome = name;
        this.idade = ida;
        this.peso = pes;
        this.altura = alt;
    }
    
    public String mostrarNome(){
        return this.nome;
    }
    
    public int mostrarIdade(){
        return this.idade;
    }
    
    public double mostrarPeso(){
        return this.peso;
    }
    
    public double mostrarAltura(){
        return this.altura;
    }
    
    public int envelhecer(int year){
        return this.idade = idade + year;
    }
    
    public double engordar(double peso){
        return this.peso += peso;
    }
    
    public double emagrecer(double peso){
        return this.peso -= peso;
    }
    
    public double crescer(double year){
        while(year <= 21){
            this.altura = altura + 0.5;
            year++; 
        }
        return this.altura;
    }
}

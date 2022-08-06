package diagrama1;
public class Estagiario extends Empregado{

    private double descontos;
    
    public Estagiario(int cod, String name, String mail, double sal, double des){
        super(cod, name, mail, sal);
        this.descontos = des;
    }

    public String getNome(){
        return this.nome;
    }

    public double getSalario(){
        return this.salario;
    }
    
    public double aumentoSalarial(double percentual){
        return this.salario += this.salario * (percentual / 100) - this.descontos;
    }
}

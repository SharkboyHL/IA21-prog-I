package diagrama1;
public class Chefe extends Empregado{
    
    private double beneficio;
    
    public Chefe(int cod, String name, String mail, double sal, double ben){
        super(cod, name, mail, sal);
        this.beneficio = ben;
    }

    public String getNome(){
        return this.nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public double aumentoSalarial(double percentual){
        return this.salario += this.salario * (percentual / 100) + this.beneficio;
    }
}   

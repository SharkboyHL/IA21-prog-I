package diagrama1;
public class Empregado {
    
    private int codigo;
    protected String nome;
    private String email;
    protected double salario;
    
    public Empregado(int cod, String name, String mail, double sal){
        this.codigo = cod;
        this.nome = name;
        this.email = mail;
        this.salario = sal;
    }

    public String getNome(){
        return this.nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public double aumentoSalario(double percentual){
        return this.salario += this.salario * (percentual / 100);
    }
}

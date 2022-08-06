package diagrama2;
public class Animal {

    protected String nome;
    protected String raca;

    public Animal(String name, String rac){
        this.nome = name;
        this.raca = rac;
    }

    public String getNome(){
        return this.nome;
    }

    public String getRaca(){
        return this.raca;
    }

    public String caminha(){
        return "Seu animal andou !";
    }
}


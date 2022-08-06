package diagrama2;
public class Gato extends Animal{

    public Gato(String name, String rac){
        super(name, rac);
    }

    public String getNome(){
        return this.nome;
    }

    public String getRaca(){
        return this.raca;
    }

    public String miar(){
        return "meow meow";
    }

    public String caminha(){
        return "Seu gato fugiu correndo !";
    }
}

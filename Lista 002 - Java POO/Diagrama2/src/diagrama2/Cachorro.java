package diagrama2;
public class Cachorro extends Animal{

    public Cachorro(String name, String rac){
        super(name, rac);
    }

    public String getNome(){
        return this.nome;
    }

    public String getRaca(){
        return this.raca;
    }

    public String latir() {
        return "auf auf";
    }

    public String caminha(){
        return "Seu cachorro correu !";
    }
}

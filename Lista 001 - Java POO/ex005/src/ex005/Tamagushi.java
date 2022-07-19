package ex005;
public class Tamagushi {
    private String nome;
    private int fome;
    private int saude;
    private int idade;
    private String humor;
    
    public Tamagushi(String nome, int fome, int saude, int idade, String humor){
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
        this.humor = humor;
    }
    
    public String mostrarNome(){
        return nome;
    }
    
    public void trocarNome(){
        this.nome = nome;
    }
    
    public int mostrarFome(){
        return fome;
    }
    
    public void trocarFome(int fome){
        this.fome = fome;
    }
    
    public int mostrarSaude(){
        return saude;
    }
    
    public void trocarSaude(int saude){
        this.saude = saude;
    }
    
    public int mostrarIdade(){
        return idade;
    }
    
    public void trocarIdade(int idade){
        this.idade = idade;
    }
    
    public String mostrarHumor(){
        if((this.fome + this.saude) / 2 < 40){
            return this.humor = "Eu estou triste ! :^(";
        }
        else if((this.fome + this.saude) / 2 < 70){
            return this.humor = "Eu estou normal ! :^/";
        }
        else{
            return this.humor = "Eu estou feliz ! :^D";
        }
    }
}

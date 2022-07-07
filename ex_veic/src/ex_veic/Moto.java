package ex_veic;
public class Moto extends Veiculos{
    private String marca;
    
    public Moto(int pass, int comb, int cons, String mar){
        super(pass, comb, cons);
        this.marca = mar;
    }
    
    public String get_marca(){
        return this.marca;
    }
}

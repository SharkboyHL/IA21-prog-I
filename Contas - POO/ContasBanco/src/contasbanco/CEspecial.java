package contasbanco;
public class CEspecial extends CCorrente{
       
    private int limite;
    
    public CEspecial(int num, double sal, Cliente client, int lim){
        super(num, sal, client);
        this.limite = lim;
    }
    
    @Override
    public void sacar(double valor){
        if(valor <=(super.getSaldo() + this.limite)){
            super.setSaldo(super.getSaldo() - valor);
        }
        else{
            System.out.println("Saldo Insuficiente !");
        }
    }
    
    public String toString(){
        return (super.toString() + " Limite: R$" + this.limite);
    }
}

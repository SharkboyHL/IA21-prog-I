package contasbanco;
public class CCorrente {
    
    private int numero;
    private double saldo;
    private Cliente cliente;
    
    public CCorrente(int num, double sal, Cliente client){
        this.numero = num;
        this.saldo = sal;
        this.cliente = client;
    }
    
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
    
    public void sacar(double valor){
        if (valor <= this.saldo){
            this.saldo = this.saldo - valor;
        }
        else{
            System.out.println("Saldo Insuficiente !");
        }
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    @Override
    public String toString(){
        return(this.cliente + " Conta:" + this.numero + " Saldo: R$" + this.saldo);
    }
}

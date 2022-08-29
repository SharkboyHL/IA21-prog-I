package contasbanco;
import java.util.Calendar;
public class CInvestimento extends CCorrente{
    
    private int diaInvestimento;
    private int periodo;
    
    public CInvestimento(int num, double sal, Cliente client, int diainvest, int per){
        super(num, sal, client);
        this.diaInvestimento = diainvest;
        this.periodo = per;
    }
    
    public void atualizarSaldo(){
        Calendar dataAtual = Calendar.getInstance();
        int dia = dataAtual.get(Calendar.DAY_OF_MONTH);
        if(dia == (this.diaInvestimento + periodo))
        super.setSaldo(super.getSaldo() * 1.20);
        else
            System.out.println("Não encerrou o período de investimento");
    }
    
    public String toString(){
        return(super.toString() + " Dia Investimento:" + this.diaInvestimento + " Periodo:" + this.periodo);
    }
}

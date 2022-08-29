package contasbanco;
import java.util.ArrayList;
import java.util.List;
public class ListaContas {
    
    private List<CCorrente> contas;
    
    public ListaContas(){
        contas = new ArrayList<CCorrente>();
    }
    
    public void addContas(CCorrente cc){
        contas.add(cc);
    }
    
    public void imprimeContas(){
        for(CCorrente cc:contas)
            System.out.println(cc);
    }
}

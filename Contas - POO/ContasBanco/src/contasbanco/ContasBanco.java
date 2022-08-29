package contasbanco;
public class ContasBanco {
    public static void main(String[] args) {
     
        ListaContas listac = new ListaContas();
        
        Cliente client1 = new Cliente ("Ana", "10010010010");
        CCorrente conta1 = new CCorrente (1, 1000, client1);
            listac.addContas(conta1); 
        Cliente client2 = new Cliente ("Joao", "20020020020");
        CEspecial conta2 = new CEspecial (2, 2000, client2, 5000);
            listac.addContas(conta2);
        Cliente client3 = new Cliente ("Claudia", "30030030030");
        CPoupanca conta3 = new CPoupanca (3, 1000, client3, 1000);
            listac.addContas(conta3);
        Cliente client4 = new Cliente ("Cida", "40040040040");
        CInvestimento conta4 = new CInvestimento (4, 1000, client4, 8, 10);
            listac.addContas(conta4);
        Cliente client5 = new Cliente ("Eva", "50050050050");
        CInvestimento conta5 = new CInvestimento (5, 1000, client5, 1, 10);
            listac.addContas(conta5);
            
        //CONTA CORRENTE
        
        conta1.depositar(2000);
        conta1.depositar(500);
        
        System.out.println("=======================================");
        System.out.println("Seu saldo é: " + conta1.getSaldo());
        conta1.sacar(1000);
        System.out.println("Seu saldo é: " + conta1.getSaldo());
        System.out.println("=======================================");
        
        //CONTA ESPECIAL
        
        conta2.depositar(10000);
        conta2.depositar(3000);
        
        System.out.println("Seu saldo é: " + conta2.getSaldo());
        
        conta2.sacar(2000);
        
        System.out.println("Seu saldo é: " + conta2.getSaldo());
        System.out.println("=======================================");
        
        //CONTA POUPANCA
        
        conta3.sacar(1500);
        conta3.sacar(500);
        
        System.out.println("Seu saldo é: " + conta3.getSaldo());
        System.out.println("Seu saldo mínimo é: " + conta3.getSaldoMinimo());
        
        conta3.depositar(1500);
        
        System.out.println("Seu saldo é: " + conta3.getSaldo());
        System.out.println("Seu saldo mínimo é: " + conta3.getSaldoMinimo());
        
        conta3.atualizarSaldo();
        
        System.out.println("Seu saldo é: " + conta3.getSaldo());
        System.out.println("Seu saldo mínimo é: " + conta3.getSaldoMinimo());
        System.out.println("=======================================");
        
        
        //CONTA INVESTIMENTO
        
        conta4.atualizarSaldo();
        
        System.out.println("Seu saldo é: " + conta4.getSaldo());
        
        conta5.atualizarSaldo();
        
        System.out.println("Seu saldo é: " + conta5.getSaldo());
        System.out.println("=======================================");
        
        listac.imprimeContas();
        System.out.println("=======================================");
   }
}

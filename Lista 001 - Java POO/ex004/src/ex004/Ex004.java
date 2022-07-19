package ex004;
public class Ex004 {
    public static void main(String[] args) {
        
        Tv tv = new Tv(58, 20);
        
        System.out.println("Canal: " + tv.trocarCanal(56));
        System.out.println("Aumentar volume: " + tv.aumentarVolume());
        System.out.println("Diminuir volume: " + tv.diminuirVolume());
    }    
}

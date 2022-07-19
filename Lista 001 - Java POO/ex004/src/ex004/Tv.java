package ex004;
public class Tv {
    
    private int volume; 
    private int canal;
    
    public Tv(int vol,  int channel){
        this.volume = vol;
        this.canal = channel;
    }
    
    public int trocarCanal(int channel){
        if((channel > 0) && (channel <= 100)){
            this.canal = channel;
        }
        return channel;
    }
    
    public int aumentarVolume(){
        if(volume < 100){
            this.volume++;
        }
        return volume;
    }
    
    public int diminuirVolume(){
        if(volume > 0){
            this.volume--;
        }
        return volume;
    }
}

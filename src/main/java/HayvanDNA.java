
public class HayvanDNA extends TemelDNA{
    public HayvanDNA(String dizilim, String organizmaAdi)
    {
        super(dizilim,organizmaAdi);
    }
    
    @Override
    public void mutasyonYap()
    {
        System.out.println("Hayvan DNA'sı mutasyonu uygulandı.");
    }
    
    @Override
    public double GCOraniniHesapla() {
        int gcCount = 0;
        for (char base : getDizilim().toCharArray()) {
            if (base == 'G' || base == 'C') {
                gcCount++;
            }
        }
        return (gcCount / (double) getDizilim().length()) * 100;
    }
    
}
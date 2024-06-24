package train;

public class WagonMarchandise extends Wagon{
    private final static float volumeMax=72;
    private float volume;
    private static int nombreWagonsMarchandise=0;
    public WagonMarchandise(String code, String decription,float volume) {
        super(code, decription);
        this.volume=volume;
    }
    public void setvolume(float volume){
        this.volume=volume;
    }
    public float getvolume(){
        return volume;
    }
    public static float getvolumeMax(){
        return volumeMax;
    }
    public static int getnombreWagonsMarchandise(){
        return nombreWagonsMarchandise;
    }
    public static void setnombreWagonsMarchandise(int nombreWagonsMarchandise){
        WagonMarchandise.nombreWagonsMarchandise=nombreWagonsMarchandise;
    }

    @Override
    public String toString() {
        return "WagonsMarchandise[ "+super.getCode()+",volume= "+volume+",volumeMax= "+volumeMax+",nombreWagonsMarchandise "+nombreWagonsMarchandise+ "]";
    }
}

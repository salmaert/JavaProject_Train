package train;

public class WagonMinerai extends Wagon{
    private final static float tonnageMax=22;
    private float tonnage;
    private static int nombreWagonsMinerai=0;
    public WagonMinerai(String code, String decription,float tonnage) {
        super(code, decription);
        this.tonnage=tonnage;
    }
    public void setTonnage(float tonnage){
        this.tonnage=tonnage;
    }
    public float getTonnage(){
        return tonnage;
    }
    public static float getTonnageMax(){
        return tonnageMax;
    }
    public void setNombreWagonsMinerai(int nombreWagonsMinerai){
        WagonMinerai.nombreWagonsMinerai=nombreWagonsMinerai;
    }
    public float getNombreWagonsMinerai(){
        return nombreWagonsMinerai;
    }

    @Override
    public String toString() {
        return "WagonsMarchandise["+super.getCode()+",tonnage= "+tonnage+",tonnageMax= "+tonnageMax+"nombreWagonsMinerai "+nombreWagonsMinerai+ "]";
    }
}

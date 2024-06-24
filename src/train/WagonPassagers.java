package train;

public class WagonPassagers extends Wagon{

    private final static int nombrepassagersMax=50;
    private int passagers;
    private static int nombreWagonsPassagers=0;
    public WagonPassagers(String code, String decription,int passagers) {
        super(code, decription);
        this.passagers=passagers;
    }
    public void setPassagers(int passagers){
        this.passagers=passagers;
    }
    public int getpassagers(){
        return passagers;
    }
    public static int getNombrepassagersMax(){
        return nombrepassagersMax;
    }
    public void setNombreWagonsPassagers(int nombreWagonsPassagers){
        WagonPassagers.nombreWagonsPassagers=nombreWagonsPassagers;
    }
    public int getNombreWagonsPassagers(){
        return nombreWagonsPassagers;
    }
    @Override
    public String toString() {
        return "WagonsPassagers["+super.getCode()+",passagers= "+passagers+",nombrepassagersMax= "+nombrepassagersMax+",nombreWagonsPassagers "+nombreWagonsPassagers+ "]";
    }
}

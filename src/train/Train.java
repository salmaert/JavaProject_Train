package train;

import java.util.ArrayList;

public class Train {
    private String code;
    private Personnel conducteur;
    private TypeTrain type;
    private int longueur;
    private ArrayList<Wagon> wagons;
    public Train(String code,Personnel conducteur,TypeTrain type){
        this.code=code;
        this.conducteur=conducteur;
        this.type=type;
        this.longueur=0;
        this.wagons=new ArrayList<>();
    }
    public Train(String code,Personnel conducteur,TypeTrain type,ArrayList<Wagon> wagons){
        this.wagons=new ArrayList<>(wagons);
        this.code=code;
        this.conducteur=conducteur;
        this.type=type;
        this.longueur=wagons.size();
    }
    public int getLongueur(){
        return longueur;
    }
    public void setLongueur(int longueur){
        this.longueur=longueur;
    }
    public void setConducteur(Personnel conducteur){
        this.conducteur=conducteur;
    }
    public Personnel getConducteur(){
        return conducteur;
    }
    public void setCode(String code){
        this.code=code;
    }
    public String getCode(){
        return code;
    }
    public void setType(TypeTrain type){
        this.type=type;
    }
    public TypeTrain getType(){
        return type;
    }
    public void setWagons( ArrayList wagons){
        this.wagons=wagons;
    }
    public ArrayList getWagons(){
        return wagons;
    }


    //Ajouter WagonsPassagers
    public void ajouterWagonsPassagers(String code,String description,int nombrepassagers) throws TrainWagonIncompatibleException{
        if (this.type != TypeTrain.Passagers) throw new TrainWagonIncompatibleException("Type wagon non autorise pour ce type de train");
        {
            wagons.add(new WagonPassagers(code,description,nombrepassagers));
            this.longueur++;
        }
    }
    //Ajouter WagonsMinerai

    public void ajouterWagonMinerai(String code,String description,float tonnage)throws TrainWagonIncompatibleException{
        if (this.type != TypeTrain.Minerai) throw new TrainWagonIncompatibleException("Type wagon non autorise pour ce type de train");
        {
            wagons.add(new WagonMinerai(code,description,tonnage));
            this.longueur++;
        }
    }
    public void ajouterWagonMarchandise(String code,String description,float volume) throws TrainWagonIncompatibleException {
        if (this.type != TypeTrain.Marchandise) throw new TrainWagonIncompatibleException("Type wagon non autorise pour ce type de train");
        {
            wagons.add(new WagonMarchandise(code,description,volume));
            this.longueur++;
        }
    }

    public void ajouterWagon(Wagon wagon) throws TrainWagonIncompatibleException{
        if (((this.type==TypeTrain.Marchandise) && (wagon instanceof WagonMarchandise)) || ((this.type==TypeTrain.Minerai) && (wagon instanceof WagonMinerai)) || ((this.type==TypeTrain.Passagers) && (wagon instanceof WagonPassagers)) || (((this.type==TypeTrain.PassagersMarchandise) && (wagon instanceof WagonMarchandise)) || ((this.type== TypeTrain.Passagers) && (wagon instanceof WagonPassagers)))) {
          wagons.add(wagon);
          this.longueur++;
        }
        else {
            throw new TrainWagonIncompatibleException("Type wagon non autorise pour ce type de train");
        }
    }

    // Ajouter supprimerWagons
    public boolean supprimerWagon(String code){
        boolean sup=false;
        for (Wagon w: wagons){
            if (w.getCode().equals(code)) {
                wagons.remove(w);
                sup = true;
                this.longueur--;
            }
            return sup;
        }
        return sup;
    }

    public void afficherCharge(){
        float volumetotal=0;
        float tonnagetotal=0;
        int nombretotal=0;
        switch (type) {

            case Minerai:
                for (Wagon w : wagons) {
                    if (w instanceof WagonMinerai)
                    tonnagetotal += ((WagonMinerai) w).getTonnage();
                }
                System.out.println("le tonnage total est : " + tonnagetotal);
                break;


            case Marchandise:
                for (Wagon w : wagons) {
                    if (w instanceof WagonMarchandise) {
                        volumetotal += ((WagonMarchandise) w).getvolume();

                    }

                }
                System.out.println("le volume total est : " + volumetotal);
                break;


            case Passagers:
                for (Wagon w : wagons) {
                    if (w instanceof WagonPassagers)
                    nombretotal += ((WagonPassagers) w).getpassagers();
                }
                System.out.println("le nombre total des passagers est : " + nombretotal);
                break;

            case PassagersMarchandise:
                for (Wagon w : wagons) {
                    if (w instanceof WagonPassagers) {
                        nombretotal += ((WagonPassagers) w).getpassagers();
                    } else {
                        volumetotal += ((WagonMarchandise) w).getvolume();
                    }
                }
                System.out.println("le nombre total est :" + nombretotal + " et le volume total est : " + volumetotal);
                break;
        }

    }

}

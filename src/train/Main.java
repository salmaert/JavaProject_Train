package train;
 I
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Wagon> wagons=new ArrayList<>();
        Wagon wagon1=new WagonMarchandise("R325","train",20);
        Wagon wagon2=new WagonMarchandise("L385","train",40);

        Wagon wagon3=new WagonMinerai("M325","train",300);
        Wagon wagon4=new WagonMinerai("N325","train",400);

        Wagon wagon5= new WagonPassagers("0325","train",500);
        Wagon wagon6=new WagonPassagers("P325","train",600);

        Wagon wagon7=new WagonMarchandise("Q325","train",900);
        Wagon wagon8=new WagonMarchandise("Q25","train",800);

        wagons.add(wagon1);
        wagons.add(wagon2);
        wagons.add(wagon3);
        wagons.add(wagon4);
        wagons.add(wagon5);
        wagons.add(wagon6);
        wagons.add(wagon7);

        wagons.forEach(System.out::println);

        /* for (Wagon w :wagons){
            System.out.println(w);
        } */
        Personnel p1=new Personnel("5879","ali","rafik");
        Train train=new Train("T154",p1,TypeTrain.Minerai);

        try{
            //train.ajouterWagonMarchandise("Q25","train",800);
            ///System.out.println(train.getLongueur());
            train.ajouterWagon(wagon3);
            System.out.println(train.getLongueur());

        }catch (TrainWagonIncompatibleException e){
            System.out.println(e.getMessage());
        }

        Personnel p2=new Personnel("5879","mohame2","rafik");
        Train train1=new Train("T154",p2,TypeTrain.Marchandise,wagons);
        train1.afficherCharge();

        }

}
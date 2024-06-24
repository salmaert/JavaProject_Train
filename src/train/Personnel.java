package train;

public class Personnel {
    private String matricule;
    private String nom;
    private String prenom;

    public Personnel(String matricule,String nom,String prenom){
        this.matricule=matricule;
        this.nom=nom;
        this.prenom=prenom;
    }

    public String getMatricule(){
        return matricule;
    }
    public void setMatricule(String matricule){
        this.matricule=matricule;
    }
    public String geNom(){
        return nom;
    }
    public void setNom(String Nom){
        this.nom=nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public void setprenom(String prenom){
        this.prenom=prenom;
    }

    @Override
    public String toString() {
        return "Personnel[ "+matricule+",prenom= "+prenom+" nom= "+nom+"]";
    }

}

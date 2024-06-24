package train;

public abstract class Wagon {
    private String code;
    private String description;

    public Wagon(String code,String decription){
        this.code=code;
        this.description=decription;
    }
    public void setCode(String code){
        this.code=code;
    }
    public String getCode(){
        return code;
    }
    public void setDescription(String code){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }

    @Override
    public String toString() {
        return "code="+code+",description="+description;
    }
}

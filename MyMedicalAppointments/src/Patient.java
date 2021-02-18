import org.jetbrains.annotations.NotNull;

public class Patient extends User{
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Patient(String name, String email){
        super(name, email);
    }//Fin método paciente

    //Getters y Setters
    public void setWeight(double weight){
        this.weight= weight;
    }//Fin setter

    public String getWeight(){
        return this.weight + " Kg.";
    }//Fin getter

    public String getHeight() {
        return height + "Mtrs.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

}//Fin clase

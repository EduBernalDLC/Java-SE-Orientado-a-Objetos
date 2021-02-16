import org.jetbrains.annotations.NotNull;

public class Patient {

    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Patient(String name, String email){
        this.name= name;
        this.email= email;
    }//Fin método paciente

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() != 8){
            System.out.println("Debes asignar 8 dígitos");
        }else{
            this.phoneNumber = phoneNumber;
        }//Fin else if
    }//Fin setPhone Number


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

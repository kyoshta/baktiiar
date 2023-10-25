package exceptions.custom_exceptions;

public class Account {
    public String name;
    public String dob;
    public char gender;

    public Account(String name, String dob, char gender) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }

    public String setProfilePhoto(){
        return "loading the photo";
    }
}

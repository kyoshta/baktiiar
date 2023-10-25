package oop.inheritance.wagroup;

import java.util.LinkedHashMap;
import java.util.LinkedList;


public class Contacts {
    public String name;
    public int phoneNumber;
    public String gender;
    public boolean avatar;

    public Contacts(String name, int phoneNumber, String gender, boolean avatar) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.avatar = avatar;
    }
    public Contacts(){

    }
    public String toMassage() {
        return "hi";
    }

    public String toSendVoice() {
        return "salam";
    }

    public String sendVideo(boolean vid) {
        if (vid == true){
            return "send video";
    }
    return"can't send video";
}
    public String videoCall(boolean inNetwork){
        if (inNetwork == true){
            return "calling";
        }
        return "out of network";
    }
public LinkedHashMap<Integer, String> listOfMembers (LinkedList<Contacts> list){
        LinkedHashMap<Integer, String> contacts = new LinkedHashMap<>();
        for (int i = 0; i < list.size(); i++){
            contacts.put(list.get(i).phoneNumber, list.get(i).name);
        }
        return contacts;
}
    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", gender='" + gender + '\'' +
                ", avatar=" + avatar +
                '}';
    }
}

package Java_App;

public class StepItUpContacts {

    private int ID;
    private int user_id;
    private String first_name;
    private String family_name;
    private String mobile_number;
    private String email;
    private String address;
    private byte[] picture;

    // alt + ins
    //to generate constructor and getters and setters


    public StepItUpContacts() { }


    public StepItUpContacts(int ID, int user_id, String first_name, String family_name, String mobile_number, String email, String address, byte[] picture) {
        this.ID = ID;
        this.user_id = user_id;
        this.first_name = first_name;
        this.family_name = family_name;
        this.mobile_number = mobile_number;
        this.email = email;
        this.address = address;
        this.picture = picture;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getFamily_name() {
        return family_name;
    }

    public void setFamily_name(String family_name) {
        this.family_name = family_name;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
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

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
}

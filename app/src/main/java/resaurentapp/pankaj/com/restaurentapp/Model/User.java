package resaurentapp.pankaj.com.restaurentapp.Model;

public class User {

    private String Name;
    private String Password;

    public String getIsStaff() {
        return isStaff;
    }

    public void setIsStaff(String isStaff) {
        this.isStaff = isStaff;
    }

    private  String isStaff;

    public String getPhone() {
        return Phone;
    }


    private String Phone;

public User()
{

}

    public User(String name, String password) {
        Name = name;
        Password = password;
        isStaff="false";

    }
    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}


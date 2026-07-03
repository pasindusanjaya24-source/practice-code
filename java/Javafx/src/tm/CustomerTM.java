package tm;

import javafx.scene.control.TableColumn;

public class CustomerTM extends TableColumn<CustomerTM, Object> {
private String Cid;
private String Name;
private String Address;
private String phone_Number;

    public CustomerTM(String name, String cid, String address, String phone_Number) {
        this.Name = name;
        this.Cid = cid;
        this.Address = address;
        this.phone_Number = phone_Number;
    }

    public CustomerTM() {

    }

    public String getCid() {
        return Cid;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setCid(String cid) {
        Cid = cid;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
    }



}

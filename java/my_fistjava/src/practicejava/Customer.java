package practicejava;

public class Customer {
	private String name;
	private String address;
	private String nic;
	private int age;
	
	Customer(){ //no arg constructor
	}
	Customer(String name,String address,String nic,int age){              //full args constructor
		this.name=name;
		this.address=address;
		this.nic=nic;
		this.age=age;
	 
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public void setNic(String nic) {
		this.nic=nic;
	}
	public void setAge(int age) {
		if (age > 0) { 
            this.age = age;
        }
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getNic() {
		return nic;
	}
	public int getAge() {
		return age;
	}
}

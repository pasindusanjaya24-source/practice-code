package practicejava;

public class Customer {
	private String name;
	private String address;
	private String nic;
	private int age;
	
	
	public Customer() {
		
	}
	
	public Customer(String name, String address, String nic, int age) {
		this.name = name;
		this.address = address;
		this.nic = nic;
		this.age = age;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

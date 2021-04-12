

public class Expend {
	int birth;
	String name;
	String email;
	String phone;
	
	public Expend() {
		
	}
	
	public Expend(int birth, String name) {
		this.birth = birth;
		this.name = name;
	}
	
	public Expend(int birth, String name, String email, String phone) {
		this.birth = birth;
		this.name = name;
		this.email = email;
		this.phone = phone;			
	}
	
	public void printInfo() {
		System.out.println("Birth: " + birth + "Name: " + name + "Email: " + email + "Phone: " + phone);
		}
}



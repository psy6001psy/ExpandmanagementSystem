package Expend;

import java.util.Scanner;

public class Expend {
	

	ExpendKind kind = ExpendKind.Man;
	String birth;
	String name;
	String email;
	String phone;
	
	public Expend() {
		
	}
	
	public Expend(String birth, String name) {
		this.birth = birth;
		this.name = name;
	}
	
	public Expend(String birth, String name, String email, String phone) {
		this.birth = birth;
		this.name = name;
		this.email = email;
		this.phone = phone;			
	}
	
	public ExpendKind getKind() {
		return kind;
	}

	public void setKind(ExpendKind kind) {
		this.kind = kind;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void printInfo() {
		System.out.println(" Birth : " + birth);
		System.out.println(" Name : " + name);
		System.out.println(" Email : " + email);
		System.out.println(" Phone: " + phone);
		}

	public void getUserInput(Scanner input) {
		System.out.print("Consumer Birth input: ");		
		String birth = input.next();
		this.setBirth(birth);
		
		System.out.print("Consumer Name input: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Consumer Email input: ");
		String email = input.next();
		this.setEmail(email);
		
		System.out.print("Consumer PhoneNum input: ");
		String phone = input.next();
		this.setPhone(phone);
	}
	
}

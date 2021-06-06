package Expend;

import java.io.Serializable;
import java.util.Scanner;

import exception.EmailFormatException;

public abstract class Expend implements ExpendInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5124264967743426116L;
	ExpendKind kind = ExpendKind.Man;
	String birth;
	String name;
	String email;
	String phone;
	
	public Expend() {
	}
	
	public Expend(ExpendKind kind) {
		this.kind = kind;
	}
	
	public Expend(String birth, String name) {
		this.birth = birth;
		this.name = name;
	}
	
	public Expend(ExpendKind kind, String birth, String name, String email, String phone) {
		this.kind = kind;
		this.birth = birth;
		this.name = name;
		this.email = email;
		this.phone = phone;			
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

	public void setEmail(String email) throws EmailFormatException {
		if (!email.contains("@") && !email.equals("")) {
			throw new EmailFormatException();
		}
		
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public abstract void printInfo();
	
	public void setExpendBirth(Scanner input) {
		System.out.print("Consumer Birth:");
		String birth = input.next();
		this.setBirth(birth);
	}
	
	public void setExpendName(Scanner input) {
		System.out.print("Consumer Name:");
		String name = input.next();
		this.setName(name);
	}
	
	public void setExpendEmail(Scanner input) {
		String email = "";
		while (email.contains("@")) {
		
		System.out.print("Consumer Email:");
		email = input.next();
		try {
			this.setEmail(email);;
		} catch(EmailFormatException e) {
			System.out.println("Incorrect Email Format. put your e-mail address that contains @");
				e.printStackTrace();
			}
		}
	}
	
	
	public void setExpendPhone(Scanner input) {
		System.out.print("Consumer PhoneNum:");
		String phone = input.next();
		this.setPhone(phone);
	}

	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case Man:
			skind = "Man";
			break;
		case Woman :
			skind = "Woman";
		case Boy:
			skind = "Boy";
			break;
		case Girl:
			skind = "Gril";
			break;
		default :
		}
		return skind;
	}
	
}
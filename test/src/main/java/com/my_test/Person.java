package com.my_test;

public class Person {
	private String name;
    private String phone_number;
    private int id;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getPersonNum() {
        return phone_number;
    }

    public void setPersonNum(String phone_number) {
        this.phone_number = phone_number;
    }



    @Override
    public String toString() {
        return String.format("Person{name='%s', phone_number='%s'}", name, phone_number);
    }
}

package com.demo.beans;

public class Person {
    private int id;
  private String name;
  private int mob;
public Person() {
	super();
}

@Override
public String toString() {
	return "id=" + id + ", name=" + name + ", mob=" + mob ;
}

public Person(int id, String name, int mob) {
	super();
	this.id = id;
	this.name = name;
	this.mob = mob;
}

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
public int getMob() {
	return mob;
}
public void setMob(int mob) {
	this.mob = mob;
}
   
}

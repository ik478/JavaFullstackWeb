package com.example.demo;
import java.lang.*;

public class UserData {

private String name;
private int age;
private boolean male;

public String getName(){
 return name;
}

public void setName(String name){
 this.name=name;
}

public int getAge(){
 return age;
}

public void setAge(int age){
    if (age>110){
        throw new IllegalArgumentException("wrong");
    }
    this.age=age;
}
public boolean isMale(){
    return male;
}
public void setMale(boolean male){
this.male=male;
}
}
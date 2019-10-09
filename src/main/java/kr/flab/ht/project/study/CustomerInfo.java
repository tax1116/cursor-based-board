package kr.flab.ht.project.study;

public class CustomerInfo {
    public String id;
    public String name;
    public String phone;
    public String email;
    public String password;

    public CustomerInfo(){

    }

    public CustomerInfo(String id){
        this.id = id;
    }

    public CustomerInfo(String id, String name){
        this.id = id;
        this.name = name;
    }

    public CustomerInfo(String id, String name, String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public CustomerInfo(String id, String name, String phone, String email){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public CustomerInfo(String id, String name, String phone, String email, String password){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public String toString(CustomerInfo obj){
        return "Id= " + id + " name= " + name + " phone= " + phone + " email= " + email + " password= " + password;
    }
}

package com.mateo9x;

public class PhoneController {

private Phone phone;
private PhoneView phoneView;


//constructors
public PhoneController(Phone phone, PhoneView phoneView){
    this.phone = phone;
    this.phoneView = phoneView;
}

//getters & setters
public void setPhoneBrand(String brand) {
        phone.setBrand(brand);
    }

    public void setPhoneModel(String model) {
        phone.setModel(model);
    }

    public String getPhoneBrand(){
        return phone.getBrand();
    }

    public String getPhoneModel(){
        return phone.getModel();
    }

    //view update
    public void updateView(){
        phoneView.printPhoneDetails(phone.getBrand(),phone.getModel());
    }

}

package com.mateo9x;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Phone phone = phoneFromDB();
        PhoneView view = new PhoneView();
        PhoneController controller = new PhoneController(phone, view);


        //first print
        controller.updateView();

        controller.setPhoneBrand("Apple");
        controller.setPhoneModel("X");

        //second print
        controller.updateView();


        //another print using data typed by user
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter phone brand: ");
        controller.setPhoneBrand(scan.next());
        System.out.printf("Enter phone model: ");
        controller.setPhoneModel(scan.next());
        scan.close();
        controller.updateView();

        System.out.printf("%n%n");


        //new collection
        List<String> collection = new ArrayList<String>();
        collection.add("Xiaomi");
        collection.add("Apple");
        collection.add("Samsung");
        collection.add("Motorola");

        //displaying elements added to collection above by for each loop
        System.out.printf("%nNON SORTED LIST:%n");
        collection.forEach(name -> {
            System.out.println(name);
            });

        //lambda expression for sorting list
        collection.sort((s1, s2) -> s1.compareTo(s2));

        System.out.printf("%nSORTED LIST:%n");

        //displaying elements sorted
        collection.forEach(name -> {
            System.out.println(name);
        });

        Thread finalThread= new Thread(()-> {
            try{
                throw new Exception("Im a exception!");
            } catch(Exception e){
                throw new RuntimeException(e);
            }

        });
        
        finalThread.start();


    }

        private static Phone phoneFromDB () {
            Phone phone = new Phone("Samsung", "Galaxy");
            return phone;
        }



}

package com.manchesterdigital;


import java.util.NoSuchElementException;

public class Phone {
    private Boolean isOn;
    private Boolean hasCamera;
    private Boolean isCharged;
    private Integer numberOfCalls;

    public Boolean getOn() {
        return isOn;
    }

    public Phone(Boolean hasCamera) {
        this.hasCamera = hasCamera;
        isOn = false;
        isCharged = true;
        numberOfCalls = 0;
    }

    public void turnOnOff() {
        if(!isOn) {
            if(isCharged) {
                isOn = true;
                System.out.println("Phone is switching on...");
            } else {
                System.out.println("Charge your phone");
            }

        } else {
            isOn = false;
            System.out.println("Phone is switching off...");
        }
    }

    public void takeAPicture() {
        if(hasCamera) {
            System.out.println("Picture taken");
        } else {
            System.out.println("No camera available");
        }
    }

    public void playGame(String game) {
        if(game.equals("Angry Birds")) {
            System.out.println("Playing Angry Birds");
        } else {
            System.out.println("No game available");
        }
    }

    public void makeACall(String contact) {
        System.out.println("Calling " + contact);
        numberOfCalls++;
        if (numberOfCalls > 5) {
            numberOfCalls = 0;
            turnOnOff();
        }
    }

    public static void main(String[] args) {
        Phone phone = new Phone(true);

        phone.turnOnOff();
        phone.turnOnOff();
        phone.turnOnOff();

        System.out.println(phone.getOn());
        phone.makeACall("John");
        phone.makeACall("John");
        phone.makeACall("John");
        phone.makeACall("John");
        phone.makeACall("John");
        phone.makeACall("John");
        System.out.println(phone.getOn());


    }
}

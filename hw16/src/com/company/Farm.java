package com.company;

public class Farm {
    String address;
    Cow[] cows;
    Sheep[] sheep;
    Horse[] horses;
    String nameOfOwner;

    public Farm() {
    }

    public Farm(String address, int numberOfCows, int numberOfSheep, int numberOfHorses, String nameOfOwner) {
        this.address = address;
        this.cows = new Cow[numberOfCows];
        this.sheep = new Sheep[numberOfSheep];
        this.horses = new Horse[numberOfHorses];
        this.nameOfOwner = nameOfOwner;
    }

    public void printInfo(){
        System.out.println("Farm owner is "+ nameOfOwner + ". Address: " + address + ".");
        for(int i = 0; i < cows.length; i++){
            if (cows[i] != null)
                cows[i].printInfo();

        }

        for(int i = 0; i < sheep.length; i++){
            if(sheep[i] != null)
                sheep[i].printInfo();

        }
        for(int i = 0; i < horses.length; i++){
           if(horses[i] != null)
               horses[i].printInfo();



        }


    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    } 

    public Cow[] getCows() {
        return cows;
    }

    public boolean addCow(Cow cows){
        for(int i = 0; i < this.cows.length;i++){
            if(this.cows[i] == null){
                this.cows[i] = cows;
                return true;
            }
        }

        return false;
    }

    public boolean deleteCow(int indexOfCow){
        if(indexOfCow >= 0 && indexOfCow < cows.length){
            cows[indexOfCow] = null;
            return true;

        }
        return false;

    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public boolean addSheep(Sheep sheep){
        for(int i = 0; i < this.sheep.length;i++){
            if(this.sheep[i] == null){
                this.sheep[i] = sheep;
                return true;
            }
        }

        return false;
    }

    public boolean deleteSheep(int indexOfSheep){
        if(indexOfSheep >= 0 && indexOfSheep < sheep.length){
            sheep[indexOfSheep] = null;
            return true;

        }
        return false;

    }

    public Horse[] getHorses() {
        return horses;
    }

    public boolean addHorse(Horse horses){
        for(int i = 0; i < this.horses.length;i++){
            if(this.horses[i] == null){
                this.horses[i] = horses;
                return true;
            }
        }

        return false;
    }

    public boolean deleteHorse(int indexOfHorse){
        if(indexOfHorse >= 0 && indexOfHorse < horses.length){
            horses[indexOfHorse] = null;
            return true;

        }
        return false;

    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }
}



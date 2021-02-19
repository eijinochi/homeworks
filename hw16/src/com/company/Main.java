package com.company;

public class Main {

    public static void main(String[] args){
        Cow cow1 = new Cow(159, 3, 'F', "Marta");
        Cow cow2 = new Cow(180, 4, 'M', "Dirous");

        Sheep sheep1 = new Sheep(45, 2, 'M', "Shawn");
        Sheep sheep2 = new Sheep(50, 3, 'F', "Kashka");
        Sheep sheep3 = new Sheep(65, 4,'F', "Toru");

        Horse horse1 = new Horse(215, 4, "Dark-Grey", 'M', "Barbiel");
        Horse horse2 = new Horse(200, 3, "Brown", 'M', "Spirit");

        Farm farm1 = new Farm("Taxes Green St. 2/4", 5, 3, 2, "John Week");
        Farm farm2 = new Farm("Mexico somewhere", 1,1,1, "Mr. Bean");
        farm1.addCow(new Cow(169, 2, 'F', "Mayka" ));
        farm1.addCow(cow1);
        farm1.addCow(cow2);
        farm1.addCow(new Cow(175, 3, 'M', "Benny"));
        farm1.addCow(new Cow(160, 2, 'F', "April"));

        farm1.addSheep(sheep1);
        farm1.addSheep(sheep2);
        farm1.addSheep(sheep3);

        farm1.addHorse(horse1);
        farm1.addHorse(horse2);

        farm1.printInfo();

        farm2.addCow(new Cow(150, 1, 'F', "July"));
        farm2.addSheep(new Sheep(55, 2, 'M', "Browny"));
        farm2.addHorse(new Horse(205, 2, "Black", 'F', "Sofya"));

        System.out.println();
        farm2.printInfo();

    }
}

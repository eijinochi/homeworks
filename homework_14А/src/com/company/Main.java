

package com.company;

public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot("Kesha", 4, 'M', 11, 0.657);
        parrot.printParrotInfo();

        Dog dog = new Dog("Bethoven", 7, 'F', 55, 25.5);
        dog.printDogInfo();

        Cat cat = new Cat("Tom", 20, 'M', 42, 15);
        cat.printCatInfo();

        Fish fish = new Fish("Nemo", 1, 'M', 7, 0.25);
        fish.printFishInfo();



//        Circle crl = new Circle(10, "PINK",true);
//        crl.printCircleInfo();
//
//        System.out.println("Circle length: " + crl.getCircleLength());
//        System.out.println("Circle area: " + crl.getCircleArea());
//        System.out.println();
//
//        int n = 7;
//        crl.setRadius(crl.getRadius() * n);
//
//        System.out.println("Circle length: " + crl.getCircleLength());
//        System.out.println("Circle area: " + crl.getCircleArea());
//
//
//        int size = 100, count = 0;
//        Circle[] array = new Circle[100];
//        for(int i = 0; i < array.length; i++){
//            array[i] = new Circle(i + 1);
//            if (array[i].getRadius() % 3 == 0){
//                count++;
//            }
//            System.out.print(array[i].getRadius() + " ");
//        }
//
//        Circle[] arrayNow = new Circle[count];
//        int k = 0;
//
//        System.out.println("\n_______________________________________\n");
//
//        for(int i = 0; i < array.length; i++){
//            if(array[i].getRadius() %3 == 0){
//                arrayNow[k] = array[i];
//                k++;
//            }
//        }
//
//        for (int i = 0; i < arrayNow.length; i++){
//            System.out.print(arrayNow[i].getRadius() + " ");
//        }
    }

}

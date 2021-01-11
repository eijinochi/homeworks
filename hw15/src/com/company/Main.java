package com.company;

public class Main {

    public static void main(String[] args) {
	    Human human1 = new Human("Eiji", "Nochizawa", 2000, 'M', "playing Ordinal Scale");
	    Human human2 = new Human("Yuna", "Shigemura", 2002, 'F', "singing");
	    Human human3 = new Human("Kazuto", "Kirigaya", 2000, 'M', "playing sword");
	    Human human4 = new Human("Asuna", "Yuuki", 2001, 'F', "playing SAO");
	    Human human5 = new Human("Shino", "Asada", 2001, 'F', "playing Gun Gale Online");
	    Human human6 = new Human("Tsuboi", "Ryoutarou", 1999, 'M');
	    Human human7 = new Human("Kayaba", "Akihiko", 1979, 'M', "game development");
	    Human human8 = new Human("Alice", "Zuberg", 2017, 'F', "walking");
	    Human human9 = new Human("Eugeo", "Zimmer", 2017, 'M', "cutting trees");
	    Human human10 = new Human("Yuki", "Konno", 2004, 'F', "playing Alfheim Online");



	    Human[] humans = {human1, human2, human3, human4, human5, human6, human7, human8, human9, human10};
	    for(Human human : humans) {
	       human.info();
        }
    }
/*1.	Что такое конструктор?
	Специальный метод,  который вызывается при создании экземпляра объекта
2.	Что такое дефолтный конструктор (по умолчанию)?
	конструктор без аргументов(пустой)
3.	Как работает конструктор?
	инициализирует вновь созданный объект перед его использованием
4.	Для чего нужен конструктор?
	с помощью него легче заполнять данные свойств класса, и не ошибиться в порядке
5.	Какой конструктор вызывается когда конструкторов несколько?
	дефолтный
6.	Что такое this
	ссылка к данному свойству*/
}

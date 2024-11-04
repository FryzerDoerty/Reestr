import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> catCom = new ArrayList<>();
        List<String> catCom1 = new ArrayList<>();
        List<String> camCom = new ArrayList<>();
        catCom.add("run");
        catCom.add("sit");

        Cat cat = new Cat();
        Dog dog = new Dog();
        Hamster hamster = new Hamster();
        Donkey donkey = new Donkey();
        Horse horse = new Horse();
        Camel camel = new Camel();

        Integer a = 0;

        while (a < 100) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите номер команды: 1) добавить еще животное, 2) вывести количество животных, 3) найти животное по дате рождения, 4) добавить команду для животного 5) вывести котов");


            String nomer = scanner.nextLine();
            if (nomer.equals("1")) {

                System.out.println("Введите имя: ");

                String name = scanner.nextLine();


                System.out.println("Вводите команды: ");
                List<String> animals = new ArrayList<>();
                animals.add(scanner.nextLine());


                System.out.println("Введите тип животного (cat/dog/hamster/donkey/horse/camel)");
                String type = scanner.nextLine();
                System.out.println("Введите число дня рождения)");
                Integer day = scanner.nextInt();
                System.out.println("Введите месяц (от 1, до 12) дня рождения)");
                Integer mounth = scanner.nextInt();
                System.out.println("Введите год дня рождения)");
                Integer year = scanner.nextInt();


                if (type.equals("cat")) {
                    HomePets homePets4 = new HomePets(name, animals, "Cat", day, mounth, year);
                    cat.addInArrCat(homePets4);
                } else if (type.equals("dog")) {
                    HomePets homePets4 = new HomePets(name, animals, "Dog", day, mounth, year);
                    dog.addInArrDog(homePets4);
                } else if (type.equals("hamster")) {
                    HomePets homePets4 = new HomePets(name, animals, "Hamster", day, mounth, year);
                    hamster.addInArrHamster(homePets4);
                } else if (type.equals("camel")) {
                    PackAnimals packAnimals2 = new PackAnimals(name, animals, "Camel", day, mounth, year);
                    camel.addInArrCamel(packAnimals2);
                } else if (type.equals("horse")) {
                    PackAnimals packAnimals2 = new PackAnimals(name, animals, "Horse", day, mounth, year);
                    horse.addInArrHorse(packAnimals2);

                } else if (type.equals("donkey")) {
                    PackAnimals packAnimals2 = new PackAnimals(name, animals, "Donkey", day, mounth, year);
                    donkey.addInArrDonkey(packAnimals2);
                }

            } else if (nomer.equals("2")) {
                Integer count1 = cat.countArrCat() + camel.countArrCamal() + dog.countArrDpg() + hamster.countArrHamster() + donkey.countArrDonkey() + horse.countArrHorse();
                System.out.println(count1);
            } else if (nomer.equals("3")) {

                System.out.println("Введите число дня рождения)");
                Integer day = scanner.nextInt();
                System.out.println("Введите месяц (от 1, до 12) дня рождения)");
                Integer mounth = scanner.nextInt();
                System.out.println("Введите год дня рождения)");
                Integer year = scanner.nextInt();
                for (int i = 0; i < cat.countArrCat() - 1; i++) {
                    if (cat.takecat(i).getDay() == day && cat.takecat(i).getMounth() == mounth && cat.takecat(i).getYear() == year) {
                        System.out.println(cat.takecat(i));
                        i++;
                    }
                    i++;
                }
                for (int i = 0; i < dog.countArrDpg() - 1; i++) {
                    if (dog.takedog(i).getDay() == day && dog.takedog(i).getMounth() == mounth && dog.takedog(i).getYear() == year) {
                        System.out.println(cat.takecat(i));
                        i++;
                    }
                    i++;
                }
                for (int i = 0; i < hamster.countArrHamster() - 1; i++) {
                    if (hamster.takehamster(i).getDay() == day && hamster.takehamster(i).getMounth() == mounth && hamster.takehamster(i).getYear() == year) {
                        System.out.println(cat.takecat(i));
                        i++;
                    }
                    i++;
                }
                for (int i = 0; i < camel.countArrCamal() - 1; i++) {
                    if (camel.takecamel(i).getDay() == day && camel.takecamel(i).getMounth() == mounth && camel.takecamel(i).getYear() == year) {
                        System.out.println(cat.takecat(i));
                        i++;
                    }
                    i++;
                }
                for (int i = 0; i < donkey.countArrDonkey() - 1; i++) {
                    if (donkey.takeDonkey(i).getDay() == day && donkey.takeDonkey(i).getMounth() == mounth && donkey.takeDonkey(i).getYear() == year) {
                        System.out.println(cat.takecat(i));
                        i++;
                    }
                    i++;
                }
                for (int i = 0; i < horse.countArrHorse() - 1; i++) {
                    if (horse.takehorse(i).getDay() == day && horse.takehorse(i).getMounth() == mounth && horse.takehorse(i).getYear() == year) {
                        System.out.println(cat.takecat(i));
                        i++;
                    }
                    i++;
                }
            } else if (nomer.equals("4")) {

                System.out.println(" Какому животному вы хотите добавить команду? (cat/dog/hamster/donkey/horse/camel)");
                String type = scanner.nextLine();
                System.out.println(" Какое у него имя?");
                String name = scanner.nextLine();
                System.out.println(" Введите команду");
                String comnd = scanner.nextLine();
                if (type.equals("cat")) {
                    for (int i = 0; i < cat.countArrCat() - 1; i++) {
                        if (cat.takecat(i).getName() == name) {
                            cat.addCommandInCat(i, comnd);
                        }
                        i++;
                    }
                }
                if (type.equals("dog")) {
                    for (int i = 0; i < dog.countArrDpg() - 1; i++) {
                        if (dog.takedog(i).getName() == name) {
                            dog.addCommandInDog(i, comnd);
                        }
                        i++;
                    }
                }
                if (type.equals("hamster")) {
                    for (int i = 0; i < hamster.countArrHamster() - 1; i++) {
                        if (hamster.takehamster(i).getName() == name) {
                            hamster.addCommandInHamster(i, comnd);
                        }
                        i++;
                    }
                }
                if (type.equals("camel")) {
                    for (int i = 0; i < camel.countArrCamal() - 1; i++) {
                        if (camel.takecamel(i).getName() == name) {
                            camel.addCommandInCamel(i, comnd);
                        }
                        i++;
                    }
                }
                if (type.equals("donkey")) {
                    for (int i = 0; i < donkey.countArrDonkey() - 1; i++) {
                        if (donkey.takeDonkey(i).getName() == name) {
                            donkey.addCommandInDonkey(i, comnd);
                        }
                        i++;
                    }
                }
                if (type.equals("horse")) {
                    for (int i = 0; i < horse.countArrHorse() - 1; i++) {
                        if (horse.takehorse(i).getName() == name) {
                            horse.addCommandInHorse(i, comnd);
                        }
                        i++;
                    }
                }
            } else if (nomer.equals("5")) {
                Integer count2 = cat.countArrCat();
                for (int i = 0; i < count2 - 1; i++) {
                    System.out.println(cat.takecat(i));
                }
            }
            a++;
        }


        for (int i = 0; i < 4; i++) {
            System.out.println(cat.takecat(i));
        }
        Integer count = cat.countArrCat() + camel.countArrCamal();
        System.out.println(count);

    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задача 1

        int age = 22;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }


        // Задача 2

        int temp = 4;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градуса, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }


        // Задача 3

        int speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", можно ехать спокойно");
        }


        // Задача 4

        int ageP = 8;
        if (ageP >= 2 && ageP <= 6) {
            System.out.println("Если возраст человека равен " + ageP + ", то ему нужно ходить в садик");
        } else if (ageP >= 7 && ageP <= 17) {
            System.out.println("Если возраст человека равен " + ageP + ", то ему нужно ходить в школу");
        } else if (ageP >= 18 && ageP <= 24) {
            System.out.println("Если возраст человека равен " + ageP + ", то ему нужно ходить в университет");
        } else if (ageP > 24) {
            System.out.println("Если возраст человека равен " + ageP + ", то ему нужно ходить на работу");
        }


        // Задача 5

        int childAge = 2;
        boolean escort = true;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на актракционе");
        } else if (childAge >= 5 && childAge <= 14) {
            if (escort) {
                System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении");
            }
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения");

        }


        // Задача 6

        int trainCapacity = 51;
        if (trainCapacity >= 60 && trainCapacity < 102) {
            System.out.println("Есть стоячие места");
        } else if (trainCapacity < 60) {
            System.out.println("Есть сидячие места");
        } else {
            System.out.println("Мест нет");
        }


        // Задача 7

        int one = 2;
        int two = 2;
        int three = 1;
        if (one > two && three < one) {
            System.out.println("Число one больше остальных");
        } else if (two > three && two > one) {
            System.out.println("Число two больше остальных");
        }
        else {
            System.out.println("Число three больше остальных");
        }

    }

}
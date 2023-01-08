public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 32;
        if (age >= 18) {
            System.out.println(" Если возраст человека равен " + age + " он совершеннолетний ");
        } else {
            System.out.println(" Если возраст человека равен " + age + " он не достиг совершеннолетия, то нужно немного подождать  ");
        }
        System.out.println(" Задача 2 ");
        int temper = 9;
        if (temper >= 5) {
            System.out.println(" Сегодня тепло, можно идти без шапки ");
        } else {
            System.out.println(" На улице холодно, нужно надеть шапку ");
        }
        System.out.println("Задача 3 ");
        int speed = 53;
        if (speed > 60) {
            System.out.println(" Если скорость " + speed + " то скорость превышена ");
        } else {
            System.out.println(" Если скорость " + speed + " то превышения скорости нет");
        }
        System.out.println(" Задача 4 ");
        int yearsold = 12;
        if (yearsold >= 2 && yearsold <= 6) {
            System.out.println(" Если возраст человека равен " + yearsold + " То ему нужно ходить в детский сад");
        } else if (yearsold >= 7 && yearsold <= 18) {
            System.out.println(" Если возраст человека равен " + yearsold + " То ему нужно ходить в школу");
        } else if (yearsold > 18 && yearsold < 24) {
            System.out.println(" Если возраст человека равен " + yearsold + " То ему нужно ходить в университет ");
        } else if (yearsold >= 24) {
            System.out.println(" Если возраст человека равен " + yearsold + " То ему нужно ходить  на работу");
        }
        System.out.println(" Задача 5 ");
        int kidsAge = 6;
        if (kidsAge < 5) {
            System.out.println(" Если возраст ребенка равен " + kidsAge + " то ему нельзя кататься на атракционе");
        } else if (kidsAge < 14) {
            System.out.println(" Если возраст ребенка равен " + kidsAge + " то он может кататься только в сопровождении взрослого");
        } else {
            System.out.println(" Если возраст ребенка равен " + kidsAge + " то он может кататься без сопровождения взрослого");
        }
        System.out.println(" Задача 6 ");
        int totalCapacity = 102;
        int seatCapacity = 60;
        int currentPersons = 32;
        if (currentPersons >= totalCapacity) {
            System.out.println("Свободных мест нет ");
        } else {
            if (currentPersons >= seatCapacity) {
                System.out.println(" Есть только стоячие места ");
            } else {
                System.out.println(" Есть сидячие места ");
            }
        }
    System.out.println( "Задача 7 ");
    int one =1;
    int two = 2;
    int three = 3;
    if ( one > two) {
        if (one > three) {
            System.out.println(one);
        } else {
            System.out.println(three);
        }
    } else {
        if (two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);}
        }
    }

    }















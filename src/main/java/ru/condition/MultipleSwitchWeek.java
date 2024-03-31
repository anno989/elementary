package ru.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четвергк", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресение", "Sunday" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        String day = "Monday";
        int numberOfDay = MultipleSwitchWeek.numberOfDay(day);
        if (numberOfDay != -1) {
            System.out.println("Номер дня недели " + day + " : " + numberOfDay);
        } else {
            System.out.println("Неверное название дня недели");
        }
    }
}

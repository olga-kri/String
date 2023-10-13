import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // Задача 1: объявить три строки для хранения ФИО сотрудника, вывести в консоль

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        // Задача 2:Напишите программу, которая изменит написание ФИО на полностью заглавные буквы.

        String fullNameToUpperCase = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " +fullNameToUpperCase);

        // Задача 3:Напишите программу, которая заменяет символ «ё» на символ «е».

        String fullName1 = "Иванов Семён Семёнович";
        String fullNameCorrect = fullName1.replace('ё', 'е');
        System.out.println("Ф.И.О. сотрудника - " + fullNameCorrect);


    }
}
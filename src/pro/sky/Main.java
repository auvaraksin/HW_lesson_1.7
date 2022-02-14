package pro.sky;

public class Main {

    public static void main(String[] args) {
        System.out.println("Домашнее задание");
        //task 1
        System.out.println("Задание №1");
        String firstName = "Ivan";
        String middletName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middletName;
        System.out.println("ФИО сотрудника - " + fullName);
        //task 2
        System.out.println("Задание №2");
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUpperCase);
        //task 3
        System.out.println("Задание №3");
        String fullNameReplace = fullName.replace(' ', ';');
        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullNameReplace);
        //task 4
        System.out.println("Задание №4");
        String fullNameNew = "Иванов Семён Семёнович";
        String fullNameNewReplace = "";
        String[] words = fullNameNew.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("ё")) {
                fullNameNewReplace += words[i].replace('ё', 'е');
            } else {
                fullNameNewReplace += words[i];
            }
            if (i != words.length - 1) {
                fullNameNewReplace += ' ';
            }
        }
        System.out.println("Данные ФИО сотрудника " + fullNameNewReplace);
    }
}

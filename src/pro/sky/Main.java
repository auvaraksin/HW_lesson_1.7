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
        //task 5
        System.out.println("Задание №5");
        String fullNamePerson = "Ivanov Ivan Ivanovich";
        String lastNamePerson = fullNamePerson.substring(0, fullNamePerson.indexOf(" "));
        String firstNamePerson = fullNamePerson.substring(fullNamePerson.indexOf(" ") + 1, fullNamePerson.lastIndexOf(" "));
        String middleNamePerson = fullNamePerson.substring(fullNamePerson.lastIndexOf(" ") + 1, fullNamePerson.length());
        System.out.println("Фамилия сотрудника - " + lastNamePerson);
        System.out.println("Имя сотрудника - " + firstNamePerson);
        System.out.println("Отчество сотрудника - " + middleNamePerson);
        //task 6
        System.out.println("Задание №6");
        String[] personalData = fullNamePerson.split(" ");
        String lastNamePersonalData = Character.toUpperCase(personalData[0].charAt(0)) + personalData[0].substring(1, personalData[0].length());
        String firstNamePersonalData = Character.toUpperCase(personalData[1].charAt(0)) + personalData[1].substring(1, personalData[1].length());
        String middleNamePersonalData = Character.toUpperCase(personalData[2].charAt(0)) + personalData[2].substring(1, personalData[2].length());
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + lastNamePersonalData + " " + firstNamePersonalData + " " + middleNamePersonalData);
        //task 7
        System.out.println("Задание №7");
        String s1 = "135";
        String s2 = "246";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb = sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));
        }
        System.out.println(sb);
        //task 8
        System.out.println("Задание №8");
        String word = "aabccddefgghiijjkk";
        String doubledLetters = "";
        char[] wordSplitted = word.toCharArray();
        System.out.println("Исходная строка символов: " + word);
        boolean check = true;
        for (int i = 1; i < wordSplitted.length; i++) {
            if ((wordSplitted[i] == wordSplitted[i - 1]) && check != false) {
                doubledLetters += wordSplitted[i];
                check = false;
            }
            else {
                check = true;
            }
        }
        if (doubledLetters != "") {
            System.out.println("Дублированные символы: " + doubledLetters);
        }
        else {
            System.out.println("Дублированные символы отсутствуют");
        }
    }
}
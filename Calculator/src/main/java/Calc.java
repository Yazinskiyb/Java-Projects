import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        // Переменные
        char operator;
        double number1, number2, result;

        // Создаем объект Сканнер, чтобы он принимал данные от пользователя
        Scanner input = new Scanner(System.in);

        // Просим выбрать оператор который хотим использовать
        System.out.println("Please, choose operation: +, -, *, /");
        operator = input.next().charAt(0); // charAt(0) говорит что нужно взять только 1-й введеный символ

        // Просим ввести 1-е число
        System.out.println("Please, enter the number1");
        number1 = input.nextDouble();

        // Просим ввести 2-е число
        System.out.println("Please, enter the number2");
        number2 = input.nextDouble();

        // Свитч проводит операцию в соответсвии с выбранным оператором
        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + "+" + number2 + "=" + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1 + "-" + number2 + "=" + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + "*" + number2 + "=" + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println(number1 + "/" + number2 + "=" + result);
                break;
            default:
                System.out.println("Invalid operator!");
                break; // На случай если оператор не верный
        }
        input.close(); // Закрываем ввод в консоль

    }
}

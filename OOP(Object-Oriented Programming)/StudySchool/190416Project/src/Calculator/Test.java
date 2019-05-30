package Number11;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;
        String oper = "";

        System.out.print("첫 번째 정수 입력 : ");
        a = scanner.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        b = scanner.nextInt();
        scanner.nextLine();
        System.out.print("연산자 입력 : ");
        oper = scanner.nextLine();

        switch (oper) {
            case "+":
                Add add = new Add();
                add.setValue(a, b);
                System.out.println(add.calculate());
                break;
            case "-":
                Sub sub = new Sub();
                sub.setValue(a, b);
                System.out.println(sub.calculate());
                break;
            case "*":
                Mul mul = new Mul();
                mul.setValue(a, b);
                System.out.println(mul.calculate());
                break;
            case "/":
                Div div = new Div();
                div.setValue(a, b);
                System.out.println(div.calculate());
                break;
            default:
                System.out.println("사칙연산자가 아닙니다.");
        }

    }
}

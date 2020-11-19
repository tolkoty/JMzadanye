import java.util.Scanner;

public class Processing {
    public static int calc(int num1, String op, int num2){
        int result;
        if(num1<1||num1>10||num2<1||num2>10) {
            throw new IllegalStateException("Unexpected operand");
        }
        switch (op) {
            case "+": result=num1+num2; break;
            case "-": result=num1-num2; break;
            case "*": result=num1*num2; break;
            default:  result=num1/num2; break;
        }
        return result;
    }

    static String[] input() {

        String[] inp = new String[3];
        System.out.println("Введите выражение:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = noSpace(str.toUpperCase());

        int position = str.indexOf('+');
        if (position == -1) position = str.indexOf('-');
        if (position == -1) position = str.indexOf('*');
        if (position == -1) position = str.indexOf('/');
        if (position == -1) {
            throw new IllegalStateException("Unexpected operation");
        }
        inp[1] = "" + str.charAt(position);
        inp[0] = str.substring(0, position);
        inp[2] = str.substring(position + 1);
        return inp;
    }

    static String noSpace(String str) {
        String noSpace = "";
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i)!=' ') noSpace += str.charAt(i);
        }
        return noSpace;
    }
}
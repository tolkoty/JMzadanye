public class Main {

    public static void main(String[] args){
        String[] inp = Processing.input();
        try {
            int num1 = Convert.romToArab(inp[0]);
            int num2 = Convert.romToArab(inp[2]);
            int result = Processing.calc(num1, inp[1], num2);
            String romRes = Convert.arabToRom(result);
            if((num1<num2)&&(inp[1].equals("-"))){
                System.out.print("-");
            }
            System.out.print(romRes);
            if((num1%num2!=0)&&(inp[1].equals("/"))){
                System.out.println(" (остаток " + (Convert.arabToRom(num1 % num2) + ")"));
            }
        }catch (IllegalStateException e){
            int num1 = Integer.parseInt(inp[0]);
            int num2 = Integer.parseInt(inp[2]);
            int result = Processing.calc(num1,inp[1],num2);
            System.out.print(result);
            if((num1%num2!=0)&&(inp[1].equals("/"))) {
                System.out.println(" (остаток " + num1 % num2 + ")");
            }
        }
    }
}
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Type a number:");
        int decimal = input.nextInt();
        input.close();
        System.out.println("Result: " + Decimal_Octal(decimal));
    }
    public static String Decimal_Octal(int decimal){
        String octal = "";
        String OctalCharacters = "01234567";
        while(decimal > 0)
        {
            int residuo = decimal % 8;
            octal = (OctalCharacters.charAt(residuo) + octal);

            decimal /= 8;
        }
        return octal;
    }
}

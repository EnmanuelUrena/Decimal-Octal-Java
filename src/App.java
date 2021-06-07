public class App {
    public static void main(String[] args) throws Exception {
        String octal = "";
        int decimal = 20;
        String octalCharacters = "01234567";
        while (decimal > 0) {
            int residuo = decimal % 8;
            octal = (octalCharacters.charAt(residuo) + octal);

            decimal /= 8;
        }
        System.out.println(octal);
    }
}

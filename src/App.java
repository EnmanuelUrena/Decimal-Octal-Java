import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        int DecNumber = 16;
        boolean condition = true;
        boolean condition2 = true;
        int product = 0;
        List<Integer> arrList = new ArrayList<Integer>(); 
        var temp = DecNumber;

        while (condition) {
            for (int i = 1; condition2 ; i++) {
                product = i;
                if (product * 8 == temp) {
                    condition2 = false;
                }
                else if (product * 8 > temp) {
                    product = product - 1;
                    condition2 = false;
                }
            }
            arrList.add(temp -(product*8));
            temp = product;
            if (temp == 1) {
                arrList.add(temp);
                condition = false;
            }
            else if (temp == 0) {
                condition = false;
            }
            condition2 = true;
        }

        for (int i = arrList.size() -1; i >= 0; i--) {
            System.out.print(arrList.get(i));
        }

    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ExceptionHandling {
    public static void main(String[] args) throws IOException {

        int a = 0, b = 0, result;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter two integers");
        try {
            str = br.readLine(); 
            a = Integer.parseInt(str);
            str =br.readLine(); 
            b = Integer.parseInt(str);
        } catch(NumberFormatException nfe) {
            System.out.println("Invalid integers");
        }
        try {
            result = a/b;
            System.out.println("Quotient = " + result);
        } catch(ArithmeticException ae) {
            System.out.println("Division by zero is forbidden");
        }
        finally {
            System.out.println("Execution successfull");
        }
    }
}
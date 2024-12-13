import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class GenericCounter <T> {

    int countByProperty(Collection <T> collection, String property) {
        int count = 0;
        for(T element : collection) {
            switch (property) {
                case "even":
                    if(isEven((Integer) element)) count++;
                    break;
                case "odd":
                    if(isOdd((Integer) element)) count++;
                    break;
                case "prime":
                    if(isPrime((Integer) element)) count++;
                    break;
                case "palindrome":
                    if(isPalindrome((Integer) element)) count++;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown property" + property);
            }
        }
        return count;
    }

    //check even
    boolean isEven(Integer n) {
        return n%2 == 0;
    }

    //check odd
    boolean isOdd(Integer n) {
        return n%2 != 0;
    }

    //check prime
    boolean isPrime(Integer n) {
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }
        return true;
    }

    //check palindrome
    boolean isPalindrome(Integer n) {
        String original = String.valueOf(n);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }
}

class Main7 {
    public static void main(String[] args) {
        //create instance
        GenericCounter<Integer> counter = new GenericCounter<>();
        //sample list
        List<Integer> numbers = Arrays.asList(11,12,13,14,15,21,22,23,24,25);
        //count elements
        int evenCount = counter.countByProperty(numbers, "even");
        int oddCount = counter.countByProperty(numbers, "odd");
        int primeCount = counter.countByProperty(numbers, "prime");
        int palindromeCount = counter.countByProperty(numbers, "palindrome");
        //print results
        System.out.println("Even count = " + evenCount);
        System.out.println("Odd count = " + oddCount);
        System.out.println("Prime count = " + primeCount);
        System.out.println("Palindrome count = " + palindromeCount);                
    }
}
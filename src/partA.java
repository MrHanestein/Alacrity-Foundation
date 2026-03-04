import java.util.*;

public class partA {
    public static ArrayList<Integer> findAllFactors(int numbers){
        ArrayList<Integer> factorsList = new ArrayList<>();
        //Increment by 1, syntax error
        for(int i = 1; i <= numbers; ++i) {
        if(numbers % i == 0) {
            factorsList.add(i);
        }
        }
        return factorsList;
    }
    //Base case prime cannot score below 2. if(..size() == 1 || size() == 2)
    public static String checkPrimeNumbers(int numbers) {
        ArrayList<Integer> factorsList = findAllFactors(numbers);
        if(factorsList.size() == 2) {
            return "Prime!";
        }
        else {
            return "Numbers are not prime, factors list :" + factorsList;
        }
    }

    int min = 10;
    int max = 20;
    //Extension Arraylist to calculate all primes in range
    public static void main(String[] args) {
        System.out.println(findAllFactors(13));
        System.out.println(checkPrimeNumbers(22));
        System.out.println(checkPrimeNumbers(1));
        System.out.println(checkPrimeNumbers(2000));

    }
}

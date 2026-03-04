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
            return "This is a prime number";
        }
        else {
            return "This is not a prime number:" + factorsList;
        }
    }
    public static void main(String[] args) {
        findAllFactors(1000);
        System.out.println(checkPrimeNumbers(1000));
        checkPrimeNumbers(2000);
        System.out.println(checkPrimeNumbers(2000));

    }
}

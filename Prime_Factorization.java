package Side_projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prime_Factorization {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int num;
        
        //input using askNumber()
        System.out.println("This program will count and display all the prime "
                + "numbers leading up to and including the inputted number");  
        num = askNumber(input);
        
        //call findPrimes()
        findPrimes(num);
        


    }
    public static int askNumber(Scanner input){
        int number;
        do{
            //User input
            System.out.print("\nEnter a whole number: ");
            number = input.nextInt();    
        } while(number <= 0);     
        
        return number;
    }
     
    public static void findPrimes(int numb){
        List<Integer> primeNumbers = new ArrayList<>();
        int primes = 0;
        int cancelOperation;
        //TRICKY part in finding the prime numbers MAIN POINTSSS
        for (int i = 2; i <= numb; i++) {
            cancelOperation = 0;
            for (int j = 2; j <= i; j++) {
                if(i != j){
                    //System.out.println(i + " " + j);
                    if(i % j == 0){
                        cancelOperation ++;
                    }
                }
            }
            if (cancelOperation == 0) {
                primes++;
                primeNumbers.add(i);
            }
        }
        System.out.println("\nThe total number of primes is " + primes);
        System.out.println("\nHere is a list of the prime factors: ");
        for (int i = 0; i < primes; i++) {
            System.out.print(primeNumbers.get(i) + " ");
        }
    }
}



        //ITERATION 2
//        for (int i = 2; i <= numb; i++) {
//            for (int j = 1; j <= numb; j++) {
//                totalComb++;
//                System.out.println(i + " "+ j);
//                if (i != j && j != numb) {
//                    excluded++;
//                }
//            }
//        }
//        System.out.println(totalComb);
//        System.out.println(excluded);
        
        //ITERATION 1
//        for (int i = 2; i < numb; i++) {
//            for (int j = 2; j < numb - 1; j++) {
//            
//                if(i % j != 0){
//                    if(i != j){
//                        primes++;     
//                        System.out.println(i);
//                        System.out.println(j + "\n");
//                    }
//                }   
//            }
//        }
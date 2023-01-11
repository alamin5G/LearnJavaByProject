package InterestRate;

import java.util.Scanner;

public class BankInterest {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.println("Enter your Loan Years: ");
        int numberOfYears = input.nextInt();
        System.out.println("Enter your annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        //Calculate monthly interest rate
        double monthlyInterestRate = annualInterestRate/1200;

        //Calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1-1/Math.pow(1+monthlyInterestRate, numberOfYears * 12));
        double totalPayment =  monthlyPayment * numberOfYears * 12;

        //Display result
        System.out.println("The monthly Payment is: $"+ (int) monthlyPayment*100/100.00);
        System.out.println("The Total Payable amount is: $"+ (int) totalPayment*100/100.00);

    }




}

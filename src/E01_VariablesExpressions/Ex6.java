/*
(Financial application: payroll) Write a program that reads the following information
and prints a payroll statement:

 Employee's name (e.g., Smith)
 Number of hours worked in a week (e.g., 10)
 Hourly pay rate (e.g., 9.75)
 Federal tax withholding rate (e.g., 20%)
 State tax withholding rate (e.g., 9%)

A sample run is shown below:
Enter employee's name: Smith
Enter number of hours worked in a week: 10
Enter hourly pay rate: 9.75
Enter federal tax withholding rate: 0.20
Enter state tax withholding rate: 0.09
Employee Name: Smith
Hours Worked: 10.0
Pay Rate: $9.75
Gross Pay: $97.5
Deductions:
Federal Withholding (20.0%): $19.5
State Withholding (9.0%): $8.77
Total Deduction: $28.27
Net Pay: $69.2
 */
package E01_VariablesExpressions;
import java.util.Scanner;

public class Ex6 {

    public static double readDouble (Scanner input, String messageToUser ){
        System.out.print( messageToUser );
        double decimalValue = input.nextDouble();
        input.nextLine();
        return decimalValue;
    }   //  Reads input of value "double" and prints a message.

    public static String readLine(Scanner input, String messageToUser ) {
        System.out.print( messageToUser );
        return input.nextLine();
    }   //  Reads input of value "string" and prints a message.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String employeeName = readLine( input, "Enter employee's name: ");
        double hoursWorked = readDouble( input, "Enter number of hours worked in a week: ");
        double hourlyPay = readDouble( input, "Enter hourly pay rate: ");
        double fedTax = readDouble( input, "Enter federal tax withholding rate(Ex: 0,20): ");
        double stateTax = readDouble( input, "Enter state tax withholding rate(Ex: 0,09): ");
        double grossPay = (hourlyPay * hoursWorked * 4);
        fedTax = grossPay * fedTax;
        stateTax = grossPay * stateTax;
        System.out.println(
                "\nEmployee name: " + employeeName
                + "\nHours worked(month): " + (hoursWorked * 4.35)
                + "\nPay rate: " + hourlyPay
                + "\nGross pay(month): " + grossPay
                + "\nDeductions:\n" + "Federal Withholding (20.0%): $" + fedTax
                + "\nState Withholding (9.0%): $" + stateTax
                + "\nTotal Deduction: $" + (stateTax + fedTax)
                + "\nNet Pay: $" + (grossPay - (stateTax + fedTax))
        );
        input.close();
    }
}

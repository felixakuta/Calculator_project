import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Declared an integer with different variables without assigning any value to them
int n1, n2, ch, cal;
//Created a boolean statement to loop through and then used while loop to enable the user repeat the function
boolean calculateAgain = true;
while(calculateAgain == true) {
    System.out.println("Enter two Numbers: ");
    //Used Scanner API to collect data from the user
    Scanner r = new Scanner(System.in);
    n1 = r.nextInt();
    n2 = r.nextInt();
    System.out.print("Select Operation, 1 addition, 2 subtraction, 3 multiplication, 4 division, others  remainder  ");
    ch = r.nextInt();
    // I created an If condition here assigning each variable using the individual operators
    //operation includes
    //Additions
    //Subtraction
    //Multiplication
    //Division
    //Remainder
    if (ch == 1) {
        cal = n1 + n2;
        System.out.println("ADDITION " + cal);
    } else if (ch == 2) {
        cal = n1 - n2;
        System.out.println("SUBTRACTION " + cal);
    } else if (ch == 3) {
        cal = n1 * n2;
        System.out.println("MULTIPLICATION " + cal);
    } else if (ch == 4) {
        cal = n1 / n2;
        System.out.println("DIVISION " + cal);
    } else {
        cal = n1 % n2;
        System.out.println("REMAINDER " + cal);

    }
    System.out.println("Clear to calculate again, enter 1, otherwise enter 2: ");
    int r2 = r.nextInt();
    if (r2 == 1){
    calculateAgain = true;
    }
    if(r2 == 2){
        calculateAgain = false;
    }
}
    }
}
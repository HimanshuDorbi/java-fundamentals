// Import kar lo Scanner class, taki input le sakein
import java.util.Scanner;

// Define karo q1 class
public class q1
// Instance variables
int units; // Units consumed
float amount; // Bill amount
String name; // Customer name

// Constructor
q1(String name,int units) {
    this.name=name;
    this.units=units;
} 

// Method to calculate bill amount
public void calculate() {
    // Bill calculation based on units consumed
    if(units<=100) {
        amount=((60*units)/100)+50;
    }
    else if(units>100 && units<=300) {
        amount=((6000+((units-100)*80))/100)+50;
    }
    else if(units>300) {
        amount=((6000+16000+((units-300)*90))/100)+50;
    }
    
    // If bill amount is greater than 300, add a surcharge of 15%
    if(amount>300) {
        float sur=0.15f*amount;
        amount=amount+sur;
    }
}

// Method to display customer details and bill amount
void show() {
    System.out.println("NAME IS "+name);
    System.out.println("UNITS CONSUMED "+units);
    System.out.println("AMOUNT TO BE PAID = RS. "+amount);
}

// Main method
public static void main(String args[]) {
    // Scanner objects for input
    Scanner sc=new Scanner(System.in);
    Scanner s=new Scanner(System.in);
    
    // Prompt user for customer name and units consumed
    System.out.println("APNA NAAM DAALO");
    String name=sc.nextLine();
    System.out.println("UNITS DAALO");
    int units=s.nextInt();
    
    // Create q1 object and call calculate and show methods
    q1 b=new q1(name,units);
    b.calculate();
    b.show();
    
    // Close scanner objects
    s.close();
    sc.close();
}    
}

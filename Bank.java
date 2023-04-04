// Program to show a basic bank account
import java.util.Scanner;
public class bank
{
String customername;
int accno;
int bal=0;
int pin;
// Function to set the customer name
void setname(String customername)
{
    this.customername=customername;
}

// Function to set the account number
void setaccno(int accno)
{
    this.accno=accno;
}

// Function to set the balance
void setbal(int bal)
{
    this.bal=bal;
}

// Function to check the balance
void checkbalance()
{
    System.out.println("YOUR BALANCE IS ="+bal);
}

// Function to deposit money
void deposit(int amt)
{
    bal=bal+amt;
}

// Function to withdraw money
void withdraw(int amt)
{
    if(amt<bal)
    {
        bal=bal+amt;
    }
    else
    {
        System.out.println("insufficient balance");
    }
}

// Function to display account details
public void display()
{
    System.out.println("NAME"+customername);
    System.out.println("ACCOUNT NUMBER"+accno);
    System.out.println("CURRENT BALANcE"+bal);
}

// Main function
public static void main(String args[])
{
     bank b= new bank();
     Scanner s=new Scanner(System.in);

     // Input customer name
     System.out.println("enter your name");
     String c=s.nextLine();
     b.setname(c);

     // Input account number
     System.out.println("ENTER YOUR ACCOUNT NUMBER");
     int accno=s.nextInt();
     b.setbal(accno);

     // Input initial balance
     System.out.println("enter  amount");
     int bal=s.nextInt();
     b.setbal(bal);

     // Deposit money
     System.out.println("enter deposit ammount");
     int n=s.nextInt();
     b.deposit(n);

     // Withdraw money
     System.out.println("enter withdraw ammount");
     int v=s.nextInt();
     b.withdraw(v);

     // Check balance and display account details
     b.checkbalance();
     b.display();
     s.close();
}
}

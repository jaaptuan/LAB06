package Lab06;

import java.util.Date;

public class Account {
    private int id = 0 ;
    private double balance = 0 ;
    private double  annualInterestRate = 0 ;
    private Date dateCreated ;

public Account() {

}

public Account(int id , double balance , double annualInterestRate) {
    this.id = id ;
    this.balance = balance ;
    this.annualInterestRate = annualInterestRate ;
}

public Date getDateCreated() {
    dateCreated = new Date() ;
    return dateCreated;
}

public double getMonthlyInterestRate() {
    return ( 4.5 / 100 ) / 12 ;
}

public double getMonthlyInterest() {
    return balance * getMonthlyInterestRate() ;
}

public void withdraw(double amount) {
    balance = balance - amount ;
}

public void deposit(double amount) {
    balance = balance + amount ;
}

public double balance() {
    return balance ;
}

public double TotalBalance() {
    return balance + getMonthlyInterest() ;
}
    
}

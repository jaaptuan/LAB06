package Lab06;

public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account(1122, 20000 , 4.5);
        acc1.withdraw(2500);
        acc1.deposit(3000);
        System.out.println("Total Balance : " + acc1.TotalBalance());
        System.out.println("The Blance : " + acc1.balance());
        System.out.println("The MonthlyInterest : " + acc1.getMonthlyInterest());
        System.out.println("The Datecreate : " + acc1.getDateCreated());
    }
    
}

package Poo.Ej1;

public class Main {
    public static void main(String[] args) {
        Account account_1 = new Account("Manuel", 300);
        Account account_2 = new Account("Sergio");

        System.out.println(account_1);
        System.out.println(account_2);

        account_1.deposit(100);
        account_2.deposit(200);

        System.out.println(account_1);
        System.out.println(account_2);

        account_1.withdraw(50);
        account_2.withdraw(10);

        System.out.println(account_1);
        System.out.println(account_2);
    }
}
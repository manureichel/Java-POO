package Poo.Ej1;

public class Account {
    private String holder;
    private double amount;

    public Account(String titular){
        this.holder = titular;
        this.amount = 0.0;
    }

    public Account(String titular, double cantidad){
        this.holder = titular;
        if(cantidad < 0)
            this.amount = 0;
        else
            this.amount = cantidad;
    }

    public double getAmount() {
        return amount;
    }

    public String getHolder() {
        return holder;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double cantidad){
        if(cantidad>0)
            this.amount += cantidad;
    }

    public void withdraw(double cantidad){
        if((this.amount - cantidad) > 0)
            this.amount -= cantidad;
        else
            this.amount = 0;
    }

    @Override
    public String toString() {
        return "Holder " + holder + " has " + "$" + amount;
    }
}

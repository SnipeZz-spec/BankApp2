package Cards;

import MenuPac.PayOperations.CheckingCard;

public class GeneralCard {

    private String name;
    private int number;
    private int month;
    private int year;
    private double balance;

    public GeneralCard(String name, int  number, int month, int year, double balance) {
        this.name = name;
        this.number = number;
        this.month = month;
        this.year = year;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void infOfCard() {
        System.out.println("Карта: " + name + " " + number);
    }

    @Override
    public String toString() {
        return "Карта: " + name + " " + number + "\nМесяц/Год " + month + "/" + year + "\nБаланс:  " + balance;
    }

}

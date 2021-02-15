package Cards;

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

    public int getNumber() {
        return number;
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


    @Override
    public String toString() {
        return "Карта: " + name + " " + number + "\nМесяц/Год " + month + "/" + year + "\nБаланс:  " + balance + "р." +"\n";
    }

}

package model;

public class BankAccount {

    private String name;
    private double balance;
    private String animalType;
    private boolean isKing;
    private boolean isGood;

    public BankAccount(String name, double balance, String animalType, boolean isKing, boolean isGood) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
        this.isGood = isGood;
    }
}

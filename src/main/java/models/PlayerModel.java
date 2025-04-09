package models;

public class PlayerModel {
    private int playerID;
    private String firstName;
    private String lastName;
    private String position;
    private int salary;
    private String nationality;
    private int remYearsOnContract;

    // Constructor
    public PlayerModel(int playerID, String firstName, String lastName, String position, int salary, String nationality, int remYearsOnContract) {
        this.playerID = playerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
        this.nationality = nationality;
        this.remYearsOnContract = remYearsOnContract;
    }

    // Getters and setters
    public int getPlayerID() {
        return playerID;
    }
    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getRemYearsOnContract() {
        return remYearsOnContract;
    }
    public void setRemYearsOnContract(int remYearsOnContract) {
        this.remYearsOnContract = remYearsOnContract;
    }
}

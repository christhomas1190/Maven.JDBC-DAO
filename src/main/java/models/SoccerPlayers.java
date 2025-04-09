package models;

public class SoccerPlayers {
    private int playerID;
    private String firstName;
    private String lastName;
    private String position;
    private int salary;
    private String nationality;
    private int remYearsOnContract;

    public SoccerPlayers(int playerID, String firstName, String lastName, String position, int salary, String nationality, int remYearsOnContract) {
        this.playerID=playerID;
        this.firstName=firstName;
        this.lastName=lastName;
        this.position=position;
        this.salary=salary;
        this.nationality=nationality;
        this.remYearsOnContract=remYearsOnContract;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(){
        this.firstName=firstName;
    }
    public String getLastName(){
        return firstName;
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
}


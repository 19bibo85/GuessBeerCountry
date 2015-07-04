package com.GuessBeerCountry.Library;

/**
 * Created by elyvitvit on 15/10/2014.
 */
public enum GameMode {
    Easy(0),
    Medium(1),
    Hard(2),
    AllPlates(3),
    NoFault(4);

    private final int id;

    GameMode(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}

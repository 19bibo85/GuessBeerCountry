package com.GuessBeerCountry.Model;

/**
 * Created by elyvitvit on 18/03/2015.
 */
public class Beer {

    private String imgId;
    private String name;
    private String type;
    private int difficulty;
    private String country;
    private String area;
    private String continent;

    public Beer(String imgId, String name, String type, int difficulty, String country, String area, String continent) {
        this.imgId = imgId;
        this.name = name;
        this.type = type;
        this.difficulty = difficulty;
        this.country = country;
        this.area = area;
        this.continent = continent;
    }

    public String GetImgId() {
        return this.imgId;
    }

    public String GetName() {
        return this.name;
    }

    public String GetType() {
        return this.type;
    }

    public int GetDifficulty() {
        return this.difficulty;
    }

    public String GetCountry() {
        return this.country;
    }

    public String GetArea() {
        return this.area;
    }

    public String GetContinent() {
        return this.continent;
    }

    public void SetImgId(String imgId) {
        this.imgId = imgId;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public void SetType(String type) {
        this.type = type;
    }

    public void SetDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public void SetCountry(String country) {
        this.country = country;
    }

    public void SetArea(String area) {
        this.area = area;
    }

    public void SetContinent(String continent) {
        this.continent = continent;
    }
}

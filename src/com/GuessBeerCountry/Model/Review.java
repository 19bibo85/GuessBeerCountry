package com.GuessBeerCountry.Model;

import java.util.ArrayList;

/**
 * Created by elyvitvit on 13/05/2015.
 */
public class Review {
    private String imageBeer;
    private String nameBeer1;
    private String nameBeer2;
    private String nameBeer3;
    private String nameBeer4;
    private String correctAnswer;
    private String country;
    private String imgID;

    private ArrayList<String> wrongAnswers = new ArrayList<String>();

    public void setImageBeer(String imageBeer){
        this.imageBeer = imageBeer;
    }

    public void setNameBeer1(String nameBeer1){
        this.nameBeer1 = nameBeer1;
    }

    public void setNameBeer2(String nameBeer2){
        this.nameBeer2 = nameBeer2;
    }

    public void setNameBeer3(String nameBeer3){
        this.nameBeer3 = nameBeer3;
    }

    public void setNamePlate4(String nameBeer4){
        this.nameBeer4 = nameBeer4;
    }

    public void setCorrectAnswer(String correctAnswer){
        this.correctAnswer = correctAnswer;
    }

    public void setWrongAnswers(String wrongAnswer){
        wrongAnswers.add(wrongAnswer);
    }

    public void setCountry(String country){
        this.country = country;
    }

    public void setImgID(String imgID){
        this.imgID = imgID;
    }

    public String getImageBeer(){
        return imageBeer;
    }

    public String getNameBeer1(){
        return nameBeer1;
    }

    public String getNameBeer2(){
        return nameBeer2;
    }

    public String getNameBeer3(){
        return nameBeer3;
    }

    public String getNameBeer4(){
        return nameBeer4;
    }

    public String getCorrectAnswer(){
        return correctAnswer;
    }

    public ArrayList<String> getWrongAnswer(){
        return wrongAnswers;
    }

    public String getCountry(){
        return country;
    }

    public String getImgID(){
        return imgID;
    }
}
package com.GuessBeerCountry.Model;

public class Base {
	private int id;
	private String name;
	private String language;
	private String imgId;
	
	public Base(){}
	
	public Base(int id, String name, String language, String imgId){
		this.id = id;
		this.name = name;
		this.language = language;
		this.imgId = imgId;
	}
	
	public void SetID(int id){
		this.id = id;
	}
	
	public void SetName(String name){
		this.name = name;
	}
	
	public void SetLanguage(String language){
		this.language = language;
	}
	
	public void SetImgId(String imgId){
		this.imgId = imgId;		
	}
	
	public int GetId(){
		return id;
	}
	
	public String GetName(){
		return name;
	}
	
	public String GetLanguage(){
		return language;
	}
	
	public String GetImgId(){
		return imgId;
	}
}
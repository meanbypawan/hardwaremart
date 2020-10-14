package com.hardwaremart.bean;

public class Product {
   private String id;
   private String name;
   private String description;
   private int price;
   public String getId(){
     return id;
   }
   public String getName(){
     return name;
   }
   public String getDescription(){
     return description;
   }
   public int getPrice(){
     return price;
   }
   public void setId(int id){
     this.id = id;
   }
   public void setName(String name){
     this.name = name;
   }
   public void setDescription(String description){
     this.description = description;
   }
   public void setPrice(int price){
     this.price = price;
   }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structures;

/**
 *
 * @author user
 */
public class FoodItem {
    private int foodId;
    private int restaurantId;
    private String foodName;
    private double rate;
    
    public String getData(){
        return foodName+"  "+restaurantId/*to be swapped with name once db is connected*/+"  "+rate;
    }
    public boolean setData(int id,int rid,String name,double rate){
        foodId=id;
        restaurantId=rid;
        foodName=name;
        this.rate=rate;
        return true;
    }
    public FoodItem(int id,int rid,String name,double rate){
        setData(id,rid,name,rate);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structures;
import coords.Coordinate;
/**
 *
 * @author user
 */
public class Restaurant {
    private int restaurant_id;
    private String restaurant_name;
    private long restaurant_phone_num;
    private String restaurant_address;
    private Coordinate restaurant_coordinates;
    Restaurant(){
        
    }
    Restaurant(int id,String name,long phone,String address,double x,double y){
        setData(id,name,phone,address,x,y);
    }
    public String getData(){
        return restaurant_name+"\nAddress:"+restaurant_address+"\nPhone: "+restaurant_phone_num;
    }
    public Coordinate getCoordinates(){
        return restaurant_coordinates;
    }
    public int getId(){
        return restaurant_id;
    }
    public boolean setData(int id,String name,long phone,String address,double x,double y){
        restaurant_id=id;
        restaurant_name = name;
        restaurant_phone_num = phone;
        restaurant_address = address;
        restaurant_coordinates = new Coordinate(id,x,y);
        return true;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structures;

/**
 *
 * @author user
 */
public class Rating {
    private int restaurant_id;
    private double rating;
    public String getData(){
        return "Id : "+restaurant_id+" Rating : "+rating+"* ";
    }
    public double getRating(){
        return rating;
    }
    public int getId(){
        return restaurant_id;
    }
    public boolean setData(int id,double rating){
        restaurant_id=id;
        this.rating=rating;
        return true;
    }
    public boolean setRating(double rating){
        return setData(restaurant_id,rating);
    }
    Rating(int id){
        setData(id,0);
    }
    public Rating(int id,double rating){
        setData(id,rating);
    }
}

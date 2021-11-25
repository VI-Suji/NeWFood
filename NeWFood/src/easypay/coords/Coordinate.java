/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coords;
import java.lang.Math;

/**
 *
 * @author user
 */
public class Coordinate {
    public int id;
    double x,y;
    Coordinate(){
        this(0,0,0);
    }
    public Coordinate(int i,double x,double y){
        setData(x,y);
        setId(i);
    }
    boolean setData(double x,double y){
        this.x=x;
        this.y=y;
        return true;
    }
    boolean setId(int i){
        this.id=i;
        return true;
    }
    public double distance(Coordinate c){
        double a = c.x-this.x;
        a*=a;
        double b = c.y-this.y;
        b*=b;
        return Math.sqrt(a+b);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tsp;
import java.util.ArrayList;
import coords.Coordinate;
import java.lang.Math;
import structures.*;
import Restaurant.SortRestaurants;
/**
 *
 * @author user
 */
//Driver code to test the modules; not part of the final product
public class Main {
    public static void main(String args[]){
        ArrayList<Coordinate> arr = new ArrayList<Coordinate>();
        for(int i=0;i<10;i++){
            arr.add(new Coordinate(2*i,Math.random(),Math.random()));
        }
        //ArrayList<Coordinate> arr2 = new ArrayList<Coordinate>();
        double d[][]=new double[4][4];
        //d = {{0,10,15,20},{10,0,35,25},{15,35,0,30},{20,25,30,0}};
        d[0][0]=0;
        d[0][1]=10;
        d[0][2]=15;
        d[0][3]=20;
        d[1][0]=10;
        d[1][1]=0;
        d[1][2]=35;
        d[1][3]=25;
        d[2][0]=15;
        d[2][1]=35;
        d[2][2]=0;
        d[2][3]=30;
        d[3][0]=20;
        d[3][1]=25;
        d[3][2]=30;
        d[3][3]=0;
        //TspDynamicProgrammingIterative solver = new TspDynamicProgrammingIterative(0, d);
        //System.out.println("Tour: " + solver.getTour());
  
      // Print: 42.0
      //System.out.println("Tour cost: " + solver.getTourCost());
        int order[]=new int[11];
        order = Tsp.solve(arr);
        for(int i : order){
            System.out.print(" "+i);
        }
        
        System.out.println("\n\n");
        Rating[] r = new Rating[10];
        for(int i=0;i<10;i++){
            r[i]=new Rating(i,Math.random());
            System.out.print(i+" : "+r[i].getRating()+"   ");
        }System.out.println();
        order=SortRestaurants.sort(r);
        for(int i:order){
            System.out.print(i+" ");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurant;
import structures.*;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class SortRestaurants {
    public static int[] sort(Rating[] rating){
        int len = rating.length;
        int []order = new int[len];
        for(int i=0;i<len-1;i++){
            int max=i;
            for(int j=i+1;j<len;j++){
                if(rating[j].getRating()>rating[max].getRating()){
                    max=j;
                }
            }
            Rating r = rating[max];
            rating[max]=rating[i];
            rating[i]=r;
            order[i]=r.getId();
        }
        return order;
    }
}

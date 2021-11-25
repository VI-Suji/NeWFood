/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tsp;

import coords.Coordinate;
import java.util.*;
/**
 *
 * @author user
 */
public class Tsp {
    /*public static int[] solve(ArrayList<Coordinate> loc){
        int len = loc.size();
        int order[]=new int[len];
        double d[][]=new double[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                d[i][j]=loc.get(i).distance(loc.get(j));
                System.out.printf("%.2f ",d[i][j]);//rmv
            }
            System.out.println();//rmv    
        }
        boolean []v=new boolean[len];
        double ans = Double.MAX_VALUE;
        ans = tsp(d, v, 0, len, 1, 0, ans);
        System.out.println(ans);
        int tour[]=new int[len];
        for(int i=1;i<=len;i++)
            tour[i-1]=i;
        double cost = tspdp(d, tour, 1, len);        
        System.out.print("The Optimal Tour is: ");
        for(int i=1;i<=len;i++)

            System.out.print(tour[i]+"->");        

        System.out.println("1");        

        System.out.println("Minimum Cost: "+cost);
        return order;
    }
    static double tsp(double[][] graph, boolean[] v,
				int currPos, int n,
				int count, double cost, double ans)
	{

		// If last node is reached and it has a link
		// to the starting node i.e the source then
		// keep the minimum value out of the total cost
		// of traversal and "ans"
		// Finally return to check for more possible values
		if (count == n && graph[currPos][0] > 0)
		{
			ans = Math.min(ans, cost + graph[currPos][0]);
			return ans;
		}

		// BACKTRACKING STEP
		// Loop to traverse the adjacency list
		// of currPos node and increasing the count
		// by 1 and cost by graph[currPos,i] value
		for (int i = 0; i < n; i++)
		{
			if (v[i] == false && graph[currPos][i] > 0)
			{

				// Mark as visited
				v[i] = true;
				ans = tsp(graph, v, i, n, count + 1,
						cost + graph[currPos][i], ans);

				// Mark ith node as unvisited
				v[i] = false;
			}
		}
		return ans;
	}static double tspdp(double c[][], int tour[], int start, int n) 

    {

        int mintour[]=new int[10], temp[]=new int[10], i, j, k;
        double mincost=Double.MAX_VALUE,ccost;      

        if(start == n-1)

        {

            return (c[tour[n-1]][tour[n]] + c[tour[n]][1]);

        }        

        for(i=start+1; i<n; i++) 

        {

            for(j=0; j<n; j++)

                temp[j] = tour[j];        

            temp[start+1] = tour[i];

            temp[i] = tour[start+1];            

            if((c[tour[start]][tour[i]]+(ccost=tspdp(c,temp,start+1,n)))<mincost)

            {            

                mincost = c[tour[start]][tour[i]] + ccost;              

                for(k=1; k<=n; k++)

                    mintour[k] = temp[k];

            }

        }        

        for(i=1; i<=n; i++)

            tour[i] = mintour[i];

        return mincost;       

    }*/
    public static int[] solve(ArrayList<Coordinate> loc){
        int len = loc.size();
        int order[]=new int[len+1];
        double d[][]=new double[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                d[i][j]=loc.get(i).distance(loc.get(j));
                System.out.printf("%.2f ",d[i][j]);//rmv
            }
            System.out.println();//rmv    
        }
        
      int startNode = 0;
      TspDynamicProgrammingIterative solver = new TspDynamicProgrammingIterative(startNode, d);
      
      System.out.println("Tour: " + solver.getTour());
      List<Integer> temp = new ArrayList<>();
      temp = solver.getTour();
      int c=0;
      for(Integer i:temp){
          order[c]=loc.get(i).id;
          c++;
      }
      // Print: 42.0
      System.out.println("Tour cost: " + solver.getTourCost());
      return order;
    }
}

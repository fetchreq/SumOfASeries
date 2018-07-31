/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofaseries;

/**
 *
 * @author ryanprice
 */
public class SumOfASeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sum=0;
        double thisNum;
        
        for(double k = 1; k<1001; k++){
            System.out.println("First "+sum);
            thisNum = 1/Math.pow(k, 2);
            sum += thisNum;
            
        }
        double sum2 = sumSeriesHelper(1,0);
        System.out.println("Recursively " + sum2);
        System.out.println("Loop " +sum);
        System.out.println("Actual " +(Math.pow(Math.PI, 2))/6);
        
        
        // TODO code application logic here
    }
    static double sumSeriesHelper(double k, double sum){
        double intialSum = 0;
        
        return sumSeries(k,intialSum);
        
    }
    static double sumSeries(double k, double sum){
        double currentValue = k;
        double currentSum = sum;
                
        if(currentValue < 1000){
            System.out.println(currentSum);
            currentSum += (1/Math.pow(currentValue, 2));
            sumSeries(currentValue+1, currentSum);  
        }
        if(currentValue > 1000)
        {
            return currentSum;
        }
        return currentSum;
       
    }
    
}

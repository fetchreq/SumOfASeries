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
            //System.out.println("First "+sum);
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

        return sumSeries(k,sum);
        
    }
    static double sumSeries(double k, double sum){
        if (sum != 0 || sum == 0){
            if(k <1000){
                System.out.println( sum);
                sum = sum+ (1/Math.pow(k,2));
                return sumSeries(k+1, sum);
            }

        }
        return sum; 
    }
    
}

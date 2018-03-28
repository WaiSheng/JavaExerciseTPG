/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package timetool;

public class TimeTool {

    public static void main(String[] args) {
        // TODO code application logic here
        long startTime = System.nanoTime();
        methodExecute();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Took " + duration + " milliseconds");
    }
    
    public static void methodExecute()
    {
        int a = 1;
        for(int i =0 ; i < 100000 ; i++)
        {
            a += i;
        }
        
    }
    
}

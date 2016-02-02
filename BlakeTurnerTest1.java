/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blaketurnertest1;
import java.util.Scanner;
/**
 *
 * @author blake.turner352
 */
public class BlakeTurnerTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter the dimension of the room: ");
        Scanner sc1 = new Scanner(System.in);
        double length = sc1.nextDouble();
        double width = sc1.nextDouble();
        System.out.println("Please enter the cost per sq. ft. : ");
        double price = sc1.nextDouble();

        RoomDimension RD = new RoomDimension(length, width);
        RoomCarpet RC = new RoomCarpet(RD, price);
        double temp = RC.getTotalCost(); 
      
        System.out.println("Total cost is: $" + temp + "USD");
    }
    
}

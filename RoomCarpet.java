/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blaketurnertest1;

/**
 *
 * @author blake.turner352
 */
public class RoomCarpet {
    RoomDimension size;
    double carpetCost;
    public RoomCarpet(RoomDimension size, double carpetCost){
        this.size = size;
        this.carpetCost = carpetCost;
    }
    public double getTotalCost(){
        return (carpetCost*size.getArea());
    }
    
}

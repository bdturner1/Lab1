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
public class RoomDimension {
    double length;
    double width;
    public RoomDimension(double length, double width){
        this.length = length;
        this.width = width;
    }
    double getArea(){
        return length*width;
    }
    public String toString(){
        return Double.toString(width*length);
    }
}

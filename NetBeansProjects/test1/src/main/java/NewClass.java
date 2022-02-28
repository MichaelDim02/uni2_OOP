/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class NewClass {
    public static void main(String[] args) { 
    Yperklasi y1 = new Ypoklasi(); 
    y1.method(); 
    System.out.println(y1.a); 
 
    Ypoklasi y2 = new Ypoklasi(); 
    y2.method(); 
    System.out.println(((Yperklasi)y2).a); 
}
}
    
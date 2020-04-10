/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.io.PrintStream;

/**
 *
 * @author unrea
 */

public abstract class Blockgame implements Cloneable
{
    int blocks;
    String colour;
    
    
    
}
class Chess
    {
    public Chess()
    {                 
         System.out.println("blocks=64  color is=black and white");
    }
        
        
     public void changeColor(String st)
    { 
        String s=st;
        System.out.println(s);
    }
          
    void display()
    {
        int block=64;
        System.out.println(block);
    }
   public Prototype clone()
   {
       
   }
}
class Tictacto
{
    
          
    void display()
    {
        int block=9;
        System.out.println(block);
    
}
    void clone()
    {
        
    }
public class Prototype 
{
    public static void main(String[] args) 
    {
     Prototype x=new chess();
     x.display();
     x.changecolor();
     Prototype y=x.clone();
     y.display();
    }
}

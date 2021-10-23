/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10;

/**
 *
 * @author Boy
 */
public class myAbstract extends Employee{
    public myAbstract(String Firstname, int Salary){
        super(Firstname, Salary);
    }
    public void hi(){
        System.out.println(" hi");
    }
    public void work(){
        hi();
    }
}

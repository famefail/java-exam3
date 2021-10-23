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
public class Employee {
      public String firstname;
    public String lastname;
    public int salary;
    
    public Employee(String Firstname ,int Salary){
        this.firstname = Firstname;
        this.salary = Salary;
    }
    
     public Employee(String Firstname ,String Lastname ,int Salary){
        this.firstname = Firstname;
        this.lastname = Lastname;
        this.salary = Salary;
        System.out.print("Hey you use constructor overload");
    }
     
}

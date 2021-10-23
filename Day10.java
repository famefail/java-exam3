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
public class Day10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employee[] employee = new Employee[3];
       
        for(int i = 0; i < employee.length;i++){
            employee[i]  = new Employee("name" + i ,2);
           System.out.println(  employee[i].firstname + employee[i].salary);
            }
        
      myEnum Enum =  myEnum.One;
      System.out.print(Enum);   
      Employee myabstract = new myAbstract("abstract", 1234); 
     Employee em2 = myabstract;
      Programmer pro = new Programmer("boy" , 12000);
      System.out.println(pro.salary);
        Employee em1 = new Employee("boy" ,"thie",3);

    }
      public static String nickname = "BOY";
      public static int method(){
          return 2;
      }
    }
    


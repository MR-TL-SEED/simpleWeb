/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model;

/**
 *
 * @author General_user
 */
public class PersonalizedGreetingsGenerator {
   private String name;
   private char gender;

    public PersonalizedGreetingsGenerator(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }
   
   public String generateGreeting(){
       String title,greeting;
       title = determineTitle();
       greeting = "hi "+title+" "+name+". Welcome " ; 
   return greeting;
   }
     public String determineTitle(){
       String title= "Mr"; 
       if(gender == 'f' || gender =='F')
           title = "Ms";
   return title;
   }
   
   
}

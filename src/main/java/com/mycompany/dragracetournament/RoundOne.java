/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dragracetournament;

/**
 *
 * @author anaisk
 */

import java.util.Stack;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RoundOne extends Race {
    //intialise new array for Teams objects
    Teams [] arr = new Teams[12];
    
    //initialise variables
    protected String teamOne, teamTwo, teamOneDriver, teamTwoDriver;
    protected double min = 45;
    protected double max = 50;
    protected double teamOneTime, teamTwoTime;
    
   @Override
   //code to display the teams that are competing in the tournament
    public void competingTeams(){
        //intialise variable
        String nameSetter;
        
        //stack to store team names
        Stack <String> teamNames = new Stack<>();
        teamNames.push("Ferrari");
        teamNames.push("Alpha");
        teamNames.push("Aston");
        teamNames.push("Mercedes");
        teamNames.push("RB");
        teamNames.push("Haas");
        teamNames.push("Williams");
        teamNames.push("Renault");
        teamNames.push("Sauber");
        teamNames.push("McLaren");
        teamNames.push("Romeo");
        teamNames.push("Lotus");
        Collections.shuffle(teamNames);
        
        //list to shuffle driver names
        List list = new ArrayList();
        for(int i = 0; i < list.size(); i++ ){
            list.add(i);
        }
        Collections.shuffle(list);
        
        //array with driverOne names to be randomly sent to Teams class
        String [] driverOneNames = {"Vettel", "Hamilton","Ricciardo","Russell",
                                    "Gasly","Ocon","Alonso","Albon",
                                    "Senna","Schumacher","Hülkenberg","Prost"};
        Collections.shuffle(Arrays.asList(driverOneNames));
        
        //array with driverTwo names to be randomly sent to Teams class
        String [] driverTwoNames = {"Verstappen","Leclerc","Norris","Bottas",
                                    "Sainz","Stroll","Pérez","Tsunoda",
                                    "Räikkönen","Latifi","Magnussen","Zhou"};
        Collections.shuffle(Arrays.asList(driverTwoNames));
        
        //for loop to array length to set class attributes of team names and drivers
        for(int i = 0; i < arr.length; i++){
            arr[i] = new Teams();
            nameSetter = teamNames.elementAt(i);
            arr[i].setTeamName(nameSetter);
            arr[i].setDriverOne(driverOneNames[i]);
            arr[i].setDriverTwo(driverTwoNames[i]);
            
            //displays the team names and drivers
            arr[i].printTeams();
        }
    }

         
              
    
    @Override
    //code to have 1v1 races between the 12 teams
    public void miniRace(){
        //initialise counter
        int n = 0;
        
        //iterate through array and randomly set times for teams competing in 1v1 races
        for(int i = 0; i < arr.length; i++){
            if(n < arr.length-1){
                //randomly generate and team times
                teamOneTime = min + (Math.random() * (max-min)+1);
                teamTwoTime = min + (Math.random() * (max-min)+1);
                arr[n].setRoundOneTime(teamOneTime);
                arr[n+1].setRoundOneTime(teamTwoTime);
                
                //set team names for 1v1 race
                teamOne = arr[n].getTeamName();
                teamTwo = arr[n+1].getTeamName();
                //set drivers
                teamOneDriver = arr[n].getDriverOne();
                teamTwoDriver = arr[n+1].getDriverTwo();
                
                //determine which team has the lower time
                //eliminate team with higher time
                if(arr[n].getRoundOneTime() < arr[n+1].getRoundOneTime()){
                arr[n+1].eliminated = true;
                arr[n+1].setStatus(true);
            }
            else{
                arr[n].eliminated = true;
                arr[n].setStatus(true);
                
            }n = n+2;
        }
        
    }
    }
 
    
    @Override
    //code to display the winners of Round One
    public void displayWinners(){
        //intialise counter
        int x = 0;
    
        System.out.println("----------------------------------------------------------------");
        System.out.println("                         ROUND ONE RESULTS                      ");
        System.out.println("----------------------------------------------------------------");
         for(int i = 0; i < arr.length; i++){
            if(x < arr.length){
                if(arr[x].eliminated == false){
                System.out.println(arr[x].getTeamName() + " Wins!");
                System.out.format("Time: %.2f" , arr[x].getRoundOneTime(),"\n");
                System.out.println("\n");
                
                }
                
            }
            x++;
         }
        System.out.println("----------------------------------------------------------------");
    }
}
            

    


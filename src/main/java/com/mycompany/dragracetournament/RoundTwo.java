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

public class RoundTwo extends RoundOne {
    //intialise new variables to be use
    protected String teamOne, teamTwo, teamOneDriver, teamTwoDriver;
    protected double min = 40;
    protected double max = 45;
    protected double teamOneTime, teamTwoTime;
    
    //create new RoundOne object
    RoundOne round1 = new RoundOne();
    
    //run the first round
    public void displayingTeams(){
        round1.competingTeams();
    }
    public void runMiniRace(){
        round1.miniRace();
    }
    public void displayingWinners(){
        round1.displayWinners();
    }
    
    //start RoundTwo
    //display teams still in the tournament
    @Override
    public void competingTeams(){
        for(int i = 0; i < round1.arr.length; i++){
            if(round1.arr[i].getStatus() == false ){
             round1.arr[i].printTeams();
            }
        }

    }
    
    //run 1v1 races for teams still in the tournament
    @Override
    public void miniRace(){
        //intialise counter
        int j = 0;
 
        //loop through array and if team is still in tournament, set their round two time
        for(int i = 0; i < round1.arr.length; i++){
            
            if(round1.arr[i].getStatus() == false){
                if (j < 6-1){
                teamOneTime = min + (Math.random() * (max-min)+1);
                teamTwoTime = min + (Math.random() * (max-min)+1);
                round1.arr[j].setRoundTwoTime(teamOneTime);
                round1.arr[j+1].setRoundTwoTime(teamTwoTime);
                
                
                //determine which team has the higher time
                //eliminate them
                //display top 3 winning teams
                if(round1.arr[j].getRoundTwoTime() < round1.arr[j+1].getRoundTwoTime()){
                round1.arr[j+1].eliminated = true;
                round1.arr[j+1].setStatus(true);
                System.out.println(round1.arr[j].getTeamName() + " Wins!");
                System.out.format("Time: %.2f" , round1.arr[j].getRoundTwoTime(),"\n");
                    System.out.println("\n");
            }
            else{
                round1.arr[j].eliminated = true;
                round1.arr[j].setStatus(true);
                System.out.println(round1.arr[j+1].getTeamName() + " Wins!");
                    System.out.format("Time: %.2f" , round1.arr[j+1].getRoundTwoTime(),"\n");
                    System.out.println("\n");
            }
                j = j+2;
                }
                
            }
            }
    }

    
    //method to display the best times using selection sort
    public void displayWinners(){
        //insert code for selection sort of time
            }

}
        
    
    


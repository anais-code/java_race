/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dragracetournament;

/**
 *
 * @author anaisk
 */
public class Teams {
    private String teamName;
    private String driverOne;
    private String driverTwo;
    private double roundTwoTime;
    private double roundOneTime;
    protected boolean eliminated;
    
    public void Teams(){
        //initialise variables
        teamName = "Pending";
        driverOne = "Pending";
        driverTwo = "Pending";
        roundOneTime = 0.0;
        roundTwoTime = 0.0;
        eliminated = false;
    }

    //set teamName
    public void setTeamName(String teamName){
        this.teamName = teamName;
    }
    
     public final String getTeamName()
    {
        return teamName;
    }// end teamName
    
    //set driverOne
    public void setDriverOne(String driverOne){
        this.driverOne = driverOne;
    }
    public final String getDriverOne()
    {
        return driverOne;
    }// end driverOne
    
    //set driverTwo
    public void setDriverTwo(String driverTwo){
        this.driverTwo = driverTwo;
    }
    
    public final String getDriverTwo()
    {
        return driverTwo;
    }//end driverTwo

    //set roundOneTime for team
     public void setRoundOneTime(double teamTime){
        this.roundOneTime = teamTime;
    }
    public final double getRoundOneTime()
    {
            return roundOneTime;
    }//end roundOneTime

    //set roundTwoTime for team
    public void setRoundTwoTime(double teamTime){
        this.roundTwoTime = teamTime;
    }
    public final double getRoundTwoTime()
    {
            return roundTwoTime;
    }//end roundTwoTime
    
    //set status
     public void setStatus(boolean eliminated){
        this.eliminated = eliminated;
    }
    public final boolean getStatus()
    {
        return eliminated;
    }//end status
    
    //display teams
    public final void printTeams()
    {
        System.out.println("----------------------------------------------------------------");
        
        System.out.println("Team: "+getTeamName());
        System.out.println("Driver One: "+getDriverOne());
        System.out.println("Driver Two: "+getDriverTwo());

        if(getStatus() == false){
            System.out.println("Team Status: Competing");
        }
        else{
            System.out.println("Team Status: Eliminated");
        }
        
        if(getRoundOneTime() != 0.0 && getRoundTwoTime() != 0.0){
            if(getRoundOneTime() < getRoundTwoTime()){
            System.out.println("Time: " + getRoundOneTime());
            }
            else{
            System.out.println("Time: " +getRoundTwoTime());
            }
        }
        System.out.println("----------------------------------------------------------------");
    }
}

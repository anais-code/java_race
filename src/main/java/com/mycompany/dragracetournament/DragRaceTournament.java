/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dragracetournament;

/**
 *
 * @author anaisk
 */
import java.util.Scanner;


public class DragRaceTournament {

    public static void main(String[] args) {
        int choice1, choice2;
        Scanner sc = new Scanner(System.in);
        RoundTwo round1 = new RoundTwo();
        
         System.out.println("Welcome to the Pirelli Drag Race Championship 2022!");
        
        do{
            //display tournament menu and let user choose an option
            displayMenu();
            System.out.println("Select an option: ");
            choice1 = sc.nextInt();
            
            if(choice1 == 0){
                break;
            }
            //start new tournament
            else if (choice1 == 1){
                System.out.println("To start a new tournament press 1");
                
                //display competing teams
                choice2 = sc.nextInt();
                if (choice2 == 1){
                    System.out.println("Here are the competing teams");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("                         TEAMS                      ");
                    round1.displayingTeams();
                    
                    //prompt to start round 1
                    System.out.println("To start Round 1 press 1");
                    choice2 = sc.nextInt();
                    if (choice2 == 1){
                    System.out.println("Round One Starting...");
                    round1.runMiniRace();
                   
                    
                    }
                    
                    //prompt to display round one results
                    System.out.println("To see Round One results press 1");
                    choice2 = sc.nextInt();
                    if (choice2 == 1){
                        round1.displayingWinners();
                    }
                    
                    //prompt to start round 2
                    System.out.println("To Start Round Two press 1");
                    choice2 = sc.nextInt();
                    if (choice2 == 1){
                        System.out.println("----------------------------------------------------------------");
                        System.out.println("                                 TEAMS                          ");
                        round1.competingTeams();
                        System.out.println("Round 2 starting...");
                        
                    }
                    //run round1 and prompt to display round1 results
                    System.out.println("To see Round Two Results press 1");
                    choice2 = sc.nextInt();
                    if (choice2 == 1){
                        System.out.println("----------------------------------------------------------------");
                        System.out.println("                         ROUND ONE RESULTS                      ");
                        System.out.println("----------------------------------------------------------------");
                        round1.miniRace();
                        
                    }
                    else{
                        break;
                    }
                }
                else{
                    break;
                }
            }
            //prevents user input other than what is specified
        } while(choice1 != 0 || choice1 != 1);
        }
    
        //display tournament menu
        public static void displayMenu(){
            System.out.println("--------------------------------");
            System.out.println("| 0. Exit                       ");
            System.out.println("| 1. New Tournament             ");
            System.out.println("--------------------------------");   
            }


}


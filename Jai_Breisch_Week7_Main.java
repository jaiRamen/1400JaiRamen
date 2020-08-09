//Jai Breisch

//Note: Issac F, Allen W, Mary J Contributed/collaborated to fix the holes in my code
package jai_Breisch_Week7_assignment1;

import java.util.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class Jai_Breisch_Week7_Main {

	public static void main(String[] args) {
		//Jai Breisch - Week 7 Asignment 1400 - Teams/arrays/loops/you name it!
		//ALSO THE SEAHAWKS ARE THE BEST TEAM SO NO NEED TO SET THAT AS A DIFF VAR...

				int teamTotal = 0;
				int gameTotal = 0;
				int scoreSum;
				int seaHawks = 0;
				int bestTeams = 0;
				Scanner input = new Scanner(System.in);
				
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Football Team Randomized Season Scores");
				System.out.println("-----------------------------------------------------------------");
				System.out.printf("Enter the number of teams: ", teamTotal);
				teamTotal = input.nextInt();
				System.out.printf("Enter the number of games: ", gameTotal);
				gameTotal = input.nextInt();
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Admit it...The SeaHawks Won ... aka Score Report");
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Team \t Scores \t\t\t\t Total \t Avg");
				System.out.println("-----------------------------------------------------------------");
				
				int[][] gameResults = new int[teamTotal][gameTotal];
		// This nested for loop iterates through an array. i is the row, j is the column. 
				for (int i = 0; i < teamTotal; i++) {
					scoreSum = 0;
					System.out.printf("%d: \t ", i+1);
					for (int j = 0; j < gameTotal; j++) {
						gameResults[i][j] = ThreadLocalRandom.current().nextInt(10, 100);
						System.out.print(gameResults[i][j] + " ");
						scoreSum= scoreSum + gameResults[i][j];
					}
		// This if statement is used to get the top_team index. 
					if (scoreSum > seaHawks) {
						seaHawks =scoreSum;
						bestTeams = i+1;
					}
					System.out.print("\t\t " + scoreSum);
					System.out.print("\t " +scoreSum/gameTotal + " ");
					System.out.println();
				}
				System.out.println("-----------------------------------------------------------------");
				System.out.printf("Top Team: The Seahawks Team %d", bestTeams);	}


	}


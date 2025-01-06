package com.linkedin.javacodechallenges;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {

  private int startPoints = 10;
  private int currentPoints = startPoints;
  Random random = new Random();
  private boolean isStillWantsToPlay = true;
  Scanner userInput = new Scanner(System.in);

  public void playGame() {
    printWelcome();
    startGame();

    while (this.isStillWantsToPlay) {
      if (randomDouble()) {
        congratulateUser();
        askUserDoubleOrNothing();
      } else {
        printLost();
        return;
      }
    }
  }

  private void printWelcome() {
    System.out.println("Hi! Welcome to the Game Double or Nothing");
  }

  private void printLost() {
    System.out.println("Sorry you lost the game with points " + this.currentPoints);
  }

  private void askUserDoubleOrNothing() {
    System.out.println("Do you want to continue the game");
    this.isStillWantsToPlay = this.userInput.nextLine().toLowerCase().equals("yes");
  }

  private void congratulateUser() {
    System.out.println("Congratulations you won the game with points " + doubleIt());
  }

  private boolean randomDouble() {
    return this.random.nextInt(2) == 0;
  }

  private int doubleIt() {
    return this.currentPoints * 2;
  }

  private void startGame() {
    System.out.println("Let's start the game. Your Curent points is " + this.startPoints);
  }
}
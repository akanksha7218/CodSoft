import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();
    int rand=random.nextInt(100);
    System.out.println(rand);
    Scanner sc=new Scanner(System.in);
    int score=0;
    int won=0;
    while(true){
      System.out.println("Enter a number");
      int guess=sc.nextInt();
      if(guess==rand){
        System.out.println("you guessed the number:"+guess);
        won++;
        System.out.println("enter 1 to play again\nenter 2 to check score of user \nenter 3 to exit");
        int choose=sc.nextInt();
        if(choose==1){
          rand=random.nextInt(100);
        }else if(choose==2){
          System.out.println("enter your name:");
          String name=sc.next();
          System.out.println(name+ "'s total tries are:"+score);
          System.out.println(name +"'s total won's "+won+" times.");
          break;
        }else if(choose==3){
          System.out.println("Thank you! you played well");
          break;
        }
      }else if(guess<rand){
        System.out.println("your guess is less than number");
        score++;
      }else{
        System.out.println("your guess is greater than number");
        score++;
      }
    }
  }
}

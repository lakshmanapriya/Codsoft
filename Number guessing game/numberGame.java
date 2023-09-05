import java.util.Random;
import java.util.Scanner;
public class numberGame{
public static void main(String[] args){
Random myobj1 = new Random();
int anotherNumber= myobj1.nextInt();
int i;
for(i=0;i<5;i++){
Scanner myobj = new Scanner(System.in);
int guessNumber;
System.out.println("enter the guessingnumber");
guessNumber = myobj.nextInt();
if(anotherNumber==guessNumber){
System.out.println("correct");
}
else if(anotherNumber>guessNumber){
System.out.println("low");
}
else if(anotherNumber<guessNumber)
System.out.println("high");
}
}
} 
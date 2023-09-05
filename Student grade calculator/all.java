import java.util.Scanner;
public class all{
public static void main(String[]args){
 Scanner myObj = new Scanner(System.in); 
    System.out.println("Enter username");
String name = myObj.nextLine();
int sum = 0;
int avg = 0;
int per = 0;
for(int i=0;i<5;i++){
System.out.println("Enter marks");
int mark = myObj.nextInt();
sum = sum+mark;
avg = sum/5;
per = avg%100;
}
System.out.println("Sum:"+sum);
System.out.println( "Avg:"+avg);
System.out.println("The Avg Percentage is:"+

per);
if(avg>90){
System.out.println("The grade is:"+"A");
}
else if(avg>80){
System.out.println("The grade is:"+"B");
}
else if(avg>70){
System.out.println("The grade is:"+"C");
}
else if(avg>60){
System.out.println("The grade is:"+"D");
}
else if(avg>50){
System.out.println("The grade is:"+"E");
}
else if(avg>40){
System.out.println("The grade is:"+"F");
}
else{
System.out.println("No grade");
} 
}
}
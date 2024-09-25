import java.util.Scanner;
public class IT24101102Lab7Q1A{
  public static void main(String[] args){
  Scanner n = new Scanner(System.in);
  System.out.println("Enter marks for four subjects:");
  int[] marks = new int[5];
  int tot = 0;

  for(int i = 1; i <= 4; i++){
   System.out.print("Enter subject mark" + i + ":");
   marks[i] = n.nextInt();
   tot = tot + marks[i];}

  double avg = tot/4.0;
  System.out.println();
  System.out.println("Average is:" + avg);

  if(avg >= 75 && avg <= 100){
   System.out.println("Overall grade is: Distinction");}
  else if(avg >= 50 && avg <= 74){
   System.out.println("Overall grade is: Credit");}
  else{
   System.out.println("Overall grade is: Fail");}
  }
}
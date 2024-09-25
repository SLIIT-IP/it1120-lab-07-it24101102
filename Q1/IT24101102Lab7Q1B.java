import java.util.Scanner;
public class IT24101102Lab7Q1B{
  public static void main(String[] args){
  Scanner n = new Scanner(System.in);

  int[][] marks = new int[4][5];
  
  for (int i = 1; i <= 3; i++){
    System.out.println();
    System.out.println("Student" + i);
  
  String grade;
  int tot = 0;
  
  for(int j = 1; j <= 4; j++){
    System.out.print("Enter marks:");
    marks[i][j] = n.nextInt();
    tot = tot + marks[i][j];}

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
}


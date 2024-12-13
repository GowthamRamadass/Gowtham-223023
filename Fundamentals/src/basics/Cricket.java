package basics;

import java.util.Scanner;
class Cricket
{
  public static void main(String args[])
  {
    Scanner in  = new Scanner(System.in);
    int balls = in.nextInt();
    int runs = in.nextInt();
    int score = in.nextInt();
    int balls_done = in.nextInt();
    
    float overs = balls/6;
    float overs_f = balls_done/6;
    overs_f += ((balls_done%6)*0.1f); //0.3
    float runrate = score/overs_f;
    float t_runrate = runs / overs;
    
    System.out.printf("%d\n%.1f\n%.1f\n%.1f\n",(int)overs,overs_f,runrate,t_runrate);
    if(runrate > t_runrate)
    {
      System.out.print("Eligible to Win");
    }
    else
    {
      System.out.print("Not Eligible to Win");
    }
  }
}
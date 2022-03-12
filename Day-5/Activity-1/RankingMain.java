import java.util.*;  
    public class RankingMain{  
    public static void main(String args[]){  
    ArrayList<Ranking> al=new ArrayList<Ranking>();  
    Scanner sc=new Scanner(System.in);

    System.out.println("Please Enter the number of players");
    int num=sc.nextInt();
    String[] name=new String[num]; 
    int score[]=new int[num];

  
    for(int i=0;i<num;i++){
        Scanner vc=new Scanner(System.in);
        System.out.println("Enter the Name of the player "+i);
        name[i]=vc.nextLine();
        System.out.println("Enter the Score of the player "+i);
        score[i]=vc.nextInt();
        al.add(new Ranking(name[i],score[i]));
    }
      
    Collections.sort(al);  
    for(Ranking pl:al){  
    System.out.println(pl.name+" "+pl.score);  
    }  
    }  
    }  
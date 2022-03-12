import java.util.*;  
import java.io.*;  
  
class TeamMain{  
public static void main(String args[]){  
  
ArrayList<Team> al=new ArrayList<Team>();  

    Scanner sc=new Scanner(System.in);

    System.out.println("Please provide the number of teams");
    int num=sc.nextInt();
    String[] name=new String[num]; 
    long match[]=new long[num];


    for(int i=0;i<num;i++){

        Scanner vc=new Scanner(System.in);
        System.out.println("Enter details of team "+(i+1));
        System.out.println("Enter name of the team ");
        name[i]=vc.nextLine();
        System.out.println("Enter number of matches");
        match[i]=vc.nextInt();
        al.add(new Team(name[i],match[i]));
    }
   
  
System.out.println("Team list after sort by number of matches");  
  
Collections.sort(al,new TeamComparator());  
Iterator itr2=al.iterator();  
while(itr2.hasNext()){  
Team st=(Team)itr2.next();  
System.out.println(st.name+" "+st.match);  
}   
}  
} 
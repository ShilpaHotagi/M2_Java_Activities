import java.util.*;  
class TeamComparator implements Comparator{  
public int compare(Object o1,Object o2){  
Team t1=(Team)o1;  
Team t2=(Team)o2;  
  
if(t1.match==t2.match)  
return 0;  
else if(t1.match>t2.match)  
return 1;  
else  
return -1;  
}  
} 
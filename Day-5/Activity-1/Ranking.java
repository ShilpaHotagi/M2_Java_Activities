class Ranking implements Comparable<Ranking>{  
  
    String name;  
    int score;  

    Ranking(String name,int score){ 

    this.name=name;  
    this.score=score;  
    }  
      
    public int compareTo(Ranking pl){  
    if(score==pl.score)  
    return 0;  
    else if(score<pl.score)  
    return 1;  
    else  
    return -1;  
    }  
    }  
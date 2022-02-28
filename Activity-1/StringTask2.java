import java.util.Scanner;

public class StringTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String player1 = sc.nextLine(); // Taking Player1 full Name as input
        String player2 = sc.nextLine(); //// Taking Player2 full Name as input
        String[] p1 = player1.split("\\s");  // Splitting string on based on space.-> ["firstname","lastname"]
        String[] p2 = player2.split("\\s"); // Splitting string on based on space.-> ["firstname","lastname"]
        player1 = p1[1]; //over writing player1 full name by lastname
        player2 = p2[1]; //over writing player1 full name by lastname

        //Comparing the values of both the string to check whether they belong to same team. if compareTo method returns 0 that both are equal else no.
        if(player1.compareTo(player2) == 0)
        {
            System.out.println("yes");
        }else {
            System.out.println("No");
        }

    }
}

package programs;

public class CricketPlayerProfile {
public static void main(String[] args) {
	byte Wicket_taken = 2;
	short Balls_faced = 58;
	short Runs_Scored = 92;
	int  Match_Id = 202600101;
	float Batting_Average = 48.6f;
	char Player_Grade = 'A';
	boolean M_OF_Match = true;
	float Strike_Rate ;
	
	Strike_Rate = Runs_Scored *100.0f;
	Strike_Rate = Strike_Rate/Balls_faced;
	
	System.out.println("Match Id : "+Match_Id);
	System.out.println("Batting Average : "+Batting_Average);
	System.out.println("Player Grade : "+Player_Grade);
	System.out.println("Wickets taken : "+Wicket_taken);
	System.out.println("The Strike Rate : "+Strike_Rate);
	System.out.println("Man of The Match : "+M_OF_Match);
}
}

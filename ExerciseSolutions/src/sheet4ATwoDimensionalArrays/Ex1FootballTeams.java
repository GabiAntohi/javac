package sheet4ATwoDimensionalArrays;

public class Ex1FootballTeams {
	public static void main(String[] args) {
		String[][]football = {
				{"team1", "john", "michael", "blah"},
				{"team2", "john", "michael", "blah"},
				{"team3", "john", "michael", "blah"}
		};
		for( int i=0; i<football.length; i++){
			for( int j=0; j<football[i].length; j++){
				System.out.print(football[i][j] + " ");
				}
			System.out.println();
		}
		System.out.println("just the team not the name");
		for( int i=0; i<football.length; i++){
			for( int j=1; j<football[i].length; j++){
				System.out.print(football[i][j] + " ");
				}
			System.out.println();
		}
		
	}

}

public class TeamStandings {
  
    public static String divisionString(String divName, String heading1, String heading2) {
String result = String.format("%25s %10s %10s\n", divName, heading1, heading2);
return result;
}
  
  
    public static String teamString(String teamName, int numWins, int numLosses) {
String result = String.format("%25s %10d %10d\n", teamName, numWins, numLosses);
return result;
}

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
  System.out.print(divisionString("National League", "Wins", "Loses"));
  System.out.println();
  System.out.print(teamString("Chicago Cubs", 25, 13));
  System.out.print(teamString("LA Dodgers", 20, 16));
  System.out.print(teamString("Atlanta Braves", 20, 16));
  System.out.print(teamString("Cincinnati Reds", 19, 19));
  System.out.print(teamString("Colorado Rockies", 13, 25));
 }

}
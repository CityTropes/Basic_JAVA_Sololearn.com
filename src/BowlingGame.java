import java.util.*; 

 public class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
  
    public void getWinner(){
        int maxValue = (Collections.max(players.values()));
        
        for (Map.Entry < String, Integer > entry : players.entrySet()){
            if(entry.getValue() == maxValue){
                System.out.println(entry.getKey());
            }
        }
    }
}

public class BowlingGame
{
    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}

//sololearn.com Module 6: Bowling Game
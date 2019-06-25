package exercise2;

import java.util.ArrayList;
import java.util.List;

public class NationalTeam19 {
    public List<Player> players;

    public NationalTeam19(){
        this.players = new ArrayList<>(23);
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }
}

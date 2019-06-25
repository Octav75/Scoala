package exercise2;

import java.util.ArrayList;
import java.util.List;

public class NationalTeamU21 {
    public List<Player> players;

    public NationalTeamU21(){
        this.players = new ArrayList<>(23);
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }
}

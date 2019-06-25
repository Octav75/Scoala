package exercise2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NationalTeam {

    public List<Player> players;

    public NationalTeam() {
        this.players = new ArrayList<>(23);
    }

    public void addPlayer (Player player) {
        this.players.add(player);
    }


}

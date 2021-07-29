package blackjack.domain.participant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Players {
    private final List<Player> players;

    public Players(List<Player> players) {
        this.players = Collections.unmodifiableList(new ArrayList<>(players));
    }

    public List<Player> getPlayers() {
        return players;
    }
}

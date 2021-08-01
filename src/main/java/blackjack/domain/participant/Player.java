package blackjack.domain.participant;

import blackjack.domain.card.Card;

import java.util.List;

import static blackjack.domain.game.Table.INITIAL_DEAL_COUNT;

public class Player extends Participant {
    private final String name;

    public Player(String name, List<Card> cards) {
        super(cards);
        this.name = name;
    }

    public boolean neverHit() {
        return this.countHands() == INITIAL_DEAL_COUNT;
    }

    public String getName() {
        return name;
    }
}

package com.cuhtis.coup.models.deck;

import com.cuhtis.coup.models.cards.interfaces.ICard;
import com.cuhtis.coup.models.deck.interfaces.IDeck;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseDeck implements IDeck {
    private List<ICard> mCards;

    protected BaseDeck(List<ICard> cards) {
        this.mCards = cards;
    }

    public List<ICard> getCards() {
        return this.mCards;
    }
}

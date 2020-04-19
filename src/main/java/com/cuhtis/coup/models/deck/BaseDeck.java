package com.cuhtis.coup.models.deck;

import com.cuhtis.coup.models.cards.interfaces.ICard;
import com.cuhtis.coup.models.deck.interfaces.IDeck;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseDeck implements IDeck {
    protected List<ICard> mCards = new ArrayList<>();

    public List<ICard> getCards() {
        return this.mCards;
    }

    public int getCardCount() {
        return this.mCards.size();
    }
}

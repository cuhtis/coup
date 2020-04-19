package com.cuhtis.coup.models.deck;

import com.cuhtis.coup.models.cards.interfaces.ICard;
import com.cuhtis.coup.models.deck.interfaces.IDeck;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public abstract class BaseDeck implements IDeck {
    protected Stack<ICard> mCards = new Stack<>();

    public List<ICard> getCards() {
        return this.mCards;
    }

    public int getCardCount() {
        return this.mCards.size();
    }

    public ICard takeCard() {
        return this.mCards.pop();
    }

    public IDeck shuffle() {
        Collections.shuffle(this.mCards);
        return this;
    }
}

package com.cuhtis.coup.models.deck.interfaces;

import com.cuhtis.coup.models.cards.interfaces.ICard;
import java.util.List;

public interface IDeck {

    public List<ICard> getCards();

    public int getCardCount();
}

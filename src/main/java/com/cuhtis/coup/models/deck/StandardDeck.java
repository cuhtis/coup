package com.cuhtis.coup.models.deck;

import com.cuhtis.coup.models.cards.AmbassadorCard;
import com.cuhtis.coup.models.cards.AssassinCard;
import com.cuhtis.coup.models.cards.CaptainCard;
import com.cuhtis.coup.models.cards.ContessaCard;
import com.cuhtis.coup.models.cards.DukeCard;
import com.cuhtis.coup.models.cards.interfaces.ICard;
import java.util.Arrays;
import java.util.List;

public class StandardDeck extends BaseDeck {

    protected StandardDeck(List<ICard> cards) {
        super(cards);
    }

    public static StandardDeck create() {
        // Three of each card type, fifteen cards total
        List<ICard> cards = Arrays.asList(
            new AmbassadorCard(),
            new AmbassadorCard(),
            new AmbassadorCard(),
            new AssassinCard(),
            new AssassinCard(),
            new AssassinCard(),
            new CaptainCard(),
            new CaptainCard(),
            new CaptainCard(),
            new ContessaCard(),
            new ContessaCard(),
            new ContessaCard(),
            new DukeCard(),
            new DukeCard(),
            new DukeCard());
        return new StandardDeck(cards);
    }
}

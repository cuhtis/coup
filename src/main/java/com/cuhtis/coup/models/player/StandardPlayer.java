package com.cuhtis.coup.models.player;

import com.cuhtis.coup.models.actions.interfaces.IAction;
import com.cuhtis.coup.models.actions.CoupAction;
import com.cuhtis.coup.models.actions.ForeignAidAction;
import com.cuhtis.coup.models.actions.IncomeAction;
import com.cuhtis.coup.models.deck.interfaces.IDeck;
import java.util.Arrays;
import java.util.List;

public class StandardPlayer extends BasePlayer {

    public StandardPlayer(IDeck deck) {
        super();
        this.mCoinCount = 2;
        this.mCards.add(deck.takeCard());
        this.mCards.add(deck.takeCard());
    }

    @Override
    public List<IAction> getActions() {
        return Arrays.asList(
            new CoupAction(),
            new ForeignAidAction(),
            new IncomeAction());
    }
}

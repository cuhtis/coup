package com.cuhtis.coup.models.player;

import com.cuhtis.coup.models.actions.interfaces.IAction;
import com.cuhtis.coup.models.cards.interfaces.ICard;
import com.cuhtis.coup.models.player.interfaces.IPlayer;
import java.util.ArrayList;
import java.util.List;

public abstract class BasePlayer implements IPlayer {

    protected int mCoinCount = 0;
    protected List<ICard> mCards = new ArrayList<>();

    public int getCoinCount() {
        return this.mCoinCount;
    }

    public List<IAction> getActions() {
        return new ArrayList<>();
    }

    public List<ICard> getCards() {
        return this.mCards;
    }
}

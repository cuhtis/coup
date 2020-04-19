package com.cuhtis.coup.models.player.interfaces;

import com.cuhtis.coup.models.actions.interfaces.IAction;
import com.cuhtis.coup.models.cards.interfaces.ICard;
import java.util.List;

public interface IPlayer {

    public int getCoinCount();

    public List<IAction> getActions();

    public List<ICard> getCards();
}

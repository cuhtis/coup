package com.cuhtis.coup.models.cards.interfaces;

import com.cuhtis.coup.models.actions.interfaces.IAction;

public interface ICard {

    public String getName();

    public IAction[] getActions();
}

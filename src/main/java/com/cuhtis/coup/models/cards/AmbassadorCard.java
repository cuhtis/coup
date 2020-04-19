package com.cuhtis.coup.models.cards;

import com.cuhtis.coup.models.actions.interfaces.IAction;
import com.cuhtis.coup.models.actions.ExchangeAction;

public final class AmbassadorCard extends BaseCard {

    public String getName() {
        return "Ambassador";
    }

    public IAction[] getActions() {
        return new IAction[]{
            new ExchangeAction(),
        };
    }
}

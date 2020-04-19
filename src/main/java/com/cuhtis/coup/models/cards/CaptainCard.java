package com.cuhtis.coup.models.cards;

import com.cuhtis.coup.models.actions.interfaces.IAction;
import com.cuhtis.coup.models.actions.StealAction;

public final class CaptainCard extends BaseCard {

    public String getName() {
        return "Captain";
    }

    public IAction[] getActions() {
        return new IAction[]{
            new StealAction(),
        };
    }
}

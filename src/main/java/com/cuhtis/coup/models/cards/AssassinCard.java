package com.cuhtis.coup.models.cards;

import com.cuhtis.coup.models.actions.interfaces.IAction;
import com.cuhtis.coup.models.actions.AssassinateAction;

public final class AssassinCard extends BaseCard {

    public String getName() {
        return "Assassin";
    }

    public IAction[] getActions() {
        return new IAction[]{
            new AssassinateAction(),
        };
    }
}

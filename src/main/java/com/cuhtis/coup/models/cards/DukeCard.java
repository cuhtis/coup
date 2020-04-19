package com.cuhtis.coup.models.cards;

import com.cuhtis.coup.models.actions.interfaces.IAction;
import com.cuhtis.coup.models.actions.TaxAction;

public final class DukeCard extends BaseCard {

    public String getName() {
        return "Duke";
    }

    public IAction[] getActions() {
        return new IAction[]{
            new TaxAction(),
        };
    }
}

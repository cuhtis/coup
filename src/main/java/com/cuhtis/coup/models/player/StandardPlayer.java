package com.cuhtis.coup.models.player;

import com.cuhtis.coup.models.actions.interfaces.IAction;
import com.cuhtis.coup.models.actions.CoupAction;
import com.cuhtis.coup.models.actions.ForeignAidAction;
import com.cuhtis.coup.models.actions.IncomeAction;
import java.util.Arrays;
import java.util.List;

public class StandardPlayer extends BasePlayer {

    public StandardPlayer() {
        super();
        this.mCoinCount = 2;
    }

    @Override
    public List<IAction> getActions() {
        return Arrays.asList(
            new CoupAction(),
            new ForeignAidAction(),
            new IncomeAction());
    }
}

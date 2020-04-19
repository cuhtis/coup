package com.cuhtis.coup.models.actions;

import com.cuhtis.coup.models.actions.interfaces.IAction;
import graphql.kickstart.tools.GraphQLQueryResolver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ActionRepository {

    public List<IAction> getAll() {
        return Arrays.asList(
            new AssassinateAction(),
            new CoupAction(),
            new ExchangeAction(),
            new ForeignAidAction(),
            new IncomeAction(),
            new StealAction(),
            new TaxAction());
    }
}

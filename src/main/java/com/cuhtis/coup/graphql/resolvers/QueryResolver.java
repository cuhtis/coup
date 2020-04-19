package com.cuhtis.coup.graphql.resolvers;

import com.cuhtis.coup.models.actions.interfaces.IAction;
import com.cuhtis.coup.models.actions.ActionRepository;
import com.cuhtis.coup.models.actions.interfaces.IAction;
import com.cuhtis.coup.models.cards.CardRepository;
import com.cuhtis.coup.models.cards.interfaces.ICard;
import com.cuhtis.coup.models.deck.interfaces.IDeck;
import com.cuhtis.coup.models.deck.StandardDeck;
import graphql.kickstart.tools.GraphQLQueryResolver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    @Autowired
    private ActionRepository mActionRepository;
    @Autowired
    private CardRepository mCardRepository;

    public QueryResolver(
        ActionRepository actionRepository, CardRepository cardRepository) {
        this.mActionRepository = actionRepository;
        this.mCardRepository = cardRepository;
    }

    public List<IAction> actions() {
        return this.mActionRepository.getAll();
    }

    public List<ICard> cards() {
        return this.mCardRepository.getAll();
    }

    public IDeck standard_deck() {
        return StandardDeck.create();
    }
}

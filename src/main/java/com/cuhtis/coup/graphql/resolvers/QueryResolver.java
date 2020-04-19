package com.cuhtis.coup.graphql.resolvers;

import com.cuhtis.coup.models.actions.ActionRepository;
import com.cuhtis.coup.models.actions.BaseAction;
import com.cuhtis.coup.models.cards.BaseCard;
import com.cuhtis.coup.models.cards.CardRepository;
import com.cuhtis.coup.models.deck.BaseDeck;
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

    public List<BaseAction> actions() {
        return this.mActionRepository.getAll();
    }

    public List<BaseCard> cards() {
        return this.mCardRepository.getAll();
    }

    public BaseDeck standard_deck() {
        return StandardDeck.create();
    }
}

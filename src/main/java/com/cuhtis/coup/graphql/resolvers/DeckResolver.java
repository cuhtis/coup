package com.cuhtis.coup.graphql.resolvers;

import com.cuhtis.coup.models.deck.BaseDeck;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

@Component
public class DeckResolver implements GraphQLResolver<BaseDeck> {

    public int card_count(BaseDeck deck) {
        return deck.getCardCount();
    }
}

package com.cuhtis.coup.graphql.resolvers;

import com.cuhtis.coup.models.deck.interfaces.IDeck;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

@Component
public class DeckResolver implements GraphQLResolver<IDeck> {

    public int card_count(IDeck deck) {
        return deck.getCardCount();
    }
}

package com.cuhtis.coup;

import com.cuhtis.coup.graphql.resolvers.DeckResolver;
import com.cuhtis.coup.graphql.resolvers.QueryResolver;
import com.cuhtis.coup.models.actions.interfaces.IAction;
import com.cuhtis.coup.models.actions.ActionRepository;
import com.cuhtis.coup.models.actions.interfaces.IAction;
import com.cuhtis.coup.models.cards.CardRepository;
import com.cuhtis.coup.models.cards.interfaces.ICard;
import com.cuhtis.coup.models.deck.interfaces.IDeck;
import graphql.Scalars;
import graphql.kickstart.tools.SchemaParser;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoupApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoupApplication.class, args);
	}

    @Bean
    GraphQLSchema schema() {
		ActionRepository actionRepository = new ActionRepository();
		CardRepository cardRepository = new CardRepository();
        return SchemaParser.newParser()
			.file("schema.graphql")
			.resolvers(
				new QueryResolver(actionRepository, cardRepository),
				new DeckResolver())
    		.dictionary("Action", IAction.class)
    		.dictionary("Card", ICard.class)
    		.dictionary("Deck", IDeck.class)
            .build()
			.makeExecutableSchema();
    }
}

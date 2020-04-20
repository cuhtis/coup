package com.cuhtis.coup;

import com.cuhtis.coup.graphql.resolvers.DeckResolver;
import com.cuhtis.coup.graphql.resolvers.PlayerResolver;
import com.cuhtis.coup.graphql.resolvers.QueryResolver;
import com.cuhtis.coup.models.actions.interfaces.IAction;
import com.cuhtis.coup.models.actions.ActionRepository;
import com.cuhtis.coup.models.actions.interfaces.IAction;
import com.cuhtis.coup.models.cards.CardRepository;
import com.cuhtis.coup.models.cards.interfaces.ICard;
import com.cuhtis.coup.models.deck.interfaces.IDeck;
import com.cuhtis.coup.models.game.interfaces.IGame;
import com.cuhtis.coup.models.player.interfaces.IPlayer;
import graphql.Scalars;
import graphql.kickstart.tools.SchemaParser;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoupApplication {

	@Autowired private DeckResolver mDeckResolver;
	@Autowired private PlayerResolver mPlayerResolver;
	@Autowired private QueryResolver mQueryResolver;

	public static void main(String[] args) {
		SpringApplication.run(CoupApplication.class, args);
	}

    @Bean
    GraphQLSchema schema() {
        return SchemaParser.newParser()
			.file("schema.graphqls")
			.resolvers(
				this.mDeckResolver,
				this.mPlayerResolver,
				this.mQueryResolver)
    		.dictionary("Action", IAction.class)
    		.dictionary("Card", ICard.class)
    		.dictionary("Deck", IDeck.class)
    		.dictionary("Game", IGame.class)
    		.dictionary("Player", IPlayer.class)
            .build()
			.makeExecutableSchema();
    }
}

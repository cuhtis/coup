package com.cuhtis.coup;

import com.cuhtis.coup.graphql.resolvers.Query;
import com.cuhtis.coup.models.cards.AmbassadorCard;
import com.cuhtis.coup.models.cards.AssassinCard;
import com.cuhtis.coup.models.cards.CaptainCard;
import com.cuhtis.coup.models.cards.CardRepository;
import com.cuhtis.coup.models.cards.ContessaCard;
import com.cuhtis.coup.models.cards.DukeCard;
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
		CardRepository cardRepository = new CardRepository();
        return SchemaParser.newParser()
			.file("schema.graphql")
			.resolvers(new Query(cardRepository))
    		.dictionary("AmbassadorCard", AmbassadorCard.class)
    		.dictionary("AssassinCard", AssassinCard.class)
    		.dictionary("CaptainCard", CaptainCard.class)
    		.dictionary("ContessaCard", ContessaCard.class)
    		.dictionary("DukeCard", DukeCard.class)
            .build()
			.makeExecutableSchema();
    }
}

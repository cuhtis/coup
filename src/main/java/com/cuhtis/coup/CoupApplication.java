package com.cuhtis.coup;

import com.cuhtis.coup.graphql.resolvers.Query;
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
        return SchemaParser.newParser()
			.file("schema.graphql")
			.resolvers(new Query())
            .build()
			.makeExecutableSchema();
    }
}

package com.cuhtis.coup.graphql.resolvers;

import com.cuhtis.coup.models.player.interfaces.IPlayer;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

@Component
public class PlayerResolver implements GraphQLResolver<IPlayer> {

    public int coin_count(IPlayer player) {
        return player.getCoinCount();
    }
}

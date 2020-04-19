package com.cuhtis.coup.models.cards;

import com.cuhtis.coup.models.cards.interfaces.ICard;
import graphql.kickstart.tools.GraphQLQueryResolver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class CardRepository {

    public List<ICard> getAll() {
        return Arrays.asList(
            new AmbassadorCard(),
            new AssassinCard(),
            new CaptainCard(),
            new ContessaCard(),
            new DukeCard());
    }
}

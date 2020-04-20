package com.cuhtis.coup.graphql.resolvers;

import com.cuhtis.coup.models.actions.interfaces.IAction;
import com.cuhtis.coup.models.actions.ActionRepository;
import com.cuhtis.coup.models.actions.interfaces.IAction;
import com.cuhtis.coup.models.cards.CardRepository;
import com.cuhtis.coup.models.cards.interfaces.ICard;
import com.cuhtis.coup.models.game.interfaces.IGame;
import com.cuhtis.coup.models.game.StandardGame;
import com.cuhtis.coup.models.game.StandardGameRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    @Autowired private ActionRepository mActionRepository;
    @Autowired private CardRepository mCardRepository;
    @Autowired private StandardGameRepository mStandardGameRepository;

    public List<IAction> actions() {
        return this.mActionRepository.getAll();
    }

    public List<ICard> cards() {
        return this.mCardRepository.getAll();
    }

    public IGame game() {
        Optional<StandardGame> game = this.mStandardGameRepository.findById(1);
        if (game.isPresent()) {
            return game.get();
        } else {
            return null;
        }
    }

    public IGame standard_game() {
        return new StandardGame(2);
    }
}

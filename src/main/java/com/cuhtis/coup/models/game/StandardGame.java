package com.cuhtis.coup.models.game;

import com.cuhtis.coup.models.deck.interfaces.IDeck;
import com.cuhtis.coup.models.deck.StandardDeck;
import com.cuhtis.coup.models.player.interfaces.IPlayer;
import com.cuhtis.coup.models.player.StandardPlayer;
import java.util.List;

public class StandardGame extends BaseGame {

    public StandardGame(int numPlayers) {
        super(new StandardDeck());
        for (int i = 0; i < numPlayers; i++) {
            this.mPlayers.add(new StandardPlayer(this.mDeck));
        }
    }
}

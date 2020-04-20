package com.cuhtis.coup.models.game;

import com.cuhtis.coup.models.deck.interfaces.IDeck;
import com.cuhtis.coup.models.deck.StandardDeck;
import com.cuhtis.coup.models.player.interfaces.IPlayer;
import com.cuhtis.coup.models.player.StandardPlayer;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "standard_games")
public class StandardGame extends BaseGame {

    public StandardGame() {
        super(new StandardDeck());
    }

    public StandardGame(int numPlayers) {
        this();
        for (int i = 0; i < numPlayers; i++) {
            this.mPlayers.add(new StandardPlayer(this.mDeck));
        }
    }
}

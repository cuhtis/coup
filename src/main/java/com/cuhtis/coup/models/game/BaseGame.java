package com.cuhtis.coup.models.game;

import com.cuhtis.coup.models.deck.interfaces.IDeck;
import com.cuhtis.coup.models.game.interfaces.IGame;
import com.cuhtis.coup.models.player.interfaces.IPlayer;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@MappedSuperclass
public abstract class BaseGame implements IGame {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Transient protected IDeck mDeck;
    @Transient protected List<IPlayer> mPlayers = new ArrayList<>();

    public BaseGame(IDeck deck) {
        this.mDeck = deck.shuffle();
    }

    public IDeck getDeck() {
        return this.mDeck;
    }

    public List<IPlayer> getPlayers() {
        return this.mPlayers;
    }
}

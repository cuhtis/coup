package com.cuhtis.coup.models.game;

import com.cuhtis.coup.models.deck.interfaces.IDeck;
import com.cuhtis.coup.models.game.interfaces.IGame;
import com.cuhtis.coup.models.player.interfaces.IPlayer;
import java.util.ArrayList;
import java.util.List;

public class BaseGame implements IGame {

    protected IDeck mDeck;
    protected List<IPlayer> mPlayers = new ArrayList<>();

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

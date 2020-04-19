package com.cuhtis.coup.models.game.interfaces;

import com.cuhtis.coup.models.deck.interfaces.IDeck;
import com.cuhtis.coup.models.player.interfaces.IPlayer;
import java.util.List;

public interface IGame {

    public IDeck getDeck();
    public List<IPlayer> getPlayers();
}

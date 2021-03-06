package de.htwg.se.dog;

import com.google.inject.AbstractModule;

import de.htwg.se.dog.controller.CardDealerInterface;
import de.htwg.se.dog.models.FigureInterface;
import de.htwg.se.dog.models.GameFieldInterface;
import de.htwg.se.dog.models.PlayerInterface;

/**
 * GoogleJuice Modules
 * 
 * @author Michael
 * 
 */
public class DogModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(FigureInterface.class).to(de.htwg.se.dog.models.impl.Figure.class);
        bind(PlayerInterface.class).to(de.htwg.se.dog.models.impl.Player.class);
        bind(CardDealerInterface.class).to(de.htwg.se.dog.controller.impl.CardDealer.class);
        bind(GameFieldInterface.class).to(de.htwg.se.dog.models.impl.GameField.class);
    }

}

package GameDev;

import Abstract.BuilderBody;
import webDev.Type;

public class GameBuilder implements BuilderBody<Game> {
    Game game;

    public GameBuilder(String name, int cost, Genre genre) {
        buildName(name);
        buildCost(cost);
        buildGenre(genre);
    }

    @Override
    public void create() {
        game = new Game();
    }

    @Override
    public Game get() {
        return game;
    }

    @Override
    public void buildName(String name) {
        game.setName(name);
    }

    @Override
    public void buildCost(int cost) {
        game.setCost(cost);
    }

    @Override
    public void buildType(Type type) {

    }

    @Override
    public void buildGenre(Genre genre) {
        game.setGenre(genre);
    }
}

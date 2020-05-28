package Abstract;


import GameDev.Game;
import GameDev.GameBuilder;
import webDev.WebBuilder;
import webDev.Website;

public class Director {
    WebBuilder webBuilder;
    GameBuilder gameBuilder;

    public void setGameBuilder(GameBuilder gameBuilder) {
        this.gameBuilder = gameBuilder;
    }

    public void setWebBuilder(WebBuilder webBuilder) {
        this.webBuilder = webBuilder;
    }

    public GameBuilder getGameBuilder() {
        return gameBuilder;
    }

    public WebBuilder getWebBuilder() {
        return webBuilder;
    }

    public Website buildWebsite() {
        webBuilder.create();
        getWebBuilder();

        return webBuilder.get();
    }

    public Game buildGame() {
        gameBuilder.create();
        getGameBuilder();

        return gameBuilder.get();
    }
}

package webDev;

import Abstract.BuilderBody;
import GameDev.Genre;

public class WebBuilder implements BuilderBody<Website> {
    Website website;

    public WebBuilder() {
    }

    public WebBuilder(String name, int cost, Type type) {
        buildName(name);
        buildCost(cost);
        buildType(type);
    }


    @Override
    public void create() {
        website = new Website();
    }

    @Override
    public Website get() {
        return website;
    }

    @Override
    public void buildName(String name) {
        website.setName(name);
    }

    @Override
    public void buildCost(int cost) {
        website.setCost(cost);
    }


    @Override
    public void buildType(Type type) {
        website.setType(type);
    }

    @Override
    public void buildGenre(Genre genre) {

    }

}

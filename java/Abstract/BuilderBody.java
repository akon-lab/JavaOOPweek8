package Abstract;

import GameDev.Genre;
import webDev.Type;

public interface BuilderBody<T> {
    void create();

    T get();

    void buildName(String name);

    void buildCost(int cost);

    void buildType(Type obj);

    void buildGenre(Genre genre);
}

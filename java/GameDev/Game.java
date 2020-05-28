package GameDev;

public class Game {
    private String name;
    private int cost;
    private Genre genre;

    public Game (){}
    public Game(String name, int cost, Genre genre) {
        this.name = name;
        this.cost = cost;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", genre=" + genre +
                '}';
    }
}

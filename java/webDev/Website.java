package webDev;

public class Website {
    private String name;
    private int cost;
    private Type type;

    //constructure
    public Website() {
    }

    public Website(String name, int cost, Type type) {
        setName(name);
        setCost(cost);
        setType(type);
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setType(Type type) {
        this.type = type;
    }

    //getter

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", type=" + type +
                '}';
    }
}

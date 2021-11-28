package by.overone.lesson27homework;

public class Equipment {
    private String name;
    private int id;

    public Equipment(){};

    public Equipment(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

}

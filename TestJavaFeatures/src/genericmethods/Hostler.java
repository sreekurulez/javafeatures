package genericmethods;

public class Hostler extends Student {


    int hostelfee;

    public Hostler(int id, String name, int hostelfee) {
        super(id, name);
        this.hostelfee = hostelfee;
    }

    @Override
    public String toString() {
        return "Hostler{" +
                "hostelfee=" + hostelfee +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

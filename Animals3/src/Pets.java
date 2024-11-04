import java.util.List;

public abstract class Pets {
    String name;
    List<String> commands;
    String type;
    Integer day;
    Integer mounth;
    Integer year;


    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getMounth() {
        return mounth;
    }

    public void setMounth(Integer mounth) {
        this.mounth = mounth;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Pets(String name, List<String> commands, String type, Integer day, Integer mounth, Integer year) {
        this.name = name;
        this.commands = commands;
        this.type = type;
        this.day = day;
        this.year = year;
        this.mounth = mounth;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "name = " + getName() +
                "; commands = " + getCommands() +
                "; type = " + getType() +
                "; birthday = " + getDay() + "." + getMounth() + "." + getYear() +
                '}';
    }
}

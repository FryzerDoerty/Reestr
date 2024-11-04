import java.util.ArrayList;
import java.util.List;

public class Horse {
    private final List<PackAnimals> arrHorse;

    public Horse() {
        this.arrHorse = new ArrayList<>();
    }

    public void addInArrHorse(PackAnimals packAnimals) {
        this.arrHorse.add(packAnimals);
    }

    public PackAnimals takehorse(Integer i) {
        return this.arrHorse.get(i);
    }

    public void addCommandInHorse(Integer id, String string) {
        this.arrHorse.get(id).addCommand(string);
    }

    public void takeCommands(Integer id) {
        System.out.println(this.arrHorse.get(id).getCommands());
    }

    public Integer countArrHorse() {
        int count = this.arrHorse.size();
        return count;
    }


}

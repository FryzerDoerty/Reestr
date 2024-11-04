import java.util.ArrayList;
import java.util.List;

public class Hamster {
    private final List<HomePets> arrHamster;

    public Hamster() {
        this.arrHamster = new ArrayList<>();
    }

    public void addInArrHamster(HomePets homePets) {
        this.arrHamster.add(homePets);
    }

    public HomePets takehamster(Integer i) {
        return this.arrHamster.get(i);
    }

    public void addCommandInHamster(Integer id, String string) {
        this.arrHamster.get(id).addCommand(string);
    }

    public void takeCommands(Integer id) {
        System.out.println(this.arrHamster.get(id).getCommands());
    }

    public Integer countArrHamster() {
        int count = this.arrHamster.size();
        return count;
    }


}

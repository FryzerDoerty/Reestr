import java.util.ArrayList;
import java.util.List;

public class Dog {
    private final List<HomePets> arrDog;

    public Dog() {
        this.arrDog = new ArrayList<>();
    }

    public Integer countArrDpg() {
        int count = this.arrDog.size();
        return count;
    }


    public void addInArrDog(HomePets homePets) {
        this.arrDog.add(homePets);
    }

    public HomePets takedog(Integer i) {
        return this.arrDog.get(i);
    }

    public void addCommandInDog(Integer id, String string) {
        this.arrDog.get(id).addCommand(string);
    }

    public void takeCommands(Integer id) {
        System.out.println(this.arrDog.get(id).getCommands());
    }


}

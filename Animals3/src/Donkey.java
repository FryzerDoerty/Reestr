import java.util.ArrayList;
import java.util.List;

public class Donkey {
    private final List<PackAnimals> arrDonkey;

    public Donkey() {
        this.arrDonkey = new ArrayList<>();
    }

    public void addInArrDonkey(PackAnimals packAnimals) {
        this.arrDonkey.add(packAnimals);
    }

    public PackAnimals takeDonkey(Integer i) {
        return this.arrDonkey.get(i);
    }

    public void addCommandInDonkey(Integer id, String string) {
        this.arrDonkey.get(id).addCommand(string);
    }

    public void takeCommands(Integer id) {
        System.out.println(this.arrDonkey.get(id).getCommands());
    }

    public Integer countArrDonkey() {
        int count = this.arrDonkey.size();
        return count;
    }


}

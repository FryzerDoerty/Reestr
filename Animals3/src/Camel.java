import java.util.ArrayList;
import java.util.List;

public class Camel {
    private final List<PackAnimals> arrCamel;

    public Integer countArrCamal() {
        int count = this.arrCamel.size();
        return count;
    }


    public Camel() {
        this.arrCamel = new ArrayList<>();
    }

    public void addInArrCamel(PackAnimals packAnimals) {
        this.arrCamel.add(packAnimals);
    }

    public PackAnimals takecamel(Integer i) {
        return this.arrCamel.get(i);
    }

    public void addCommandInCamel(Integer id, String string) {
        this.arrCamel.get(id).addCommand(string);
    }

    public void takeCommands(Integer id) {
        System.out.println(this.arrCamel.get(id).getCommands());
    }


}

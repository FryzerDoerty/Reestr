import java.util.ArrayList;
import java.util.List;

public class Cat {
    private final List<HomePets> arrCat;


    public Cat() {
        this.arrCat = new ArrayList<>();
    }

    public void addInArrCat(HomePets homePets) {
        this.arrCat.add(homePets);
    }

    public Integer countArrCat() {
        int count = this.arrCat.size();
        return count;
    }


    public HomePets takecat(Integer i) {
        return this.arrCat.get(i);
    }

    public void addCommandInCat(Integer id, String string) {
        this.arrCat.get(id).addCommand(string);
    }

    public void takeCommands(Integer id) {
        System.out.println(this.arrCat.get(id).getCommands());
    }


}

import java.util.ArrayList;
import java.util.List;

public class Reestr {
    ArrayList<Cat> reestrPets = new ArrayList<>();

    public ArrayList<Cat> getReestrPets() {
        return reestrPets;
    }

    public void setReestrPets(ArrayList<Cat> reestrPets) {
        this.reestrPets = reestrPets;
    }

    public void addINreestrCat(Cat cat) {
        this.reestrPets.add(cat);
    }

    public void sizereestrCat() {
        System.out.println(this.reestrPets.size());
    }
}

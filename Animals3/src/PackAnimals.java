import java.util.List;

public class PackAnimals extends Pets {
    String classPets;

    public PackAnimals(String name, List<String> commands, String type, Integer day, Integer mounth, Integer year) {
        super(name, commands, type, day, mounth, year);

    }

    public String getClassPets() {
        return classPets;
    }

    public void addCommand(String pet) {
        super.commands.add(pet);

    }

    public void setClassPets(String classPets) {
        this.classPets = classPets;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "name = " + super.getName() +
                "; commands = " + super.getCommands() +
                "; type = " + super.getType() +
                "; classPets = " + this.getClass().getSimpleName() +
                "; birthday = " + super.getDay() + "." + super.getMounth() + "." + super.getYear() +
                '}';
    }
}

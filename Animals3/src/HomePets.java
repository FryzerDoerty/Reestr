import java.util.List;

public class HomePets extends Pets {
    String classPets;

    public HomePets(String name, List<String> commands, String type, Integer day, Integer mounth, Integer year) {
        super(name, commands, type, day, mounth, year);

    }

    public void addCommand(String pet) {
        super.commands.add(pet);

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

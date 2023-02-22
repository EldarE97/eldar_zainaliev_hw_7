public class Main {
    public static void main(String[] args) {
        HavingSuperAbility[] havindSuperAbility = {new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i < havindSuperAbility.length; i++) {
            havindSuperAbility[i].applySuperAbility();
        }
    }
}
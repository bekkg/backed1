public class Main {
    public static void main(String[] args) {

       Predator [] predators = {
               new Volf("bek", 5),
               new Bear("bek1", 7),
               new Lion("bek3", 9)
       };
        for (int i = 0; i < predators.length; i++) {
            predators[i].hunt();
        }
    }
}
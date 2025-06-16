import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String catfish = "Anglers report an overwhelming amount of success with Garlic Chicken Liver and Cut Sardines.";
        String largeMouth = "There have been many reports on anglers catching Largemouth Bass on a Texas Rig Senko. \n Using a variety of Rods from Ultra light to Heavy for punching through thick grass\"";
        String crappie = "Local anglers have submitted many reports on any sort of small softplastic jig";
        String bluegill = "So many SLABS being caught out there using curly tailed grubs on either a dropshot or a jig, but most presentations will work. \n If you want to get your hands dirty Bluegill will SMACK any type of smaller worm, WaxWorms, NightCrawlers, or Maggots to name a few. ";
        String pickerel = "An abundance of Lunkers have been reported, caught using both artificial and live/cut bait.\nFor artificial baits, anglers are throwing Spoons, Inline Spinners, and topwater Ducks/Frogs.\nOn the contrary, anglers have been reporting success with cut or live Bluegill, Shad, Minnows, or Golden Shiners. \n Worms and chicken liver also get the job done.";
        String carp = "No need to overcomplicate it, HUGE carp have been caught on just a simple hook and bread with no weight or bobber! \nIf you do want to complicate it, guaranteed success with doughbait, homemade packbait, and hair rigs using artificial or real corn!";
        String speciesName = "";

        System.out.println("Hello Angler, Today's a good day for fishing \n What species will you be targeting?");
        Scanner scanner = new Scanner(System.in);
        String species = scanner.nextLine();

        if(species.equalsIgnoreCase("Largemouth Bass")|| species.equalsIgnoreCase("Bass")){
            species = largeMouth;
            speciesName = "Largemouth Bass";
        } else if (species.equalsIgnoreCase("Catfish")) {
            species = catfish;
            speciesName = "Catfish";
        } else if (species.equalsIgnoreCase("Crappie")) {
            species = crappie;
            speciesName = "Crappie";
        }else if(species.equalsIgnoreCase("Carp")){
            species = carp;
            speciesName = "Carp";
        }else if(species.equalsIgnoreCase("Bluegill") || species.equalsIgnoreCase("Bluegigi")){
            species = bluegill;
            speciesName = "Bluegill";
        }else if(species.equalsIgnoreCase("Chain Pickerel")|| species.equalsIgnoreCase ("Pike")){
            species = pickerel;
            speciesName = "Chain Pickerel";
        }

        System.out.println("Nice! HUGE " + speciesName +" have been reported recently. \n Would you like some tackle recommendations/tips? (Yes/No)");
        String tipAnswer = scanner.nextLine();
        if(tipAnswer.equalsIgnoreCase("Yes")){
            System.out.println(species);
        }else{
            System.out.println("No Problem. Good luck out there angler");
        }

        System.out.println("Would you like any more info on another species?");

        scanner.close();
    }
}

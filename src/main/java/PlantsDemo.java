public class PlantsDemo {
    public static void main(String[] args) {
        Plants Peony = new Plants();
        Peony.setName("Peony");
        Peony.setPrice(35.99);
        Peony.setDescription("A perfect gift for every occasion, water weekly and keep out of direct sunlight for best results.");

        Poetry SonnetXxix = new Poetry();
        SonnetXxix.setTitle("Sonnet ");
        SonnetXxix.setSonnetNumber(116);
        SonnetXxix.setSonnet("Let me not to the marriage of true minds"+"\n"+"Admit impediments.  Love is not love"+"\n"+"Which alters when it alteration finds,"+"\n"+"Or bends with the remover to remove."+"\n"+"O no!it is an ever-fixed mark"+"\n"+"That looks on tempests and is never shaken;"+"\n"+"It is the star to every wand'ring bark,"+"\n"+"Whose worth's unknown, although his height be"+"\n"+" taken."+"\n"+"Love's not Time's fool, though rose lips and"+"\n"+" cheeks"+"\n"+"Within his bending sickle's compass come;"+"\n"+"Love alters not with his brief hours and weeks,"+"\n"+"But bears it out even to the edge of doom."+"\n"+"If this be error and upon me prov'd,"+"\n"+"I never writ, nor no man ever lov'd.");


        System.out.println("\n"+"Our favourite, all round, indoor plant is the " + Peony.getName() +"." );
        System.out.println("\n"+"This summer, purchase for £" + Peony.getPrice() + " including delivery." );
        System.out.println("\n" + Peony.getDescription() + "\n" + "\n" + "We will include our Shakespeare 'Sonnet of the Month' with this purchase: " + SonnetXxix.getTitle() + SonnetXxix.getSonnetNumber() + ":" + "\n");
        System.out.println(SonnetXxix.getSonnet());
    }
    }

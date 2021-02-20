package src.core07;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Object> squad = new ArrayList<Object>();

        Soldier soldier1 = Soldier.Builder.newIstance()
                .setBadgeNumber(13245)
                .setName("John")
                .setLastName("Green")
                .setSex("Male")
                .setRank("lieutenant")
                .setBloodType("A+")
                .setTypeOfTroops("terrestrial").build();

        Soldier soldier2 = Soldier.Builder.newIstance()
                .setBadgeNumber(13248)
                .setName("Olivia")
                .setLastName("Smith")
                .setSex("Female")
                .setRank("first lieutenant")
                .setBloodType("A+")
                .setTypeOfTroops("terrestrial").build();

        squad.add(soldier1);
        squad.add(soldier2);

        for (int i=0; i < squad.size(); i++ ) {
            System.out.println(squad.get(i));
        }
    }

}


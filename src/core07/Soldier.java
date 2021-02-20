package src.core07;

import javafx.util.Builder;

public class Soldier {
    private String name;
    private String lastName;
    private String rank;
    private int badgeNumber;
    private String bloodType;
    private String typeOfTroops;
    private String sex;

    public Soldier (Builder builder){
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.rank = builder.rank;
        this.badgeNumber = builder.badgeNumber;
        this.bloodType = builder.bloodType;
        this.typeOfTroops = builder.typeOfTroops;
        this.sex = builder.sex;

    }

    @Override
    public String toString(){
        return "[Soldier: badgeNumber = " + badgeNumber + ", name =" + name + ", last name = " + lastName + ", sex = " + sex + ", rank = " + rank + ", type of troops= "+ typeOfTroops + "]";
    }

    public static class Builder {
        private String name;
        private String lastName;
        private String rank;
        private int badgeNumber;
        private String bloodType;
        private String typeOfTroops;
        private String sex;


        public static Builder newIstance(){
            return new Builder ();
        }
        public Builder setName (String name) {
            this.name = name;
            return this;
        }
        public Builder setLastName (String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder setRank (String rank) {
            this.rank = rank;
            return this;
        }
        public Builder setBadgeNumber (int badgeNumber) {
            this.badgeNumber = badgeNumber;
            return this;
        }

        public Builder setBloodType (String bloodType) {
            this.bloodType = bloodType;
            return this;
        }
        public Builder setTypeOfTroops (String typeOfTroops) {
            this.typeOfTroops = typeOfTroops;
            return this;
        }
        public Builder setSex (String sex) {
            this.sex = sex;
            return this;
        }

        public Soldier build() {
            return new Soldier(this);
        }

    }
}

package org.example.rpg;

public class RpgMain {
    public static void main(String[] args) {
        Monster trollAttack = new Troll("TrollName", 100, 10);
        Monster werewolfAttack = new Werewolf("WerewolfName", 100, 10);

        System.out.println(trollAttack.attack()); //damage:10 + getdamage*0.25=2.5 + getdamage*0.3=3 = 15.5 basar


    }
}

package org.example.rpg;

public class Werewolf extends Monster implements Bleedable{
    public Werewolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }




}

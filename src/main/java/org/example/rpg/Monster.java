package org.example.rpg;

public abstract class Monster {

    private String name;
    private int hitPoints;
    private double damage;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }


    public double attack(){
        return getDamage() + (this instanceof Bleedable ? ((Bleedable) this).bleed() : 0) +
                (this instanceof Poisonable ? ((Poisonable) this).poison() : 0) ;
};

    //NOT: instanceof Kontrolü yapmamızın sebebi, Monster sınıfının farklı alt sınıflarının
    // (Troll, Warewall, vb.) Bleedable veya Poisonable arayüzlerini
    // implement edip etmediğini anlamak. Bu ifade, Monster sınıfının instance'ı
    // Bleedable arayüzünü implement ediyorsa, gelen instance'ı Bleedable'a cast edip
    // bleed() metodunu çağırır, aksi takdirde 0 döner.

    // Poisanable arayüzünü implement ediyorsa, gelen instance'ı Poisonable'a cast edip
    // poison()'ı çağırır. Böylece, Monster sınıfına yeni bir alt sınıf eklendiğinde
    // ve bu alt sınıf ilgili arayüzleri implement ettiğinde,
    // otomatik olarak attack metodu da bu yeni özellikleri dikkate alır.
    // Bu şekilde kodun esnekliği ve genişletilebilirliği artar.

}

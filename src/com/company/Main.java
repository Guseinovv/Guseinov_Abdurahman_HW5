package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setChooseBossDefends("Physical");
        boss.setDamage(80);
        boss.setHealth(1000);

        System.out.println("Boss health: " + boss.getHealth()+ "\n" +"Boss damage: " + boss.getDamage() + "\n" + "Type of boss defence: " + boss.getChooseBossDefends());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHealth() + "," + createHeroes()[i].getDamage() + "," + createHeroes()[i].getAbility());

        }

    }
    private static Hero[] createHeroes(){
        Hero heroPhysical = new Hero(300,40,"Physical");
        Hero heroMagic = new Hero(250,45,"Magic");
        Hero heroAbdu = new Hero(310,45,"Abdu");
        Hero[] superHero = {
                heroPhysical, heroAbdu, heroMagic
        };
        return superHero;

    }
}

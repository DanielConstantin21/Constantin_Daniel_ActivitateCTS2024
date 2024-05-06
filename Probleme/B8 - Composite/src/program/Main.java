package program;

import clase.ANode;
import clase.Meniu;
import clase.Produs;
import clase.Sectiune;


public class Main {

    public static void main(String[] args) {
        Meniu restaurant = new Meniu("La Copac");
        Sectiune meniu = new Sectiune("Meniu");

        restaurant.setSectiune(meniu);

        ANode meniuBauturi = new Sectiune("Bauturi");
        ANode cafea = new Sectiune("Cafea");
        ANode c1 = new Produs("Late",12);
        ANode c2 = new Produs("Expresso", 10);
        cafea.addNode(c1);
        cafea.addNode(c2);
        meniuBauturi.addNode(cafea);

        ANode vinuri = new Sectiune("Vinuri");
        ANode v1 = new Produs("Printul Matei",240);
        ANode v2 = new Produs("Ca dei Frati", 320);
        vinuri.addNode(v1);
        vinuri.addNode(v2);
        meniuBauturi.addNode(vinuri);

        ANode startere = new Sectiune("Startere");
        ANode s1 = new Produs("Platou traditional", 40);
        ANode s2 = new Produs("Bruschete", 12);
        startere.addNode(s1);
        startere.addNode(s2);
        meniu.addNode(startere);
        meniu.addNode(meniuBauturi);

        System.out.println(meniu.getNrProduse());
        System.out.println(meniuBauturi.getNrProduse());
        System.out.println(startere.getNrProduse());

        startere.stergeNode(s2);
        System.out.println(restaurant.getSectiune().getNrProduse());


    }
}

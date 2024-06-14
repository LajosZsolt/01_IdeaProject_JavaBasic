package hu.progmatic.ChristmasFactoryHomeWork;

/**
 * Házi feladat 2.  A feladat egy  karácsonyi ajándékgyár implementálása :)
 * 1) A gyár (ChristmasFactory) különböző típusú ajándékokkal dolgozik melyeknek egy közös absztrakt őse (Present) van.
 * 2) A gyár képes kiszállítani (deliver()) ezeket az ajándékokat.
 * Kiszállítás során megszámolja összesen mekkora súlyt szállít éppen.
 * 3) Kiszállításkor különböző emberekhez jut el az ajándék akik egy közös interface-t
 * (People) implementálnak, mellyel képesek fogadni (receivePresent()) ezt.
 * A konkrét típustól függően másképpen reagálnak a kapott ajándékra,
 * pl. kid.receivePresent() {System.out.println("Nagyon örül");}
 * Minden ajándék típusra reagálhatnak ugyanúgy.
 * extra:
 * a) a People interface implementálói reagáljanak különbözőképpen a különböző típusú ajándékokra
 * b) a gyár kiszállításkor írja ki file-ba (deliver.log) kinek szállít ajándékot és ő hogyan reagált rá
 */

public abstract class Present {
    public int weight;
    public String name;

    public void kisAuto() {
    }

    public void legoKeszlet() {
    }


}
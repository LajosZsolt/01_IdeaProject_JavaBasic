package hu.progmatic;

public class FankMain {


    public static void main(String[] args) {
        Fank klasszikusFank = new Fank("kerek",10, "csokis", "liszt", "porcukor");
        Fank csorogeFank = new Fank("hosszúkás",10, "natur", "liszt", "porcukor");
        Fank kockaFank = new Fank("kocka",15, "lekváros", "liszt", "porcukor");


        System.out.println(klasszikusFank);
        System.out.println(csorogeFank);
        System.out.println(kockaFank);
    }}

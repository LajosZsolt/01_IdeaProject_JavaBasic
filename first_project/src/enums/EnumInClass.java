package enums;

public class EnumInClass {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        System.out.println(Level.MEDIUM);
        for (Level element : Level.values() ) {
            System.out.println(element);
        }
        }
    }


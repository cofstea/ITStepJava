package com.itstep.lesson._8;

public class EnumExample {

    public static void displayLvl(Level level) {
        switch (level) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }

    public static void main(String[] args) {
        displayLvl(Level.getLevelByCode(0));
        displayLvl(Level.getLevelByCode(1));
        displayLvl(Level.getLevelByCode(2));
        System.out.println(Level.getLevelByCode(3));

        // System.out.println(Level.values()[0]);
        //
        // for (int i = 0; i < Level.values().length; i++) {
        //     System.out.println(Level.values()[i]);
        // }
        //
        // for (Level level : Level.values()) {
        //     System.out.println(level);
        // }

    }

    enum Level {
        LOW(0),
        MEDIUM(1),
        HIGH(2);

        int code;

        Level(final int code) {
            this.code = code;
        }

        public static Level getLevelByCode(int searchedCode){
            for (int i = 0; i < Level.values().length; i++) {
                if (Level.values()[i].code == searchedCode){
                    return Level.values()[i];
                }
            }
            return null;
        }
    }

}

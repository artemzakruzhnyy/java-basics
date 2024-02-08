package org.example.zakruzhny.modele;

public enum Week {

    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    Week() {
        System.out.println("Constructor will be executed for each value in the enum");
    }

    public void selectDay() {
        switch (this) {
            case MONDAY -> System.out.println("Hello Monday!");
            case TUESDAY -> System.out.println("Hello Tuesday");
            case WEDNESDAY -> System.out.println("Hello Wednesday");
            case THURSDAY -> System.out.println("Hello Thursday");
            case FRIDAY -> System.out.println("Hello Friday!");
            case SATURDAY -> System.out.println("Hello Saturday!");
            case SUNDAY -> System.out.println("Hello Sunday!");
        }
    }
}

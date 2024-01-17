package org.example.zakruzhny.constant;

public class Constants {

    public final int AGE;
    public final String NAME;
    public final String STREET = "STREET_NAME";

    private int intVariable;

    {
        AGE = 18;
    }

    public Constants() {
        NAME = "Artsiom";
    }

    public void methodWithConstants(final int AGE) {
        final String NAME = "Artsiom";

        // NAME = NAME + "123"; final variable can not be changed
        // AGE++; final variable can not be changed
        // STREET = STREET + "new build"; final variable can not be changed
    }

    public void executor() {
        methodWithConstants(intVariable);
    }
}

interface GuitarBehavior {
    void play(String name);
}

class GibsonSG implements GuitarBehavior{
    public void play(String name) {
        System.out.println(name + " plays the Gibson SG.");
    }
}

class FenderTelecaster implements GuitarBehavior{
    public void play(String name) {
        System.out.println(name + " plays the Fender Telecaster.");
    }
}

class GibsonFlyingV implements GuitarBehavior{
    public void play(String name) {
        System.out.println(name + " plays the Gibson Flying V.");
    }
}
interface SoloBehavior {
    void solo(String name);
}

class GuitarOnFire implements SoloBehavior{
    public void solo(String name) {
        System.out.println(name + " sets the guitar on fire!!!");
    }
}

class SmashGuitar implements SoloBehavior {
    public void solo(String name){
        System.out.println(name + " smashes the guitar!");
    }
}

class JumpOffStage implements SoloBehavior {
    public void solo(String name){
        System.out.println(name + " jumps off the stage!");
    }
}

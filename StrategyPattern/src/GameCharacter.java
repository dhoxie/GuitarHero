

abstract class GameCharacter {
    SoloBehavior soloBehavior;
    GuitarBehavior guitarBehavior;
    String name;
    //GameCharacter(){
    //}

    void playSolo(){
        soloBehavior.solo(name);
    }

    void playGuitar(){
        guitarBehavior.play(name);
    }

    void setSoloBehavior(SoloBehavior sb){
        soloBehavior = sb;
    }

    void setGuitarBehavior(GuitarBehavior gb){
        guitarBehavior = gb;
    }

}

class GameCharacterHendrix extends GameCharacter{

    GameCharacterHendrix(SoloBehavior sb, GuitarBehavior gb) {
        name = "Jimi Hendrix";
        soloBehavior = sb;
        guitarBehavior = gb;
    }

}

class GameCharacterSlash extends GameCharacter{

    GameCharacterSlash(SoloBehavior sb, GuitarBehavior gb){
        name = "Slash";
        soloBehavior = sb;
        guitarBehavior = gb;
    }

}

class GameCharacterYoung extends GameCharacter{

    GameCharacterYoung(SoloBehavior sb, GuitarBehavior gb){
        name = "Angus Young";
        soloBehavior = sb;
        guitarBehavior = gb;
    }

}

class GuitarHero {

    public static void main(String[] args) {

        GameCharacter player1 = new GameCharacterSlash(new SmashGuitar(), new GibsonFlyingV()); //note that constructor could be designed to accept initial behaviors
        GameCharacter player2 = new GameCharacterHendrix(new JumpOffStage(), new FenderTelecaster());
        GameCharacter player3 = new GameCharacterYoung(new GuitarOnFire(), new GibsonSG());

        player1.playGuitar();
        player2.playGuitar();
        player3.playGuitar();
        player1.playSolo();
        player2.playSolo();
        player3.playSolo();

        //add code below to show the swapping of behaviors
        player1.setGuitarBehavior(new FenderTelecaster());
        player1.setSoloBehavior(new GuitarOnFire());
        player1.playGuitar();
        player1.playSolo();
    }
}

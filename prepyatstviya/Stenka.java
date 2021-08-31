package lesson1.prepyatstviya;

import lesson1.Participant;

public class Stenka extends prepyatstvie {

    private int height;

    public Stenka(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant participant) {
        participant.jump(height);
    }
}

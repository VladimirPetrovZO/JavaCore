package lesson1.prepyatstviya;

import lesson1.Participant;

public class Cross extends prepyatstvie {
    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant animal) {
        animal.run(length);
    }
}

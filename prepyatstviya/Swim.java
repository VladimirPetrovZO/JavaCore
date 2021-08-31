package lesson1.prepyatstviya;
import lesson1.Participant;
public class Swim extends prepyatstvie{
    private int length;

    public Swim(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant participant) {
        participant.swim(length);
    }
}

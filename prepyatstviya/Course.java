package lesson1.prepyatstviya;
import lesson1.Team;

public class Course {
    private prepyatstvie obstacles[];

    public Course(prepyatstvie... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (prepyatstvie obstacle : obstacles) {
            team.doIt(obstacle);
        }
    }
}
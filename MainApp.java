package lesson1;
import lesson1.animals.Cat;
import lesson1.animals.Dog;
import lesson1.prepyatstviya.*;

public class MainApp {

    public static void main(String[] args) {

        Course c = new Course(new prepyatstvie[] {
                new Cross(1),
                new Stenka(6),
                new Swim(10)
        }); // Создаем полосу препятствий

        Team team = new Team("Тест",
                new Cat("Обормот", 10, 12, 0),
                new Dog("Улыбака", 20, 5, 15),
                new Cat("Недочет", 9, 14, 0));
                  // Создаем команду
        team.getTeamInfo();

        c.doIt(team);               // Просим команду пройти полосу
        team.showResults();         // Показываем результаты

    }
}

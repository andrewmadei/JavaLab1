package Main;

import title.Game;
import title.Player;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player gamer = new Player.Builder("Andy","Madei").setId(747464).setBirthdate(LocalDate.of(2000, 12, 13)).build();
        Game game = new Game.Builder("Withcer 3").setPlayers(List.of(gamer)).setPrice(15).setReleaseYear(LocalDate.of(2015,05,18)).setDeveloper(Game.Developer.CDProjectRed).build();
    //    System.out.println(LocalDate.of(-2000, 11, 31));

    }
}
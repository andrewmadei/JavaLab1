package test;

import title.Game;
import title.Player;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.time.LocalDate;
import java.util.List;

import static org.testng.Assert.assertNotEquals;

public class MainTest {

    @Test(dataProvider = "notEqualsGameObject")
    public void carNotEquals(Game game1, Game game2) {
        assertNotEquals(game1, game2);
    }

    @DataProvider
    public Object[][] notEqualsGameObject() {
        Player gamer1 = new Player.Builder("Andy","Madei").setId(757575).setBirthdate(LocalDate.of(2000, 12, 13)).build();
        Player gamer2 = new Player.Builder("Anders","Madeus").setId(444575).setBirthdate(LocalDate.of(-2000, 12, 13)).build();
        Game game1 = new Game.Builder("Withcer 3").setPlayers(List.of(gamer1)).setPrice(15).setReleaseYear(LocalDate.of(2015,05,18)).setDeveloper(Game.Developer.CDProjectRed).build();
        Game game2 = new Game.Builder("Borderlands 3").setPlayers(List.of(gamer1)).setPrice(30).setReleaseYear(LocalDate.of(2019,9,13)).setDeveloper(Game.Developer.GearboxSoftware).build();
        Game game3 = new Game.Builder("Red Dead Redemption 2").setPlayers(List.of(gamer2)).setPrice(30).setReleaseYear(LocalDate.of(2018,10,26)).setDeveloper(Game.Developer.RockstarStudios).build();
        Game game4 = new Game.Builder("Control").setPlayers(List.of(gamer2)).setPrice(30).setReleaseYear(LocalDate.of(2019,8,27)).setDeveloper(Game.Developer.RemedyEntertainment).build();
        return new Object[][]{{game1, game2},{game3, game4}};
    }

    @Test(dataProvider = "notEqualsPlayerObject")
    public void playerNotEquals(Player gamer1, Player gamer2) {
        assertNotEquals(gamer1, gamer2);
    }

    @DataProvider
    public Object[][] notEqualsPlayerObject() {
        Player gamer1 = new Player.Builder("Andy","Madei").setId(454545).setBirthdate(LocalDate.of(2000, 12, 13)).build();
        Player gamer2 = new Player.Builder("Anders","Madeus").setId(454534345).setBirthdate(LocalDate.of(-2000, 12, 13)).build();
        Player gamer3 = new Player.Builder("Player","Gamer").setId(34343).setBirthdate(LocalDate.of(2000, 1, 1)).build();
        return new Object[][]{{gamer1, gamer2},{gamer1,gamer3},{gamer2,gamer3}};
    }

}
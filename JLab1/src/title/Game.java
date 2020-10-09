package title;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Game {
    public enum Developer {
        CDProjectRed, GearboxSoftware, RemedyEntertainment, RockstarStudios;
    }
    private String name;
    private Developer developer;
    private LocalDate releaseYear;
    private int price;
    private List<Player> players;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Developer getDeveloper() {
        return developer;
    }
    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }
    public LocalDate getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(LocalDate releaseYear) {
        this.releaseYear = releaseYear;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public List<Player> getPlayers() {
        return players;
    }
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    private Game(Game.Builder builder) {
        this.releaseYear = builder.releaseYear;
        this.developer = builder.developer;
        this.price = builder.price;
        this.name = builder.name;
    }

    public static class Builder {
        private Developer developer;
        private LocalDate releaseYear;
        private int price;
        private List<Player> players;
        private String name;

        public Builder(String name){
            this.name = name;
        }

        public Builder setDeveloper(Developer developer) {
            this.developer = developer;
            return this;
        }

        public Builder setReleaseYear(LocalDate releaseYear) {
            this.releaseYear = releaseYear;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Game build() {
            return new Game(this);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return price == game.price &&
                name.equals(game.name) &&
                developer == game.developer &&
                Objects.equals(releaseYear, game.releaseYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(developer, releaseYear, price, players);
    }

    @Override
    public String toString() {
        return "Game{" +
                "developer=" + developer +
                ", releaseYear=" + releaseYear +
                ", price=" + price +
                ", gamer=" + players +
                '}';
    }
}
package title;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

    public class Player {
    private String name;
    private String surname;
    private int id;
    private LocalDate birthdate;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }
    public LocalDate getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    private Player(Player.Builder builder){
        this.name = builder.name;
        this.surname = builder.surname;
        this.birthdate = builder.birthdate;
        this.id = builder.id;
    }

    public static class Builder{
        private String name;
        private String surname;
        private int id;
        LocalDate birthdate;

        public Builder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Player.Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Player.Builder setBirthdate(LocalDate birthdate) {
            this.birthdate = birthdate;
            return this;
        }

        public Player build() {
            return new Player(this);
        }
    }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Player player = (Player) o;
            return id == player.id &&
                    Objects.equals(name, player.name) &&
                    Objects.equals(surname, player.surname) &&
                    Objects.equals(birthdate, player.birthdate);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, surname, id, birthdate);
        }

        @Override
        public String toString() {
            return "Player{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", id=" + id +
                    ", birthdate=" + birthdate +
                    '}';
        }
    }

package lva.training;

import javax.persistence.*;

@Entity
@Table(name = "teams")

public class Teams {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer teamId;
    private String name;

    public Teams() {
    }

    @OneToMany(mappedBy ="teamId")
    private Modules modules;

    @OneToMany(mappedBy ="personId")
    private Persons persons;

    public Teams(Integer teamId, String name) {
        this.teamId = teamId;
        this.name = name;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        return "Teams{" +
                "teamId=" + teamId +
                ", name='" + name + '\'' +
                '}';
    }
}

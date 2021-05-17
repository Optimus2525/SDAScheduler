package lva.training;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "persons")

public class Persons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personId;
    private String firstName;
    private String lastName;
    private String email;
    @Column (name = "dateOfBirth")
    private Date dOB;
    private Byte isTrainer;
    private Integer teamId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "teamId")
    private Teams teams;

    @OneToMany(mappedBy ="trainerId")
    private Modules modules;

    @OneToMany(mappedBy ="studentId")
    private Attendances attendances;

    public Persons() {
    }

    public Persons(Integer personId, String firstName,
                   String lastName, String email, Date dOB,
                   Byte isTrainer, Integer teamId) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dOB = dOB;
        this.isTrainer = isTrainer;
        this.teamId = teamId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getdOB() {
        return dOB;
    }

    public void setdOB(Date dOB) {
        this.dOB = dOB;
    }

    public Byte getIsTrainer() {
        return isTrainer;
    }

    public void setIsTrainer(Byte isTrainer) {
        this.isTrainer = isTrainer;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "personId=" + personId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", dOB=" + dOB +
                ", isTrainer=" + isTrainer +
                ", teamId=" + teamId +
                '}';
    }
}

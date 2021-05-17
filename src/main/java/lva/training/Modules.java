package lva.training;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "modules")

public class Modules {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer moduleId;
    private Date startDate;
    private Date endDate;
    private Integer teamId;
    private Integer topicId;
    private Integer trainerId;
    private Integer classroomId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "teamId")
    private Teams teams;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "topicId")
    private Topics topics;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "classroomId")
    private Classrooms classrooms;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "personId")
    private Persons persons;

    @OneToMany(mappedBy ="moduleId")
    private Attendances attendances;

    public Modules() {
    }

    public Modules(Integer moduleId, Date startDate, Date endDate, Integer teamId,
                   Integer topicId, Integer trainerId, Integer classroomId,
                   Teams teams, Topics topics, Classrooms classrooms,
                   Persons persons, Attendances attendances) {
        this.moduleId = moduleId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.teamId = teamId;
        this.topicId = topicId;
        this.trainerId = trainerId;
        this.classroomId = classroomId;
        this.teams = teams;
        this.topics = topics;
        this.classrooms = classrooms;
        this.persons = persons;
        this.attendances = attendances;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public Teams getTeams() {
        return teams;
    }

    public void setTeams(Teams teams) {
        this.teams = teams;
    }

    public Topics getTopics() {
        return topics;
    }

    public void setTopics(Topics topics) {
        this.topics = topics;
    }

    public Classrooms getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(Classrooms classrooms) {
        this.classrooms = classrooms;
    }

    public Persons getPersons() {
        return persons;
    }

    public void setPersons(Persons persons) {
        this.persons = persons;
    }

    public Attendances getAttendances() {
        return attendances;
    }

    public void setAttendances(Attendances attendances) {
        this.attendances = attendances;
    }

    @Override
    public String toString() {
        return "Modules{" +
                "moduleId=" + moduleId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", teamId=" + teamId +
                ", topicId=" + topicId +
                ", trainerId=" + trainerId +
                ", classroomId=" + classroomId +
                ", teams=" + teams +
                ", topics=" + topics +
                ", classrooms=" + classrooms +
                ", persons=" + persons +
                ", attendances=" + attendances +
                '}';
    }
}

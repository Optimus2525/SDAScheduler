package lva.training;

import javax.persistence.*;

@Entity
@Table(name = "classrooms")

public class Classrooms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer classroomId;
    private String name;
    private String address;

    @OneToMany(mappedBy ="classroomId")
    private Modules modules;

    public Classrooms() {
    }

    public Classrooms(Integer classroomId, String name, String address) {
        this.classroomId = classroomId;
        this.name = name;
        this.address = address;
    }

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Classrooms{" +
                "classroomId=" + classroomId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

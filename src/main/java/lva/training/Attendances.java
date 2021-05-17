package lva.training;

import javax.persistence.*;

@Entity
@Table(name = "attendances")

public class Attendances {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer attendanceId;
    private String date;
    private Byte isPresent;
    private Integer moduleId;
    private Integer studentId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "moduleId")
    private Modules modules;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "personId")
    private Attendances attendances;

    public Attendances() {
    }

    public Attendances(Integer attendanceId, String date, Byte isPresent, Integer moduleId, Integer studentId) {
        this.attendanceId = attendanceId;
        this.date = date;
        this.isPresent = isPresent;
        this.moduleId = moduleId;
        this.studentId = studentId;
    }

    public Integer getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Byte getIsPresent() {
        return isPresent;
    }

    public void setIsPresent(Byte isPresent) {
        this.isPresent = isPresent;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Attendances{" +
                "attendanceId=" + attendanceId +
                ", date='" + date + '\'' +
                ", isPresent=" + isPresent +
                ", moduleId=" + moduleId +
                ", studentId=" + studentId +
                '}';
    }
}

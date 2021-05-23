package lva.training;

import javax.persistence.*;

@Entity
@Table(name = "topics")

// Adding some comments

public class Topics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer topicId;
    private String name;

    @OneToMany(mappedBy = "topic")
    private Modules modules;

    public Topics() {
    }

    public Topics(Integer topicId, String name) {
        this.topicId = topicId;
        this.name = name;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Topics{" +
                "topicId=" + topicId +
                ", name='" + name + '\'' +
                '}';
    }
}

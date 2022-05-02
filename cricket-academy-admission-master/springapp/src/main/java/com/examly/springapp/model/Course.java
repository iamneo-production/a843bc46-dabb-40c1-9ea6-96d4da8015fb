package com.examly.springapp.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private int academyId;
    private String name;
    private String duration;
    private String timings;
    private String description;

    public Course(long id, int academyId, String name, String duration, String timings, String description) {
        this.id = id;
        this.academyId = academyId;
        this.name = name;
        this.duration = duration;
        this.timings = timings;
        this.description = description;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAcademyId() {
        return academyId;
    }

    public void setAcademyId(int academyId) {
        this.academyId = academyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTimings() {
        return timings;
    }

    public void setTimings(String timings) {
        this.timings = timings;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + id +
                ", academyId='" + academyId + '\'' +
                ", name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", timings='" + timings + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

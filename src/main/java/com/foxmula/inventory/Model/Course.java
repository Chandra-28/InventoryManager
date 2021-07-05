package com.foxmula.inventory.Model;




import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Course{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private float price;

    @Column(nullable = false)
    private float duration;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Course_Tutor",
            joinColumns = { @JoinColumn(name = "course_id") },
            inverseJoinColumns = { @JoinColumn(name = "tutor_id") }
    )
    private Set<Tutor> tutors = new HashSet<>();

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", duration=" + duration +
                ", tutors=" + tutors +
                '}';
    }
}

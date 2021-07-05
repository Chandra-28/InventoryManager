package com.foxmula.inventory.Model;



import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class PaymentDetails{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private long id;

    @Column(nullable = false, unique = true)
    private int noOfCourse;

    @Column(nullable = false, unique = true)
    private float totalPrice;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNoOfCourse() {
        return noOfCourse;
    }

    public void setNoOfCourse(int noOfCourse) {
        this.noOfCourse = noOfCourse;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    @OneToMany
    private Set<Course> courses = new HashSet<>();


}

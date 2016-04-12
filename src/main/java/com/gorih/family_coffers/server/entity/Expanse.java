package com.gorih.family_coffers.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "coffers")
public class Expanse {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "date", nullable = false)
    private long date;

    @Column(name = "value", nullable = false)
    private float value;

    public Expanse() {

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public float getValue() {

        return value;
    }

    public long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public long getDate() {
        return date;
    }
}

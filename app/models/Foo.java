package models;

import javax.persistence.*;

@Entity
@Table(name = "Foo")
public class Foo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private Bar bar;
    private String fooName;


    public Foo() {
        System.out.println("Foo Constructor");
    }

    public Foo(Bar bar, String fooName) {
        this.bar = bar;
        this.fooName = fooName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public String getFooName() {
        return fooName;
    }

    public void setFooName(String fooName) {
        this.fooName = fooName;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "id=" + id +
                ", bar=" + bar +
                ", fooName='" + fooName + '\'' +
                '}';
    }
}

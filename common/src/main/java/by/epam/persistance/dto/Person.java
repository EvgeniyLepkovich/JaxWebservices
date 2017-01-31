package by.epam.persistance.dto;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Person")
public @Data class Person implements Serializable, Cloneable{
    @Id
    @Column(name = "personId", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long personId;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "surname", nullable = false)
    private String surname;
    @Column(name = "secondName")
    private String secondName;
    @Column(name = "birthday", nullable = false)
    private Date birthday;

    @Transient
    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
    private List<RailwayTicket> railwayTickets;

    @Override
    public String toString() {
        return "Person{" +
                "birthday=" + birthday +
                ", secondName='" + secondName + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", personId=" + personId +
                '}';
    }
}

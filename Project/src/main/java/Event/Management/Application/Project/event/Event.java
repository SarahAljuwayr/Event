package Event.Management.Application.Project.event;


import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;

@Entity
@Table(name = "Events")
public class Event {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Name")
    private String Name;

    @Getter
    @Column(name = "Capacity")
    private Integer Capacity;

    @Getter
    @Column(name = "Location")
    private String Location;

    @Getter
    @Column(name = "Date")
    private Date Date;

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setCapacity(Integer capacity) {
        Capacity = capacity;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }
}

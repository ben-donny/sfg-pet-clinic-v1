package guru.springframework.sfgpetclinicv1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "specialties")
public class Speciality extends BaseEntity{

    @Column(name = "description")
    private String description;

    public Speciality(Long id) {
        super(id);
    }

    public Speciality() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package jdbcchapter;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SystemTest {

    private String name;
    private Date lastaudit;

    public Date getLastaudit() {
        return lastaudit;
    }

    public void setLastaudit(Date lastaudit) {
        this.lastaudit = lastaudit;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

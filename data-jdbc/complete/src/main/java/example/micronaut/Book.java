package example.micronaut;

import io.micronaut.data.annotation.Id;
import javax.persistence.Entity;

@Entity
public class Book {

    @Id
    private Long id;

    private String title;

    public Book() {
    }

    public Book(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @javax.persistence.Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

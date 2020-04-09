package example.micronaut;

import io.micronaut.data.annotation.*;
import io.micronaut.data.model.*;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

@Repository
interface BookRepository extends CrudRepository<Book, Long> {
    Book find(String title);
}
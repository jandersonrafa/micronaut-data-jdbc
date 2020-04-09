package example.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import javax.inject.Inject;
import java.util.Random;

@Controller("/hello") // <1>
public class HelloController {

    @Inject
    private  BookRepository bookRepository;
    @Get // <2>
    @Produces(MediaType.TEXT_PLAIN) // <3>
    public String index() {
        return "Hello World"; // <4>
    }

    @Get("/test")
    @Produces(MediaType.TEXT_PLAIN) // <3>
    public String test() {
        Book teste = bookRepository.save(new Book(2L, "teste"));
        Book testeF = bookRepository.find("teste");
        return testeF.getTitle(); // <4>
    }
}

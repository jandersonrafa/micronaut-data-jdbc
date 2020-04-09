package example.micronaut;

import io.micronaut.runtime.Micronaut;
import javax.inject.Singleton;

import io.micronaut.core.annotation.TypeHint;

//@Singleton
//@TypeHint(typeNames = {
//        "example.domain.Pet$PetType",
//        "org.h2.Driver",
//        "org.h2.mvstore.db.MVTableEngine",
//        "org.hibernate.dialect.H2Dialect"
//})
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}
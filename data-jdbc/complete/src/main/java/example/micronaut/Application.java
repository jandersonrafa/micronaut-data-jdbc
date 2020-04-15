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
//    compile group: 'br.com.colombo.jar', name: 'ojdbc6', version: '11.2.0.4.0'

@TypeHint(typeNames = {"br.com.colombo.jar:ojdbc6:11.2.0.4.0",
"oracle.jdbc.OracleDriver"}, accessType =  TypeHint.AccessType.ALL_PUBLIC)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}
package example.micronaut;

//import io.micronaut.context.annotation.Factory;
//import io.micronaut.context.annotation.Replaces;
//
//import javax.sql.DataSource;
//
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Replaces;

import javax.sql.DataSource;

//@Factory
public class DbConfig {

    @Factory
    @Replaces(DataSource.class)
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:oracle:thin:@100.1.1.51:1521:pro1");
        config.setDriverClassName("oracle.jdbc.OracleDriver");
        config.setUsername("website");
        config.setPassword("website");
        return new HikariDataSource(config);
    }
}

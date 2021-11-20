import jdbcchapter.SystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;



@SpringBootApplication(exclude = SpringDataWebAutoConfiguration.class)
@EnableJpaRepositories("jdbcchapter")
@EntityScan("jdbcchapter")

public class MysqlJdbcDriverApplication implements CommandLineRunner {

    @Autowired
    DataSource dataSource;

    @Autowired
    SystemRepository systemRepository;

    public static void main(String[] args) {
        SpringApplication.run(MysqlJdbcDriverApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Our DataSource is = " + dataSource);
        Iterable<jdbcchapter.SystemTest> systemlist = systemRepository.findAll();
        for (jdbcchapter.SystemTest systemmodel : systemlist) {
            System.out.println("Here is a system out put Gorakh: " + systemmodel.toString());
        }


    }
}

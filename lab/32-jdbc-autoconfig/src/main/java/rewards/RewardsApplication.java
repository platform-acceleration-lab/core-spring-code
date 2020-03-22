package rewards;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

// TODO-01 : Open pom.xml or build.gradle, look for TO-DO-01

// TODO-02 : In pom.xml or build.gradle, look for TO-DO-02

// TODO-03 : Turn this 'RewardsApplication' into a Spring Boot application
// - Add an appropriate annotation to this class

// --------------------------------------------

// TODO-11 : Disable 'DataSource' auto-configuration
// - Use 'exclude' attribute of '@SpringBootApplication'
//   excluding 'DataSourceAutoConfiguration' class
// - Import 'RewardsConfig' class. (Think about why.)

// TODO-12 : Look in application.properties for the next step.

// TODO-13 (Optional) : Follow the instruction in the lab document.
//           The section titled "Build and Run using Command Line tools".

public class RewardsApplication {
    static final String SQL = "SELECT count(*) FROM T_ACCOUNT";

    final Logger logger
            = LoggerFactory.getLogger(RewardsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RewardsApplication.class, args);
    }

    // TODO-05 : Let Spring Boot execute database scripts
    // - Move the SQL scripts (schema.sql and data.sql)
    //   from `src/test/resources/rewards/testdb` directory
    //   to `src/main/resources/` directory

    // TODO-06 : Implement a command line runner that will query count from
    //           T_ACCOUNT table and log the count to the console
    // - Use the SQL query and logger provided above.
    // - Use the JdbcTemplate bean that Spring Boot auto-configured for you
    // - Run this application and verify "Hello, there are 21 accounts" log message
    //   gets displayed in the console

    // TODO-07 : Capture properties into a class using @ConfigurationProperties
    // - Note that application.properties file already contains the following properties
    //
    //    rewards.recipient.name=John Doe
    //    rewards.recipient.age=10
    //    rewards.recipient.gender=Male
    //    rewards.recipient.hobby=Tennis
    //
    // - Create a class called RewardsRecipientProperties in the same directory
    //   of this class
    // - Annotate RewardsRecipientProperties class with @ConfigurationProperties
    //   with prefix attribute set to a proper value
    // - Create fields (along with needed getters/setters) that reflect the
    //   properties above in the RewardsRecipientProperties class
    // - Use one of the following 3 schemes to enable @ConfigurationProperties
    //   (1) Annotate the RewardsRecipientProperties class with @Component or
    //   (2) Add @EnableConfigurationProperties({RewardsRecipientProperties.class})
    //       to this class or
    //   (3) Add @ConfigurationPropertiesScan to this class
    // - Implement a command line runner that displays the name of the rewards
    //   recipient

    // TODO-08 : Enable full debugging in order to observe how Spring Boot
    //           performs its auto-configuration logic
    // - Follow TO-DO-08 in application.properties, then come back here.
    // - Run the application
    // - In the console output, find "CONDITIONS EVALUATION REPORT".
    // - Note that "DataSourceAutoConfiguration" is mentioned in both
    //   positive match and negative match - each match represents a single
    //   conditional statement

}

# Spring Boot Proof-of-Concept
Application to use the latest but stable Spring ecosystem tools. Project based on  `spring-boot-starter-parent v 1.5.10.RELEASE`

* Spring JPA - `spring-boot-starter-data-jpa`
* Spring REST- `spring-boot-starter-web`
* Maven
* JUnit

# Spring 

### Persistence `application.properties` 

The database schema is auto-generated based on `spring-boot` auto-config (enables with `@EnableAutoConfiguration` or `SpringBootApplication`). This can be configured with `spring.jpa.generate-ddl` form `application.properties`, as well as `spring.datasource.platform` that determines the type of database used later in `data-{platform}.sql` file naming convention. To use custom schema generation uncomment the `spring.datasource.schema` line. 

# Default database
Default storege is the H2 persistent database. To use in-memory h2 simply comment the h2 lines, as the spring-boot will by default use in-memmory h2 database.

#### Other database
To use any other databse simply add the dependency into `pom.xml` file and modify the settings in `application.properties`. One might also want to use different SQL dialect. Thus, create new directory in `resources/db/{your_db_name}` and mimic the h2 directory structure.

# Domain

## Hotel Online Booking system.
The system is used by hotel owners and customers. Customers can book the room. Hotel owners can define which rooms are available. Operations available in the system

1. Register a customer.
2. User searches for available hotel rooms. Search criteria include:
    a. period
    b. city
    c. daily price range
3. User asks for room reservation for specific period.
4. User can check their reservations.
5. User can cancel his reservation.

Hotel and its room configuration should be pre-configured, there is no need to expose any endpoint to add/change/remove hotel nor room in hotel. There are no other business requirements than the ones described above.

### Technical details

* Use Java 8
* The system expose REST endpoints for all operations described above.
* Project includes acceptance test to show how the endpoints work (the test communicate with working system through HTTP calls).
* All communication is synchronous.
* Unit tests only where it makes sense.
* Authentication and authorization.# Spring-Boot-POC

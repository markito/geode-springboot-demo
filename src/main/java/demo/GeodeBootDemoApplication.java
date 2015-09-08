package demo;

import com.gemstone.gemfire.internal.cache.tier.Command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.gemfire.CacheFactoryBean;
import org.springframework.data.gemfire.mapping.Region;
import org.springframework.data.gemfire.repository.GemfireRepository;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;
import org.springframework.stereotype.Repository;

import sun.tools.jar.CommandLine;

import java.util.List;
import java.util.logging.Logger;

import javax.annotation.Resource;

@Configuration
@EnableGemfireRepositories
public class GeodeBootDemoApplication implements CommandLineRunner  {


  private static final Logger logger = Logger.getAnonymousLogger();

//  @Bean CacheFactoryBean cacheFactoryBean() {
//    return new CacheFactoryBean();
//  }

  public static void main(String[] args) {
        SpringApplication.run(GeodeBootDemoApplication.class, args);
    }

  @Autowired
  PersonRepository repository;

//  @Bean
//  CommandLineRunner init(PersonRepository repository) {
//    return args -> {
//      Person p = new Person("William", "Markito");
//
//      System.out.println(p);
////      repository.save(p);
////
//      repository.findAll().forEach(System.out::println);
//    };
//  }

  public void run(String... args) {

    Person p = new Person("William", "Markito");

    System.out.println(p);

    repository.findAll().forEach(System.out::println);
  }
}



@Region("People")
class Person {

  @Id
  Long id;
  String firstname;
  String lastname;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  @PersistenceConstructor
  public Person(String firstname, String lastname) {
    this.firstname=firstname;
    this.lastname=lastname;
  }

  @Override
  public String toString() {
    return "Person{" +
            "id=" + id +
            ", firstname='" + firstname + '\'' +
            ", lastname='" + lastname + '\'' +
            '}';
  }
}

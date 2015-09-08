package demo;

import org.springframework.data.gemfire.repository.GemfireRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wmarkito on 9/4/15.
 */
@Repository
public interface PersonRepository extends CrudRepository<Person, Long> { }


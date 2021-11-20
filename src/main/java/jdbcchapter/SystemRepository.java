package jdbcchapter;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SystemRepository extends CrudRepository<SystemTest,Long> {


}

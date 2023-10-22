package one.digitalinnovaton.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtaquesRepository extends CrudRepository <Ataques, Long>{
    
}

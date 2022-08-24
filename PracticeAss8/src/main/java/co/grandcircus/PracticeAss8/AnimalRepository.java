package co.grandcircus.PracticeAss8;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Update;

public interface AnimalRepository extends MongoRepository<Animal, String> {
	List<Animal> findAll();
	Optional<Animal> findById(String id);
	Animal save(Animal entity);
	void deleteAll();
	@Update("{ '$push' : { 'traits' : ?1 } }")
	void findAndPushTraitById(String id, String trait);
	@Query("{ '_id' : ?0 }")
	@Update("{ '$set' : { 'traits' : [] } }")
	void findAndDeleteTraitsById(String id);
	
}

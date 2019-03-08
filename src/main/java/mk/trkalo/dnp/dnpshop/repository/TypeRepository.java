package mk.trkalo.dnp.dnpshop.repository;

import mk.trkalo.dnp.dnpshop.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends JpaRepository<Type, Integer> {
    boolean existsByName(String name);
}

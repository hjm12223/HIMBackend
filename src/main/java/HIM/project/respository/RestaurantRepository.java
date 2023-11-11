package HIM.project.respository;


import HIM.project.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,String> {
    Boolean findAllByCrNumber(String crNumber);
}
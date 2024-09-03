package rocktsean.com.passin.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import rocktsean.com.passin.domain.Events.*;

public interface EventsRepository extends JpaRepository <Event, String> {
    

}

package rocketseat.com.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.com.passin.domain.checkin.Checkin;

public interface CheckinReposity extends JpaRepository<Checkin, Integer> {
}

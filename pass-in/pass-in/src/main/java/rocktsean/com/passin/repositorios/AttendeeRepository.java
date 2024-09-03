package rocktsean.com.passin.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import rocktsean.com.passin.domain.Attendee.Attentee;

public interface AttendeeRepository extends JpaRepository <Attentee, String> {

}

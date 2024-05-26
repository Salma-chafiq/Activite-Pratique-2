package ma.enset.studentsapp.repository;

import ma.enset.studentsapp.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}

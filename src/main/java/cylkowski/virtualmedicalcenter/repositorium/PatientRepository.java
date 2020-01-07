package cylkowski.virtualmedicalcenter.repositorium;

import cylkowski.virtualmedicalcenter.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    @Query("select p from Patient p where p.pesel =?1")
    Patient getPatientByPesel(long pesel);

}

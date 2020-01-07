package cylkowski.virtualmedicalcenter.repositorium;

import cylkowski.virtualmedicalcenter.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    @Query("SELECT d from Doctor d where d.name = ?1")
    Doctor getDoctorByName(String name);

}

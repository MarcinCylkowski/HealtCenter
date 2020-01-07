package cylkowski.virtualmedicalcenter.service;


import cylkowski.virtualmedicalcenter.model.Patient;
import cylkowski.virtualmedicalcenter.repositorium.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PatientService {

    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient addPatient (Patient patient){
        return patientRepository.save(patient);
    }

    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }

    public Optional<Patient> getPatientById(Long id){
        return patientRepository.findById(id);
    }

    public void deletePatient(Long id){
        patientRepository.deleteById(id);
    }

    public Patient updatePatient(Patient patient, Long id){
       return patientRepository.save(patient);
    }

    public Patient getPatientByPesel(Long pesel){
        return patientRepository.getPatientByPesel(pesel);
    }

}




package cylkowski.virtualmedicalcenter.controller;


import cylkowski.virtualmedicalcenter.model.Patient;
import cylkowski.virtualmedicalcenter.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("api/patients")
    public List<Patient> getPatients(){
        return patientService.getPatients();
    }

    @GetMapping("api/patient/{id}")
    public Optional<Patient> getPatientById(@PathVariable long id){
        return patientService.getPatientById(id);
    }

    @GetMapping("api/patient/{pesel}")
    public Patient getPatientByPesel(@PathVariable long pesel){
        return patientService.getPatientByPesel(pesel);
    }

    @PostMapping("api/patient/add")
    public Patient addPatient (@RequestBody Patient patient){
        return patientService.addPatient(patient);
    }

    @PutMapping("api/patient/{id}")
    public Patient updatePatient(@RequestBody Patient patient,@PathVariable Long id){
        return patientService.addPatient(patient);
    }

    @DeleteMapping("api/patient/{id}")
    public void deletePatient(@PathVariable Long id){
        patientService.deletePatient(id);
    }












}

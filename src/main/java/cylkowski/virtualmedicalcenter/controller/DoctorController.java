package cylkowski.virtualmedicalcenter.controller;


import cylkowski.virtualmedicalcenter.model.Doctor;
import cylkowski.virtualmedicalcenter.service.DoctorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {

    private DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }


    @GetMapping("api/doctors")
    public List<Doctor> getDoctor() {
        return doctorService.getDoctors();
    }

    @GetMapping("api/doctor/{name}")
    public Doctor getDoctorByName(@PathVariable String name) {
        return doctorService.getDoctorByName(name);
    }

    @PostMapping("api/doctor/add")
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        return doctorService.addDoctor(doctor);
    }

    @PutMapping("api/doctor/{id}")
    public Doctor updateDoctor(@RequestBody Doctor doctor, @PathVariable long id) {
        return doctorService.updateDoctor(doctor, id);
    }


    @DeleteMapping("api/doctor/{id}")
    public void deleteDoctor(@PathVariable long id) {
        doctorService.deleteDoctor(id);
    }


}

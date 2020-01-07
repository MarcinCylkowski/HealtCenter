package cylkowski.virtualmedicalcenter.service;


import cylkowski.virtualmedicalcenter.model.Doctor;
import cylkowski.virtualmedicalcenter.repositorium.DoctorRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class DoctorService {

    private DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public List<Doctor> getDoctors() {
        return doctorRepository.findAll();
    }

    public Doctor getDoctorByName(String name) {
        return doctorRepository.getDoctorByName(name);
    }


    public void deleteDoctor(long id) {
        doctorRepository.deleteById(id);
    }

    public Doctor updateDoctor(Doctor doctor, long id) {
        return doctorRepository.save(doctor);
    }


}

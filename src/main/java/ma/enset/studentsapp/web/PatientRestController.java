package ma.enset.studentsapp.web;

import ma.enset.studentsapp.entities.Patient;
import ma.enset.studentsapp.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientRestController {
    @Autowired
    private PatientRepository patientRepository;
    // relation bdirectionnelle => problem dépendant cyclique
    @GetMapping("/patients")
    public List<Patient> patients(){
        return patientRepository.findAll();
    }

}

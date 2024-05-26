package ma.enset.studentsapp.service;

import ma.enset.studentsapp.entities.Consultation;
import ma.enset.studentsapp.entities.Medecin;
import ma.enset.studentsapp.entities.Patient;
import ma.enset.studentsapp.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}

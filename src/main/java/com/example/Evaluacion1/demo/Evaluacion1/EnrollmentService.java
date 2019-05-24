package com.example.Evaluacion1.demo.Evaluacion1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnrollmentService {

 private TrainingStorageService trainingStorageService;

    private static final Logger LOG= LoggerFactory.getLogger(EnrollmentService.class);

    public void guardarInscripcion(float amount){
        LOG.debug("se guardo con: "+ amount);

        String convertedText= String.valueOf(amount);
        trainingStorageService.save(convertedText);

        LOG.debug("Inscripcion guardada ");
    }
    public float mostrarInscritos(){
        LOG.debug("Inscritos ");

        String storeText =trainingStorageService.Load();
        LOG.trace("inscripcion guardada como: "+ storeText);

        if(storeText.equals("")){
            return 0;

        }
        return Float.valueOf(storeText);

    }


}

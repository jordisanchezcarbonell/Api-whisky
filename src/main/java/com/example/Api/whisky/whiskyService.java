package com.example.Api.whisky;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class whiskyService {

    @Autowired
    private whiskyRepository whiskyRepository;

    //CREATE one
    public whisky createWhisky(whisky whisky){

        return  whiskyRepository.save(whisky);

    }
    //ARRAY para crear
    public List<whisky> createListwhisky(List<whisky> whisky){

        return  whiskyRepository.saveAll(whisky);

    }

    public List<whisky> getWhiskyList() {
        return whiskyRepository.findAll();
    }

    public whisky getWhiskyById(int id) {
        return whiskyRepository.findById(id).orElse(null);
    }

    public whisky updateWhiskyById(whisky whisky) {
        Optional<whisky> userFound = whiskyRepository.findById(whisky.getId());

        if (userFound.isPresent()) {
            whisky whiskyUpdate = userFound.get();
            whiskyUpdate.setWhisky(whisky.getWhisky());
            whiskyUpdate.setClassWhisky(whisky.getClassWhisky());
            whiskyUpdate.setSTDEV(whisky.getSTDEV());
            whiskyUpdate.setCluster(whisky.getCluster());
            whiskyUpdate.setCountry(whisky.getCountry());
            whiskyUpdate.setMetacritic(whisky.getMetacritic());
            whiskyUpdate.setSuperCluster(whisky.getSuperCluster());
            whiskyUpdate.setType(whisky.getType());
            whiskyUpdate.setHastac(whisky.getHastac());

            return whiskyRepository.save(whisky);
        } else {
            return null;
        }
    }

    public String deleteWhiskyById(int id) {
        whiskyRepository.deleteById(id);
        return "User "+ id +" deleted";
    }


    //UPDATE
}

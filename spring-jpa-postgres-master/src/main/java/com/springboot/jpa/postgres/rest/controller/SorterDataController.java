package com.springboot.jpa.postgres.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.postgres.rest.model.SorterData;
import com.springboot.jpa.postgres.rest.service.RetriveSorterData;

@CrossOrigin
@RestController
public class SorterDataController {

    @Autowired
    private RetriveSorterData retriveSorterData;
    
    //@GetMapping("/sorterdata/{userid}/{sorterid}")
    @RequestMapping(value = {"/sorterdata/{userid}", "/sorterdata/{userid}/{sorterid}"}, method = RequestMethod.GET)
    public List<SorterData> getSorterDataByUserId(@PathVariable String userid,@PathVariable Optional<String> sorterid) throws Exception {
    	
    	if(sorterid.isPresent()) {
			return retriveSorterData.getSorterDataByUserIdAndSorterId(userid,sorterid.get());
		}else {
			return retriveSorterData.getSorterData(userid);
		}    	
    }
}

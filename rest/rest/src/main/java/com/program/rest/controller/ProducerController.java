package com.program.rest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProducerController {
    @RequestMapping(value = "/std", method = RequestMethod.GET)
    public String getRest() {
        return "created";
    }
    @PostMapping(path = "/std1")
            public String createRest(){
        return "jashu";
        }
        @PutMapping(path = "/rest1")
    public String updateRest(){
        return "updated";
        }
        @DeleteMapping(path = "/rest")
       public String deleteRest(){
        return "deleted";
        }
}

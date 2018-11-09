package com.money.controller.api;

import com.money.service.UserService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by a.mahdavi on 10/31/2018.
 */
@RestController
@RequestMapping("/api")
public class MonyMAPController {
    private Logger logger= org.slf4j.LoggerFactory.getLogger(MonyMAPController.class);



    @Autowired
    UserService userService;

   /* @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public <T> ResponseEntity<T> getList(@RequestParam("type") int type) {
        logger.debug("Provider has received request to get person with id: " + type);
        try{
            ArrayList<ListOfItems> list= monyMapService.getListTitle(type);
            return new ResponseEntity<T>((T) list,HttpStatus.OK);
        }
        catch (Exception exp)
        {
            logger.error(exp.toString());
            return new ResponseEntity<T>((T) exp.getMessage(),HttpStatus.NOT_FOUND);
        }

    }*/

//    @RequestMapping(value = "/user",method = RequestMethod.GET)
//    @ResponseStatus(HttpStatus.OK)
//    public <T> ResponseEntity<T> getPerson() {
//
//        try{
//
//            return new ResponseEntity<T>((T) userService.listPerson(),HttpStatus.OK);
//        }
//        catch (Exception exp)
//        {
//            logger.error(exp.toString());
//            return new ResponseEntity<T>((T) exp.getMessage(),HttpStatus.NOT_FOUND);
//        }
//
//    }
}

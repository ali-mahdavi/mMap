package com.money.controller.api;

import com.money.entity.Person;
import com.money.service.UserService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MoneyAccountController {
    private Logger logger= org.slf4j.LoggerFactory.getLogger(MoneyAccountController.class);
    private static final String TAG = MoneyAccountController.class.getSimpleName();
    @Autowired
    UserService userService;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public <T> ResponseEntity<T> getUsers() {

        try{

            return new ResponseEntity<T>((T) userService.listPerson(),HttpStatus.OK);
        }
        catch (Exception exp)
        {
            logger.error(TAG,exp.toString());
            return new ResponseEntity<T>((T) exp.getMessage(),HttpStatus.NOT_FOUND);
        }

    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public <T> ResponseEntity<T> addUser(@ModelAttribute("person")Person person) {

        try{

            return new ResponseEntity<T>((T) userService.listPerson(),HttpStatus.OK);
        }
        catch (Exception exp)
        {
            logger.error(TAG,exp.toString());
            return new ResponseEntity<T>((T) exp.getMessage(),HttpStatus.NOT_FOUND);
        }

    }

}

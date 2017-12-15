package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public ResponseObject<Void> signup(@RequestParam String userName, @RequestParam String password)
    {
        // Code Here
        return null;
    }

}

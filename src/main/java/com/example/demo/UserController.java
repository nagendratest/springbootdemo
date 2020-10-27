package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author nagendra
 */
@RestController
@RequestMapping("users")
public class UserController {
    @GetMapping("/status/check")
    public String status() {
        return "checking working";
    }

}
package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{number1}/and/{number}")
    @ResponseBody
    public Double add(@PathVariable Double number1, @PathVariable Double number) {
        return  number1 + number;
    }
    @GetMapping("/subtract/{number}/from/{number1}")
    @ResponseBody
    public Double subtract(@PathVariable Double number1, @PathVariable Double number) {
        return  number1 - number;
    }
    @GetMapping("/multiply/{number1}/and/{number}")
    @ResponseBody
    public Double multiply(@PathVariable Double number1, @PathVariable Double number) {
        return  number1 * number;
    }
    @GetMapping("/divide/{number1}/by/{number}")
    @ResponseBody
    public Double divide(@PathVariable Double number1, @PathVariable Double number) {
        return  number1 / number;

    }

}

//
//package com.codeup.blog.controllers;
//
//        import org.springframework.stereotype.Controller;
//        import org.springframework.web.bind.annotation.GetMapping;
//        import org.springframework.web.bind.annotation.PathVariable;
//        import org.springframework.web.bind.annotation.ResponseBody;
//
//// 1.
//@Controller
//public class MathController {
//    @ResponseBody
//    @GetMapping("/add/{number1}/and/{number2}") // Add path variables to url pattern
//    // Annotate the arguments on the method
//    public Double add (@PathVariable Double number1, @PathVariable Double number2) {
//        return number1 + number2;
//    }
//
//    @ResponseBody
//    @GetMapping("/subtract/{number2}/from/{number1}")
//    public Double subtract(@PathVariable Double number1, @PathVariable Double number2) {
//        return number1 - number2;
//    }
//
//    @ResponseBody
//    @GetMapping("/multiply/{number1}/and/{number2}")
//    public Double multiply(@PathVariable Double number1, @PathVariable Double number2) {
//        return number1 * number2;
//    }
//
//    @ResponseBody
//    @GetMapping("/divide/{number1}/by/{number2}")
//    public Double divide(@PathVariable Double number1, @PathVariable Double number2 ) {
//        return number1 / number2;
//    }
//}

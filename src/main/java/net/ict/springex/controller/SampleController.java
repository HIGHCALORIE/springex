package net.ict.springex.controller;

import lombok.extern.log4j.Log4j2;
import net.ict.springex.dto.TodoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;

@Controller
@Log4j2
public class SampleController {

    @GetMapping("/hello")
    public void hello(){
        log.info("helloooooo");
    }


    @GetMapping("/ex1")
    public void ex1(String name, int age){
        log.info("ex11111111111111");
        log.info("name: "+name);
        log.info("age: "+age);
    }


    @GetMapping("/ex2")
    public void ex2(@RequestParam(name="name", defaultValue = "aaa")String name, @RequestParam(name = "age", defaultValue = "20")int age){
        log.info("ex22222222222");
        log.info("name: "+name);
        log.info("age: "+age);
    }
    @GetMapping("/ex3")
    public void ex3(LocalDate dueDate){
        log.info("ex333333333");
        log.info("duedate : "+dueDate);
    }

    @GetMapping("/ex4")
    public void ex4(Model model){
        log.info("MODEL ex44444444");
        model.addAttribute("message", "HELLO SPRINGMVC!");

    }

    @GetMapping("/ex5")
    public void ex5(TodoDTO todoDTO, Model model){
        log.info("MODEL todoDTO ex55555555");
        log.info(todoDTO);

    }

    @GetMapping("/ex6")
    public String ex6(RedirectAttributes redirectAttributes){
        redirectAttributes.addAttribute("name", "ABC");
        redirectAttributes.addFlashAttribute("result", "success");
        return "redirect:/ex7";

    }

    @GetMapping("/ex7")
    public void ex7(){}

    @GetMapping("/ex8")
    public void ex8(String p1, int p2){
        log.info("P1 : " +p1);
        log.info("P2 : "+p2);

    }



}

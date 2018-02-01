package com.bisrataman.demo.resumedemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller

public class ResumeController {
    @Autowired
    ResumeRepository resumerepository;

    @RequestMapping("/")
    public String resumeList(Model model){
        model.addAttribute("rlist",new Resume());

        return "resumelist";
    }
    @PostMapping("/process")
    public String processForm(@Valid @ModelAttribute("singleAddress") Resume resume, BindingResult result) {
        if (result.hasErrors()) {
            return "resumeform";
        }
        resumerepository.save(resume);

        return "redirect:/";
    }

    @RequestMapping("/detail/{id}")
    public String showResume(@PathVariable("id") long id, Model model) {
        model.addAttribute("resumelist", resumerepository.findOne(id));
        return "show";
    }

    @RequestMapping("/update/{id}")
    public String resumeUpdate(@PathVariable("id") long id, Model model) {
        model.addAttribute("singleAddress", resumerepository.findOne(id));
        return "resumeform";
    }




}

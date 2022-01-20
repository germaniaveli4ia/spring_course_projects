package com.zaurtregulov.spring.mvc;

import com.zaurtregulov.spring.mvc.entity.EmployeeClass;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class MyController {
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){
        model.addAttribute("employeeVar", new EmployeeClass());
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    //EmployeeClass emp - это тот объект, который заполнялся на странице askDetails, а
    //@ModelAttribute("employeeVar") всего лишь дает ему название, так что внутренности его от смены
    //названия не меняются. В showDetails он назывался employeeVar
    public String showEmpDetails(@Valid @ModelAttribute("employeeVar") EmployeeClass emp,
                                 BindingResult bindingResult){
        if (bindingResult.hasErrors())
            return "ask-emp-details-view";
        return "show-emp-details-view";
    }
}

package com.SpringREST.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringREST.Model.BootModel;
import com.SpringREST.Service.BootService;

@Controller
@RequestMapping("/web/boots")
public class BootController {

    @Autowired
    private BootService bootService;

    @PostMapping("/add")
    public String submitBootForm(
        @RequestParam String name,
        @RequestParam String type,
        @RequestParam String size) {
        
        BootModel boot = new BootModel();
        boot.setName(name);
        boot.setType(type);
        boot.setSize(size);

        bootService.saveBoot(boot);
        return "redirect:/web/boots/manageBoot";
    }

    @GetMapping("/manageBoot")
    public String getAllBoots(Model model) {
        List<BootModel> boots = bootService.getAllBoots();
        model.addAttribute("boots", boots);
        return "manageBoot";
    }

    @GetMapping("/addBoot")
    public String showAddBootForm(Model model) {
        model.addAttribute("boot", new BootModel());
        List<BootModel> boots = bootService.getAllBoots();
        model.addAttribute("boots", boots);
        return "addBoot";
    }
}

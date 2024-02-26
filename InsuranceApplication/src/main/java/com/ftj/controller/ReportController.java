package com.ftj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ftj.entity.CitizenPlan;
import com.ftj.request.SearchRequest;
import com.ftj.service.ReportService;
import com.ftj.service.ReportServiceImpl;

@Controller
public class ReportController {

    @Autowired
    private ReportService reportService;

    @PostMapping("/search")
    public String handleSearch(SearchRequest request, Model model) {
        System.out.println("Response : ====  "+request+" =====");
        
        List<CitizenPlan> plans=reportService.search(request);
        model.addAttribute("plans", plans);
        
        populateModelAttributes(model);
        return "index";
    }

    @GetMapping("/")
    public String indexPage(Model model) {
        
        populateModelAttributes(model);
        return "index";
    }

    private void populateModelAttributes(Model model) {
        model.addAttribute("names", reportService.getPlanNames());
        model.addAttribute("status", reportService.getPlanStatuses());
        model.addAttribute("search", new SearchRequest());
    }
}

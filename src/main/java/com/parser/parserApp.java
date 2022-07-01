package com.parser;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
@RestController

public class parserApp {
    @RequestMapping(value = "")
    public ModelAndView  appControl(Model m) throws Exception {

        String table_of_feed = parser.getNews();
        m.addAttribute("tableOfFeed",table_of_feed);
        ModelAndView appView = new ModelAndView();
        // the app page
        appView.setViewName("parser");
        return appView;
    }
}

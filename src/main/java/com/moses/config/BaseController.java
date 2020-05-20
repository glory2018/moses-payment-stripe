package com.moses.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Moses
 */
public class BaseController {
    protected Logger logger = LoggerFactory.getLogger(BaseController.class);

    protected ModelAndView setView(ModelAndView modelAndView, String title, String view) {
        modelAndView.addObject("title", title);
        modelAndView.setViewName(view);
        return modelAndView;
    }
}

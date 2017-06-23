package jp.co.kenshu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.kenshu.dto.test.TestDto;
import jp.co.kenshu.service.TestService;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test/{id}", method = RequestMethod.GET)
    public String test(Model model, @PathVariable int id) {
        TestDto test = testService.getTest(id);
        model.addAttribute("message", "MyBatisのサンプルです");
        model.addAttribute("test", test);
        return "test";
    }
}
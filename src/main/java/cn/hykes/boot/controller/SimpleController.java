package cn.hykes.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @RestController注解作用：为该controller类下的所有方法添加@ResponseBody注解
 */
//@RestController
@Controller
@RequestMapping
public class SimpleController {

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public Map<String,Object> index(HttpServletRequest request, HttpServletResponse response) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("message","hello");
        return map;
    }

}
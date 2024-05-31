package com.imooc.reader.controller.management;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.imooc.reader.entity.Book;
import com.imooc.reader.entity.Evaluation;
import com.imooc.reader.service.BookService;
import com.imooc.reader.service.EvaluationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/management/evaluation")
public class MEvaluationController {
    @Resource
    private EvaluationService evaluationService;
    @Resource
    private BookService bookService;
    @GetMapping("/index.html")
    public ModelAndView showBook() {
        return new ModelAndView("/management/evaluation");
    }

    @GetMapping("/list")
    @ResponseBody
    public Map list(Integer page, Integer limit) {
        if(page == null) {
            page = 1;
        }
        if(limit == null) {
            limit = 20;
        }

        IPage<Evaluation> pageObject = evaluationService.paging(page, limit);
        Map result = new HashMap();
        result.put("code", "0");
        result.put("msg", "success");
        result.put("data", pageObject.getRecords());
        result.put("count", pageObject.getTotal());
        return result;
    }
}

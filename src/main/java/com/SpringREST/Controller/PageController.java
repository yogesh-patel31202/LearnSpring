package com.SpringREST.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpringREST.Model.BookModel;
import com.SpringREST.Service.BookService;

@Controller
@RequestMapping("/page")
public class PageController {

    @Autowired
    private BookService bookService;

    @GetMapping("/manageBook")
    public String getAllBoots(Model model) {
        List<BookModel> books = bookService.getAllBooks();
        model.addAttribute("boots", books);
        return "manageBook";
    }
}

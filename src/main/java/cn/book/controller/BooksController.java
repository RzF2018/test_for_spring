package cn.book.controller;

import cn.book.pojo.Bookadmin;
import cn.book.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 书籍管理
 */
@Controller
public class BooksController {

    @Autowired
    private BooksService booksService;

    /*@RequestMapping("/books/{bid}")
    @ResponseBody
    public Bookadmin getBookById(@PathVariable  int bid){
//        System.out.println(bid);
        Bookadmin bookadmin = booksService.getBookById(bid);
        return bookadmin;
    }*/

    /**
     * 使用ModelAndView类处理商品列表查询
     * @return mav
     */
    @RequestMapping("/books/listBooks")
    @ResponseBody
    /*public String listBooks(Model model){
        List<Bookadmin> bookList = booksService.getBookList();
        System.out.println(bookList.toString());
        model.addAttribute("bookList",bookList);
        return "listBooks";
    }*/
    public ModelAndView listBooks(){
        ModelAndView mav = new ModelAndView();
        List<Bookadmin> bookList = booksService.getBookList();
        mav.addObject("bookList",bookList);
        mav.setViewName("listBooks");
        return mav;
    }

    /**
     * 新增商品
     * @param bookadmin
     * @return
     */
    @RequestMapping(value = "/books/addBook", method = RequestMethod.POST)
    public String addBook(Bookadmin bookadmin){
        int i = booksService.insertBook(bookadmin);
        //System.out.println(i);
        return "redirect:listBooks";
    }

    /**
     * 更新商品信息，先获取后更新
     * @param bid
     * @param model
     * @return
     */
    @RequestMapping("/books/updatePage/{bid}")
    /*public ModelAndView updateBook(@PathVariable("bid") int bid){
        ModelAndView mav = new ModelAndView();
        Bookadmin bookadmin = booksService.getBookById(bid);
        mav.addObject("bookadmin",bookadmin);
        mav.setViewName("updatePage");
        return mav;
    }*/
    public String updateBook(@PathVariable("bid") int bid,Model model){
        Bookadmin bookadmin = booksService.getBookById(bid);
        model.addAttribute("bookadmin",bookadmin);
        return "updatePage";
    }
   @RequestMapping(value = "/books/update",method = RequestMethod.POST)
    public String updBook(Bookadmin bookadmin){
        int j = booksService.updateBook(bookadmin);
        return "redirect:listBooks";
    }

    /**
     * 商品删除操作
     * @param bookadmin
     * @return
     */
    @RequestMapping("/books/deleteBooksByBid")
    public String deleteBook(Bookadmin bookadmin){
        int k = booksService.deleteBookById(bookadmin);
        return "redirect:listBooks";
    }
}

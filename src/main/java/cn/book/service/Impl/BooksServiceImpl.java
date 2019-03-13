package cn.book.service.Impl;

import cn.book.mapper.BookadminMapper;
import cn.book.pojo.Bookadmin;
import cn.book.pojo.BookadminExample;
import cn.book.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {

    @Autowired
    private BookadminMapper bookadminMapper;

   //列取书籍列表信息
    @Override
    public List<Bookadmin> getBookList() {
        BookadminExample example = new BookadminExample();
        List<Bookadmin> bookadminList = bookadminMapper.selectByExample(example);
        return bookadminList;
    }

    @Override
    public int insertBook(Bookadmin bookadmin) {
        int i = bookadminMapper.insert(bookadmin);
        return i;
    }

    @Override
    public int updateBook(Bookadmin bookadmin) {
        int j = bookadminMapper.updateByPrimaryKey(bookadmin);
        return j;
    }
    @Override
    public int deleteBookById(Bookadmin bookadmin) {
        int k = bookadminMapper.deleteByPrimaryKey(bookadmin.getBid());
        return k;
    }

    @Override
    public Bookadmin getBookById(int bid) {
        Bookadmin bookadmin = bookadminMapper.selectByPrimaryKey(bid);
//        System.out.println(bookadmin);
        return bookadmin;
    }
}

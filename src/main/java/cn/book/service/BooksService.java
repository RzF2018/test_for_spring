package cn.book.service;

import cn.book.pojo.Bookadmin;

import java.util.List;

public interface BooksService {
    public List<Bookadmin> getBookList();
    public int insertBook(Bookadmin bookadmin);
    public int updateBook(Bookadmin bookadmin);
    public int deleteBookById(Bookadmin bookadmin);
    public Bookadmin getBookById(int bid);
}

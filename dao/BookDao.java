package dao;

import pojo.Book;

import java.util.List;

public interface BookDao {
    int addBook(Book book);
    int deleteBookById(Integer id);
    int updateBook(Book book);
    Book queryBookById(Integer id);
    List<Book> queryBooks();
    /**查询总记录数*/
    Integer queryForPageTotalCount();
    /**查询当前页数据*/
    List<Book>  queryForPageItems(Integer begin,Integer pageSize);
    /** 求总记录数*/
    Integer queryForPageTotalCountByPrice(Integer min,Integer max);
    /**价格区间内当前页数据*/
    List<Book> queryForPageItemsByPrice(Integer begin,Integer size,Integer min,Integer max);

}

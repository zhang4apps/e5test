package web;

import pojo.Book;
import pojo.Page;
import service.BookService;
import service.impl.BookServiceImpl;
import utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BookServlet extends BaseServlet{
    private BookService bookService = new BookServiceImpl();

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1、获取请求的参数==封装成为Book对象
        Book book = WebUtils.copyParamToBean(req.getParameterMap(), new Book());
        // 2、调用BookService.addBook()保存图书
        bookService.addBook(book);
        // 3、跳到图书列表页面 /manager/bookServlet?action=list
        resp.sendRedirect(req.getContextPath()+"/manager/bookServlet?action=page");
    }
    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1、获取请求的参数id(图书id)
        int id = WebUtils.parseInt(req.getParameter("id"), 0);
        // 2、调用BookService.deleteBookById()删除图书
        bookService.deleteBookById(id);
        // 3、重定向图书列表页面 /manager/bookServlet?action=list
        resp.sendRedirect(req.getContextPath()+"/manager/bookServlet?action=page");
    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1、获取请求的参数==封装成book对象
        Book book = WebUtils.copyParamToBean(req.getParameterMap(),new Book());
        bookService.updateBook(book);
        // 3、重定向图书列表页面 /manager/bookServlet?action=list
        resp.sendRedirect(req.getContextPath()+"/manager/bookServlet?action=page");
    }
    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1.通过BookService查询全部图书
        List<Book> books = bookService.queryBooks();
        // 2.把全部图书保存到Request域中
        req.setAttribute("books", books);
        // 3.请求转发到/pages/manager/book_manager.jsp页面
        req.getRequestDispatcher("/pages/manager/book_manager.jsp").forward(req, resp);

    }
    protected void getBook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1、获取请求的参数图书编号
        int id = WebUtils.parseInt(req.getParameter("id"), 0);
        // 2、调用bookservice.queryBookById查询图书
        Book book = bookService.queryBookById(id);
        // 3、保存到图书到Request域中
        req.setAttribute("book",book);
        // 4、请求转发到。pages / manager/book_edit.jsp页面
        req.getRequestDispatcher("/pages/manager/book_edit.jsp").forward(req, resp);
    }
    protected void page(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int pageNo = WebUtils.parseInt(req.getParameter("pageNo"), 1);
        int pageSize =WebUtils.parseInt(req.getParameter("pageSize"),Page.PAGE_SIZE);
        Page<Book> page = bookService.page(pageNo, pageSize);
        page.setUrl("manager/bookServlet?action=page");
        req.setAttribute("page",page);
        req.getRequestDispatcher("/pages/manager/book_manager.jsp").forward(req, resp);
    }
}

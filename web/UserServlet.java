package web;


import com.google.gson.Gson;
import pojo.User;
import service.UserService;
import service.impl.UserServiceImpl;
import utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

public class UserServlet extends BaseServlet {
    UserService userService = new UserServiceImpl();

    /**  */
    protected void ajaxExistsUsername(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1、获取请求参数
        String username = req.getParameter("username");
        // 2、调用userService.existsUsername();
        boolean existsUsername = userService.existsUsername(username);
        // 3、把返回的结果封装成为map对象
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("existsUsername",existsUsername);
        Gson gson = new Gson();
        String json = gson.toJson(resultMap);

        resp.getWriter().write(json);
        // 4、重定向到首页（或登录页面）。

    }
    /** 注销 */
    protected void logout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1、销毁Session中用户登录的信息（或者销毁Session）
        req.getSession().invalidate();
        // 2、重定向到首页（或登录页面）。
        resp.sendRedirect(req.getContextPath());
    }

    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        // 1、获取请求的参数
        /*String username = req.getParameter("username");
        String password = req.getParameter("password");*/
        User loUser = WebUtils.copyParamToBean(req.getParameterMap(), new User());

        // 2、调用XxxService.xxx()处理业务
        User loginUser = userService.login(new User(null, loUser.getUsername(), loUser.getPassword(), null));

        // 3、根据login(方法返回结果判断登录是否成功
        if (loginUser == null) {
            //把错误信息，和回显的表单项信息，保存到Request域中
            req.setAttribute("msg", "用户名或密码错误");
            req.setAttribute("username", loUser.getUsername());
            // 失败 跳回登录页面
            req.getRequestDispatcher("pages/user/login.jsp").forward(req, resp);
        } else {
            // 保存用户登录的信息到session域中
            req.getSession().setAttribute("user", loginUser);
            // 成功 跳到成功页面login_success.html
            req.getRequestDispatcher("pages/user/login_success.jsp").forward(req, resp);
        }
    }

    protected void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取Session中的验证码
        String token = (String) req.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        // 删除 Session中的验证码
        req.getSession().removeAttribute(KAPTCHA_SESSION_KEY);

        // 1、获取请求的参数
        /*String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");*/
        String code = req.getParameter("code");
        User reUser = WebUtils.copyParamToBean(req.getParameterMap(), new User());
        // 2、检查验证码是否正确正确 写死:要求验证码为abcde
        if (token!=null&&token.equalsIgnoreCase(code)) {
            // 3、检查用户名是否可用
            if (userService.existsUsername(reUser.getUsername())) {
                // 不可用,跳回注册页面
                System.out.println("用户名" + reUser.getUsername() + "已存在");
                //把回显信息，保存到Request域中
                req.setAttribute("msg", "用户名已存在");
                req.setAttribute("username", reUser.getUsername());
                req.setAttribute("email", reUser.getEmail());

                req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
            } else {
                // 可用,调用Sservice保存到数据库
                userService.registerUser(new User(null, reUser.getUsername(), reUser.getPassword(), reUser.getPassword()));
                // 跳到注册成功面regist_success.html
                req.getRequestDispatcher("/pages/user/regist_success.jsp").forward(req, resp);
            }
        } else {
            //把回显信息，保存到Request域中
            req.setAttribute("msg", "验证码错误!!");
            req.setAttribute("username", reUser.getUsername());
            req.setAttribute("email", reUser.getEmail());

            System.out.println("验证码[ " + code + " ]错误");
            // 不正确,跳回注册页面
            req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
        }
    }


}

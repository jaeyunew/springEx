package com.ssg.springex.servlet_basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register1")
public class MemberRegister extends HttpServlet {

  @Override
  public void init() throws ServletException {
    System.out.println("LoginServlet init");
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
   doHandle(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    doHandle(req, resp);
  }

  public void doHandle(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    request.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;charset=UTF-8");

    PrintWriter out = response.getWriter();

    String user_id = request.getParameter("user_id");
    String user_pwd = request.getParameter("user_pwd");
    String gender = request.getParameter("gender");
    String []hobbies = request.getParameterValues("hobby");


out.println("<html><body>");
    out.println("<p>아이디: " + user_id + "</p>");
    out.println("<p>비밀번호: " + user_pwd + "</p>");
    out.println("<p>성별: " + gender + "</p>");
    out.print("<p>취미: ");
    out.print(Arrays.toString(hobbies));
    out.println("</p>");
    out.println("</body></html>");
  }
}

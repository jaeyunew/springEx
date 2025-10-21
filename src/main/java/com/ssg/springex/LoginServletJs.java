package com.ssg.springex;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login1")
public class LoginServletAll extends HttpServlet {

  @Override
  public void init() throws ServletException {
    System.out.println("LoginServlet init");
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    System.out.println("LoginServlet doPost() 메서드 호출");
    doHandle(request, response);
  }


  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    System.out.println("LoginServlet doGet() 메서드 호출");
    doHandle(request, response);
  }

  private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setCharacterEncoding("UTF-8");

    String username = request.getParameter("user_id");
    System.out.println("doHandle 메서드 호출");
    String password = request.getParameter("user_pwd");
    System.out.println(username);
    System.out.println(password);


  }
}

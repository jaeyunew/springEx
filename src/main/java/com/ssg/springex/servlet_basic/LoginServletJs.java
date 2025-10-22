package com.ssg.springex.servlet_basic;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login2")
public class LoginServletJs extends HttpServlet {

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
    System.out.println("doHandle 메서드 호출");
    request.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;charset=utf-8");
    PrintWriter out = response.getWriter();

    String user_id = request.getParameter("user_id");
    String user_pwd = request.getParameter("user_pwd");
    String user_address = request.getParameter("user_address");

    String data = "<html>";
    data += "<body>";
    data += "<h1>" + user_id + "</h1>";
    data += "<p>" + user_pwd + "</p>";
    data += "<p>" + user_address + "</p>";
    data += "</body>";
    data += "</html>";
    out.println(data);

  }
}

package com.ssg.springex.servlet_dao;

import java.util.Date;
import lombok.Data;

@Data
public class MemberVO {

  private String id;
  private String password;
  private String name;
  private String email;
  private Date joinDate;

}

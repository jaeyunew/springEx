package com.ssg.springex.homework.memberRegister;

import lombok.Data;

@Data
public class MemberVO {
  private String user_id;
  private String user_pwd;
  private String gender;
  private String[] hobby;
}

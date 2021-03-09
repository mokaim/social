package com.example.social.social;

import lombok.Getter;
import lombok.Setter;

public class SocialDto {

  @Getter
  @Setter
  public static class KakaoAuthorizeDto {
    private String code;
    private String state;
    private String error;
    private String error_description;
  }
}

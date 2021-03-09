package com.example.social.social;

import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Slf4j
@Controller
public class SocialController {

  @Value("${social.kakao.client-id}")
  private String kakaoClientId;
  @Value("${social.kakao.secret-key}")
  private String kakaoSecretKey;
  @Value("${social.kakao.auth-uri}")
  private String kakaoAuthUri;
  @Value("${social.kakao.redirect-uri}")
  private String kakaoRedirectUri;
  @Value("${social.kakao.response-type}")
  private String kakaoResponseType;
  @Value("${social.kakao.grant-type}")
  private String kakaoGrantType;
/*
  social :
  kakao :
  client-id : 6555d0ecdf28852a4a4e0f33c4ac88c6
  secret-key : BBAxYvy78Qn9wyckjk4LlrosdLKyR6aS
  auth : https://kauth.kakao.com/oauth/authorize
  redirect_uri : http://localhost:8080/oauth2/kakao/redirect
  response_type : code

    ##token
  grant_type : authorization_code*/

  @GetMapping("/oauth2/authorization/{provider}")
  public String socialLogin (@PathVariable("provider") String provider) {
    provider = Optional.ofNullable(provider)
        .orElse("empty");

    if ("google".equals(provider)) {

    } else if ("naver".equals(provider)) {

    } else if ("kakao".equals(provider)) {
      return "redirect:" + kakaoAuthUri + "?client_id=" + kakaoClientId + "&redirect_uri=" + kakaoRedirectUri + "&response_type=" + kakaoResponseType;

    } else {

    }

    return null;
  }
}

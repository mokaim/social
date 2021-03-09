package com.example.social.social;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KakaoSocialController {
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


  @GetMapping("/oauth2/kakao/redirect-uri")
  public ResponseEntity<?> redirectUri (SocialDto.KakaoAuthorizeDto kakaoAuthorizeDto) {
    HttpHeaders headers = new HttpHeaders();

    return new ResponseEntity<>(kakaoAuthorizeDto, HttpStatus.OK);
  }
}

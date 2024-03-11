// package my.config;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

// import lombok.RequiredArgsConstructor;

// @RequiredArgsConstructor
// @Configuration
// @EnableWebSecurity
// public class SecurityConfig {
// 	@Autowired
//     MemberService memberService;

//     @Autowired
//     private PrincipalOauth2UserService principalOauth2UserService;

//     @Bean
//     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    
//     // http.formLogin() 부분 생략
// 	http.authorizeRequests()                        
//                 .mvcMatchers("/css/**", "/js/**", "/img/**").permitAll()    // 모든 사용자가 인증(로그인) 없이 해당 경로에 접근할 수 있도록 설정
//                 .mvcMatchers("/", "/members/**", "/item/**", "/images/**", "/mail/**").permitAll()
// }

package com.phuongnam.config;//package com.phuongnam.config;
//
//import com.phuongnam.service.AppUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@Configuration
//@EnableWebSecurity
//public class  WebSecurityConfig extends WebSecurityConfigurerAdapter{
//    @Autowired
//    public AppUserService appUserService;
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService((UserDetailsService) appUserService)
//                .passwordEncoder(NoOpPasswordEncoder.getInstance());
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/").permitAll()
//                .antMatchers("/admin/**").access("hasRole('ADMIN')")
//                .antMatchers("/user/**").access("hasRole('USER')")
//                .antMatchers("/articles/**").access("hasAnyRole('ADMIN','USER')")
//                .and()
//                .authorizeRequests().antMatchers("/**").hasRole("USER")
//                .and()
//                .formLogin()
//                .and()
//                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                .and().exceptionHandling()
//                // .accessDeniedHandler(new MyAccessDeniedHandler())
//                .accessDeniedPage("/accessDenied")
//
//        ;
//    }
//}
//
//

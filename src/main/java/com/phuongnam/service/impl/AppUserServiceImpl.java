//package com.phuongnam.service.impl;
//
//import com.phuongnam.model.AppUser;
//import com.phuongnam.repository.AppUserRepository;
//import com.phuongnam.service.AppUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class AppUserServiceImpl implements AppUserService {
//    @Autowired
//    private AppUserRepository appUserRepository;
//
//
//    @Override
//    public AppUser getUserByUsername(String username) {
//        return appUserRepository.findByUsername(username);
//    }
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        AppUser user = this.getUserByUsername(username);
//
//        List<GrantedAuthority> authorities = new ArrayList<>();
//        authorities.add((GrantedAuthority) user.getRole());
//
//        UserDetails userDetails = new User(
//                user.getUsername(),
//                user.getPassword(),
//                authorities
//        );
//
//        return userDetails;
//    }
//}

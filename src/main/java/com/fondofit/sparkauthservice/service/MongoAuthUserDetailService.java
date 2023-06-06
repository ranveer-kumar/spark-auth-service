//package com.fondofit.sparkauthservice.service;
//
//import com.fondofit.sparkauthservice.domain.Customer;
//import com.fondofit.sparkauthservice.repository.CustomerRepository;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//@Service
//public class MongoAuthUserDetailService implements UserDetailsService {
//
//    private final CustomerRepository customerRepository;
//
//    public MongoAuthUserDetailService(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        String userName, password = null;
//        List<GrantedAuthority> authorities = null;
//        List<Customer> customers = customerRepository.findByEmail(username);
//        if (customers.size() == 0){
//            throw new UsernameNotFoundException("User name not found for the username: "+ username);
//        } else {
//            userName = customers.get(0).getEmail();
//            password = customers.get(0).getPwd();
//            authorities = new ArrayList<>();
//            authorities.add(new SimpleGrantedAuthority(customers.get(0).getRole()));
//        }
//        return new User(username, password, authorities);
//    }
//
//
///*    @Override
//    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//
//        com.fondofit.sparkauthservice.domain.User user = userRepository.findUserByUsername(userName);
//
//        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
//
//        user.getAuthorities()
//          .forEach(role -> {
//              grantedAuthorities.add(new SimpleGrantedAuthority(role.getRole()
//                .getName()));
//          });
//
//        return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
//    }*/
//
//}
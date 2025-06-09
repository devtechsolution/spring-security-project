package org.as.devtechsolution.service;

import lombok.RequiredArgsConstructor;
import org.as.devtechsolution.entity.Customer;
import org.as.devtechsolution.repository.CustomerRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Aditya Srivastva
 */
@RequiredArgsConstructor
@Service
public class CustomUserDetailsImpl implements CustomeUserDetails {

    private final CustomerRepository customerRepository;;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Customer customer = customerRepository
                .findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("UserDetails not found for user: " + username));
        List<GrantedAuthority> authorities = List.of(new SimpleGrantedAuthority(customer.getRole()));
        return new User(customer.getEmail(), customer.getPwd(), authorities);
    }
}

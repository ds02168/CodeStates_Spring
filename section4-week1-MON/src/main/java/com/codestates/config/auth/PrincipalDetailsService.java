package com.codestates.config.auth;

import com.codestates.model.Member;
import com.codestates.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class PrincipalDetailsService implements UserDetailsService {

    @Autowired
    private MemberRepository memberRepository;

    public UserDetails loadUserByUsername(String user) throws UsernameNotFoundException {
        Member memberEntity = memberRepository.findByUsername(user);
        System.out.println("username : " + user);
        if(memberEntity != null)
            return new PrincipalDetails(memberEntity);

        return null;
    }
}

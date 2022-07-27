package com.codestates.jwt.oauth;

import com.codestates.jwt.model.Member;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

@Data
public class PrincipalDetails implements UserDetails {
    private Member member;

    public PrincipalDetails(Member member){
        this.member = member;
    }

    public Collection<? extends GrantedAuthority> getAuthorities(){
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        member.getRoleList().forEach(n ->{
            authorities.add(() -> n);
        });
        return authorities;
    }

    public String getPassword(){
        return member.getPassword();
    }

    public String getUsername(){
        return member.getUsername();
    }

    public boolean isAccountNonExpired(){
        return true;
    }

    public boolean isAccountNonLocked(){
        return true;
    }

    public boolean isCredentialsNonExpired(){
        return true;
    }

    public boolean isEnabled(){
        return true;
    }
}

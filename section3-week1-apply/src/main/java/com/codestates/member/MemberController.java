package com.codestates.member;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/v1/members")
public class MemberController {
    @PostMapping
    public ResponseEntity postMember(
            @RequestParam("email") String email,
            @RequestParam("name") String name,
            @RequestParam("phone") String phone){

        HttpHeaders headers = new HttpHeaders();
        headers.set("Client-Geo-Location","Korea,Seoul");
        return new ResponseEntity<>(new Member(email,name,phone), headers, HttpStatus.CREATED);
    }

    @GetMapping("/{member-id}")
    public ResponseEntity getMember(@PathVariable("member-id") long memberId){
        System.out.println("# memberId: " + memberId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getMembers(HttpServletResponse response){
        response.addHeader("Client-Geo-Location","Korea,Seoul");

        return null;
    }

}

package com.example.cmarket;

import com.example.cmarket.discount.CurrentDiscountInfo;
import com.example.cmarket.discount.DiscountInfo;
import com.example.cmarket.discount.RateDiscountInfo;
import com.example.cmarket.order.OrderService;
import com.example.cmarket.order.OrderServiceImpl;
import com.example.cmarket.user.UserRepository;
import com.example.cmarket.user.UserRepositoryImpl;
import com.example.cmarket.user.UserService;
import com.example.cmarket.user.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name="UserRepository")
    public UserRepository userRepository(){
        return new UserRepositoryImpl();
    }
    @Bean
    public UserService userService(){
        return new UserServiceImpl(userRepository());
    }
    @Bean
    public DiscountInfo discountInfo(){
        return new RateDiscountInfo();
    }
    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(userRepository(), discountInfo());
    }
}

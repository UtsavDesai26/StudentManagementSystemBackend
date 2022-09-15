package com.example.studentmanagmentsystem.Config;


import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.jdbcAuthentication().dataSource(dataSource)
                .withDefaultSchema()
                .withUser("admin")
                .password("pass")
                .roles("ADMIN", "USER")
                .and()
                .withUser("user")
                .password("pass")
                .roles("USER");


        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("pass")
                .roles("ADMIN", "USER")
                .and()
                .withUser("user")
                .password("pass")
                .roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

    }

    @Bean
    public void getPasswordEncoder() {

    }

}

package com.example.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
public class SecurityConfig2 extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/").authenticated()
		// 登出
		.antMatchers("/signOut").permitAll()
		// 字体
		.antMatchers("/**/*.css").permitAll().antMatchers("/**/*.eot").permitAll().antMatchers("/**/*.svg").permitAll().antMatchers("/**/*.ttf").permitAll().antMatchers("/**/*.woff").permitAll().antMatchers("/**/*.woff2").permitAll()
		.antMatchers("/**/*.otf").permitAll()
		// css
		.antMatchers("/**/*.css").permitAll()
		// 按钮
		.antMatchers("/**/*.ico").permitAll()
		// 图片
		.antMatchers("/**/*.png").permitAll()
		.antMatchers("/**/*.gif").permitAll()
		.antMatchers("/**/*.jpg").permitAll()
		// js
		.antMatchers("/**/*.js").permitAll()
		// 拦截指定
		.antMatchers("/**/toUpload").authenticated()
		.antMatchers("/**/management/management").authenticated()
		.antMatchers("/**/event/index").authenticated()
		.anyRequest().permitAll().and()
		.formLogin().and()
		.httpBasic().and().logout().logoutUrl("/index").and().csrf().disable();
	}

}

package me.jay.mvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// 기본 설정 이외 추가 설정이 필요할 때
@Configuration
// 기본 설정도 모두 새로 커스터마이징할 때
//@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/m/**").addResourceLocations("classpath:/m/").setCachePeriod(20);
	}
}

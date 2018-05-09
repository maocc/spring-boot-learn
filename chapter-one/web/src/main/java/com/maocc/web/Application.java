package com.maocc.web;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter4;
import com.maocc.web.util.BlogProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author maocc
 * @description
 * @date: 2018/5/8 15:34
 */
@SpringBootApplication
@EnableConfigurationProperties({BlogProperties.class})
@EnableScheduling
@EnableAsync
public class Application{

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {

		FastJsonHttpMessageConverter4 oFastConverter = new FastJsonHttpMessageConverter4();

		FastJsonConfig oFastJsonConfig = new FastJsonConfig();
		oFastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		oFastConverter.setFastJsonConfig(oFastJsonConfig);
		List<MediaType> oFastMediaTypeList = new ArrayList<MediaType>();
		oFastMediaTypeList.add(MediaType.APPLICATION_JSON_UTF8);
		oFastConverter.setSupportedMediaTypes(oFastMediaTypeList);

		return new HttpMessageConverters(oFastConverter);
	}
}

package configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.http.MediaType;
import org.springframework.ui.context.support.ResourceBundleThemeSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.theme.CookieThemeResolver;
import org.springframework.web.servlet.theme.ThemeChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "controller" })
public class AppConfig implements WebMvcConfigurer {

	/**
	 * Configure ViewResolvers to deliver preferred views.
	 */
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		TilesViewResolver viewResolver = new TilesViewResolver();
//		viewResolver.setViewClass(JstlView.class);
		registry.viewResolver(viewResolver);
		registry.jsp().prefix("/WEB-INF/views/pages/");
		registry.jsp().suffix(".jsp");
	}
	
//    @Bean
//    public InternalResourceViewResolver viewResolver(){
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setViewClass(JstlView.class);
//        viewResolver.setPrefix("/WEB-INF/views/pages/");
//        viewResolver.setSuffix(".jsp");
//        return viewResolver;
//    }

	/**
	 * Configure TilesConfigurer.
	 */

	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		tilesConfigurer.setDefinitions(new String[] { "/WEB-INF/views/tiles/tiles.xml" });
		tilesConfigurer.setCheckRefresh(true);
		return tilesConfigurer;
	}

	/**
	 * Configure ResourceHandlers to serve static resources like CSS/ Javascript
	 * etc...
	 */

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("/static/");
	}

	/**
	 * Configure Theme Switcher
	 */

	@Bean
	public ResourceBundleThemeSource themeSource() {
		ResourceBundleThemeSource themeSource = new ResourceBundleThemeSource();
		themeSource.setDefaultEncoding("UTF-8");
		themeSource.setBasenamePrefix("themes.");
		return themeSource;
	}

	@Bean
	public CookieThemeResolver themeResolver() {
		CookieThemeResolver resolver = new CookieThemeResolver();
		resolver.setDefaultThemeName("bright");
		resolver.setCookieName("my-theme-cookie");
		return resolver;
	}


	@Bean("messageSource")
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:locale/messages");
		messageSource.setDefaultEncoding("UTF-8");
		messageSource.setUseCodeAsDefaultMessage(true);
		return messageSource;
	}

	@Bean
	public LocaleResolver localeResolver() {
		CookieLocaleResolver localeResolver = new CookieLocaleResolver();
		return localeResolver;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		ThemeChangeInterceptor themeChangeInterceptor = new ThemeChangeInterceptor();
		themeChangeInterceptor.setParamName("theme");
		registry.addInterceptor(themeChangeInterceptor);

		LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
		localeChangeInterceptor.setParamName("lang");
		registry.addInterceptor(localeChangeInterceptor);
	}

	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		configurer.defaultContentType(MediaType.TEXT_HTML).parameterName("type").favorParameter(true)
				.ignoreUnknownPathExtensions(false).ignoreAcceptHeader(false).useJaf(true);
	}

}
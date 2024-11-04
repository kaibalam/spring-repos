package com.bolsadeideas.springboot.form.app.interceptors;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("tiempoTrasncurridoInterceptor")
public class TiempoTrasncurridoInterceptor implements HandlerInterceptor{
	
	private static final Logger log = LoggerFactory.getLogger(TiempoTrasncurridoInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		if (request.getMethod().equalsIgnoreCase("post")) {
			return true;
		}
		if (handler instanceof HandlerMethod) {
			HandlerMethod metodo = (HandlerMethod) handler;
			log.info("es un método del controlador: " + metodo.getMethod().getName());
			
		}
		log.info("TiempoTrasncurridoInterceptor : preHandle() entrando...");
		log.info("Interceptando: " + handler);
		long tiempoInicio = System.currentTimeMillis();
		request.setAttribute("tiempoInicio", tiempoInicio);
		Random random = new Random();
		Integer demora = random.nextInt(100);
		Thread.sleep(demora);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		if (request.getMethod().equalsIgnoreCase("post")) {
			return;
		}
		long tiempoFin = System.currentTimeMillis();
		long tiempoInicio = (Long) request.getAttribute("tiempoInicio");
		long tiempoTranscurrido = tiempoFin - tiempoInicio;

		if(handler instanceof HandlerMethod && modelAndView != null) {
			modelAndView.addObject("tiempoTrasncurrido", tiempoTranscurrido);
		}
		log.info("TiempoTrasncurrido: " + tiempoTranscurrido + " miliseguindos");
		log.info("TiempoTrasncurridoInterceptor : postHandle() saliendo...");
		
	}
	
	

}

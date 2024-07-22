package dev.wakandaacademy.produdoro.handler;

import org.apache.juli.logging.Log;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators.Log10;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



import lombok.extern.log4j.Log4j2;
//atenção com exceptions
@RestControllerAdvice
@Log4j2
public class RestResponseEntityExceptionHandler {
	@ExceptionHandler(APIException.class)
	public ResponseEntity<ErrorApiResponse> handlerGenericException(APIException ex){
			return ex.builErrorResponseEntity();
	
	
	
	}
		@ExceptionHandler(Exception.class)
		public ResponseEntity<ErrorApiResponse> handlerGenericException(Exception ex){
			
		log.error("Exception: ", ex);
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
				body(ErrorApiResponse.description("INTERNAL SERVER ERROR!")
						.mensage("POR FAVOR INFORME AO ADMINISTRADOR DO SISTEMA")
						.build());
		
		 
		
		
	}
}

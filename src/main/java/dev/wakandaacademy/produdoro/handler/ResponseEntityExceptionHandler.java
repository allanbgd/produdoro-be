package dev.wakandaacademy.produdoro.handler;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Log4j2
@RestControllerAdvice
public class ResponseEntityExceptionHandler {
    @ExceptionHandler(APIException.class)
    public ResponseEntity<ErrorApiResponse> handlerGenericException(APIException ex){
        // Trata exceções do tipo APIException e delega a construção da resposta à própria exceção
        return ex.buildErrorResponseEntity();
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorApiResponse> handlerGenericException(Exception ex){
        //tratamento dessa exceção
        //joga exceção no log

        log.error("Exception: ", ex);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ErrorApiResponse.builder()
                        .description("INTERNAL SERVER ERROR!")
                        .message("POR FAVOR INFORME AO ADMINISTRADOR DO SISTEMA")
                        .build());


    }
}

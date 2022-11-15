package net.ict.springex.controller.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.Arrays;

@ControllerAdvice
@Log4j2
public class CommonExceptionAdvice {

    @ResponseBody
    @ExceptionHandler(NumberFormatException.class)
    public String exceptNumber(NumberFormatException numberFormatException){
        log.error("============");
        log.error(numberFormatException.getMessage());
        return "NUMBER FORMAT EXCEPTION";
    }
//예외처리의 최상위 타입인 Exception타입을 처리하도록 구성 exceptionCommon(Exception exception)
//범용적 예외처리 방식
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public String exceptionCommon(Exception exception) {
        log.error("==============");
        log.error(exception.getMessage());

        StringBuffer buffer = new StringBuffer("<ul>");
        buffer.append("<li>" + exception.getMessage() + "</li>");
        Arrays.stream(exception.getStackTrace()).forEach(stackTraceElement -> {
           buffer.append(("<li>"+stackTraceElement+"<li>"));
        });
        buffer.append("</ul>");
        return buffer.toString();
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String notFound(){
        return "custom404";
    }

}

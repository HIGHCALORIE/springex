package net.ict.springex.mapper.service;


import lombok.extern.log4j.Log4j2;
import net.ict.springex.dto.TodoDTO;
import net.ict.springex.service.TodoService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class TodoServiceTest {

    @Autowired
    private TodoService todoService;

    @Test
    public void testRegister(){
        TodoDTO todoDTO =TodoDTO.builder()
                .title("OOOOOOOOOOOOOOOOOOoo")
                .dueDate(LocalDate.now())
                .writer("TAEYOON")
                .build();
        todoService.register(todoDTO);
    }
}
package net.ict.springex.mapper.mapper;

import lombok.extern.log4j.Log4j2;
import net.ict.springex.domain.TodoVO;
import net.ict.springex.mapper.TodoMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class TodoMapperTest {

    @Autowired(required = false)
    private TodoMapper todoMapper;

    @Test
    public void testgettodo(){
        log.info(todoMapper.getTime());
    }

    @Test
    public void testInser(){
        TodoVO todoVO = TodoVO.builder()
                .title("spuring TEST")
                .dueDate(LocalDate.of(2022,11,14))
                .writer("ICT05")
                .build();
            todoMapper.insert(todoVO);

    }


}

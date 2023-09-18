package com.mitre.attack.web;

import com.mitre.attack.exception.AttackException;
import com.mitre.attack.service.impl.ItemServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@WebMvcTest(AttackTacticsController.class)
class AttackTacticsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ItemServiceImpl itemService;

    @BeforeEach
    public void setup() {
        Mockito.reset(itemService);
    }

    @Test
    void testLoadDataWhenCalledThenServiceMethodIsCalled() throws Exception {
        // Arrange
        Mockito.doNothing().when(itemService).loadData();

        // Act
        mockMvc.perform(MockMvcRequestBuilders.post("/attack/tactics"))
                .andDo(MockMvcResultHandlers.print());

        // Assert
        verify(itemService, times(1)).loadData();
    }

    @Test
    void testLoadDataWhenAttackExceptionThrownThenErrorIsLogged() throws Exception {
        // Arrange
        Mockito.doThrow(new AttackException("Test Exception")).when(itemService).loadData();

        // Act
        mockMvc.perform(MockMvcRequestBuilders.post("/attack/tactics"))
                .andDo(MockMvcResultHandlers.print());

        // Assert
        verify(itemService, times(1)).loadData();
    }
}
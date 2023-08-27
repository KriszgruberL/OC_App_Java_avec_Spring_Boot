package com.openclassrooms.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.openclassrooms.api.controllers.EmployeeController;
import com.openclassrooms.api.services.EmployeeService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

//Test unitaires

@WebMvcTest(controllers = EmployeeController.class)
public class EmployeeControllerTestUnitaire {

    // Permet la simulation des requêtes et des réponses HTTP dans les tests de l'API.
    @Autowired
    private MockMvc mockMvc;

    // Permet de créer un bean simulé pour les tests unitaires.
    @MockBean
    private EmployeeService employeeService;

    @Test
    public void testGetEmployees() throws Exception {
        mockMvc.perform(get("/employees"))
                .andExpect(status().isOk());
    }

}

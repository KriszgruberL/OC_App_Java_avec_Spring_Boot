
package com.openclassrooms.api;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
// Permettent de charger le contexte Spring et de réaliser des requêtes sur le controller.
public class EmployeeControllerTest {

    @Autowired
    public MockMvc mockMvc;

    @Test
    public void testGetEmployees() throws Exception {
        mockMvc.perform(get("/employees"))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) jsonPath("$[0].firstName", is("Laurent")));
//        vérifie le contenu retourné grâce à jsonPath("$[0].firstName", is("Laurent")).
//        $ pointe sur la racine de la structure JSON.
//        [0]indique qu’on veut vérifier le premier élément de la liste
//        firstName désigne l’attribut qu’on veut consulter
//        is(“Laurent”) est ce que l’on attend comme résultat.
    }

}

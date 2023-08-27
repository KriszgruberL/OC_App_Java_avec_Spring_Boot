package com.openclassrooms.webapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetEmployees() throws Exception {
        mockMvc.perform(get("/"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("home"))
                .andExpect(content().string(containsString("Laurent")));
    }

    /*
    La méthode perform a en paramètre l’URL à appeler. Puis il s’ensuit une suite d’instructions pour vérifier l’attendu :
        status().isOk() : la réponse a un code de statut 200 ;
        view().name(“home”) : le nom de vue retourné correspond au paramètre “home” ;
        content().string(containsString("Laurent")) : le corps de la réponse contient à un moment ou à un autre le texte Laurent.

       Notons également que andDo(print()) permet au retour de l’appel d’être affiché dans la console (on y verra donc tout le HTML généré).*/

}

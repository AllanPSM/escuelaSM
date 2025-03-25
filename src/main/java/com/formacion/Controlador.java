package com.formacion;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controlador {
    
    @GetMapping("/")
    public String inicio(Model model) {
        model.addAttribute("texto", "Introduce tus credenciales:");
        return "index"; // Redirige a index.jsp
    }

    @PostMapping("/procesarFormulario")
    public String procesarFormulario(@RequestParam String email, 
                                     @RequestParam String password, 
                                     Model model) {
        // Muestra los datos en la consola
        System.out.println("Email recibido: " + email);
        System.out.println("Contraseña recibida: " + password);
        
        // Añadir los datos al modelo para mostrarlos en la vista
        model.addAttribute("email", email);
        model.addAttribute("password", password);

        return "index"; // Redirige de vuelta a index.jsp
    }
}

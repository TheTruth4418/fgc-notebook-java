package com.example.FGCNotebook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class charactersController {
    // Retrieve all the data
    @GetMapping("/characters")
    public Map<String, String[]> getCharacters(){
        return Constants.getGameData();
    }
}

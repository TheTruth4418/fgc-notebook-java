package com.example.FGCNotebook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class charactersController {
    // Retrieve all the data
    @GetMapping("/characters")
    public Map<String, String[]> getCharacters(){
        return Constants.getGameData();
    }

    @GetMapping("/characters/{title}")
    public String[] getCharactersByGame(@PathVariable String title){
        Map<String, String[]> charMap = Constants.getGameData();

        return charMap.get(title);
    }
}

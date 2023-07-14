package com.psai.podcastrestAPI.controllers;

import com.psai.podcastrestAPI.Podcast;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/podcasts")
public class PodcastRestController {
    @GetMapping()
    public String getRoot() {
        return "OK";

    }

    @GetMapping("/{id}")
    public ResponseEntity<Podcast> getPodcast(@PathVariable int id){
        if(id > 1000){
            return ResponseEntity.notFound().build();
        }

        Podcast result = new Podcast();

        result.setId(id);
        result.setName("Meu podcast");
        result.setUrl("http://www.meupodcast.com.br");

        return ResponseEntity.ok(result);
    }

}

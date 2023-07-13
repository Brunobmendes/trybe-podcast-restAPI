package com.psai.podcastrestAPI.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/podcasts")
public class PodcastRestController {
    @GetMapping("/{id}/search")
    public String getRoot(@PathVariable int id, @RequestParam String title) {
        return String.format("Podcast ID: " + id + ", com o titulo: " + title);

    }

}

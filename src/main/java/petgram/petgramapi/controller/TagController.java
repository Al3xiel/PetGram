package petgram.petgramapi.controller;

import org.springframework.web.bind.annotation.*;
import petgram.petgramapi.model.Tag;
import petgram.petgramapi.repository.TagRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tags")
public class TagController {
    private final TagRepository tagRepository;

    public TagController(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    @GetMapping
    public List<Tag> getAllTags() {
        return tagRepository.findAll();
    }

    @GetMapping("/{id}")
    public Tag getTagById(@PathVariable String id) {
        return tagRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Tag createTag(@RequestBody Tag tag) {
        return tagRepository.save(tag);
    }

    @DeleteMapping("/{id}")
    public void deleteTag(@PathVariable String id) {
        tagRepository.deleteById(id);
    }
}
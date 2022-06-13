package kr.ac.mju.k1.k1chellin;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StoreController {
    private final StoreRepository repository;

    StoreController(StoreRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/stores")
    @CrossOrigin(origins = "http://localhost:8080")
    List<Store> stores(@RequestParam(required = false) String keyword) {
        if (keyword != null)
            return repository.findAllByKeyword(keyword);
        return repository.findAll();
    }
}

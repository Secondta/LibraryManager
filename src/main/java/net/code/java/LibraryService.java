package net.code.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {
    @Autowired
    private LibraryRepository repo;

    public List<Library> listAll() {
        return repo.findAll();
    }
    public void save(Library library) {
        repo.save(library);
    }

    public Library get(Long id) {
        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

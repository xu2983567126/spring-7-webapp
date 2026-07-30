package guru.springframework.spring7webapp.service;

import guru.springframework.spring7webapp.domain.Author;
import guru.springframework.spring7webapp.repositiries.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return AuthorServiceImpl.this.authorRepository.findAll();
    }
}

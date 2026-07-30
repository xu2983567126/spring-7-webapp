package guru.springframework.spring7webapp.service;

import guru.springframework.spring7webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}

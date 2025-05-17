package com.example.library.controller;

import com.example.library.model.Book;
import com.example.library.model.Borrow;
import com.example.library.repository.BookRepository;
import com.example.library.repository.BorrowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
public class LibraryController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BorrowRepository borrowRepository;

    @GetMapping("/books")
    public String listBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }

    @PostMapping("/borrow")
    public String borrowBook(@RequestParam Long bookId, @RequestParam Long userId) {
        Book book = bookRepository.findById(bookId).orElse(null);
        if (book != null && "AVAILABLE".equals(book.getStatus())) {
            book.setStatus("BORROWED");
            bookRepository.save(book);

            Borrow borrow = new Borrow();
            borrow.setBook(book);
            borrow.setUserId(userId);
            borrow.setBorrowDate(LocalDate.now());
            borrowRepository.save(borrow);
        }
        return "redirect:/books";
    }
} 
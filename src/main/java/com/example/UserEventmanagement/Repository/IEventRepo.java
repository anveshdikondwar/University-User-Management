package com.example.UserEventmanagement.Repository;

import com.example.UserEventmanagement.Model.Event;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface IEventRepo {

    List<Event> findByEventDate(LocalDate Date);

    void save(Event e);

    void saveAll(List<Event> e);

    Iterable<Event> findAll();

    Optional<Event> findById(Integer id);

    void delete(Event e);
}

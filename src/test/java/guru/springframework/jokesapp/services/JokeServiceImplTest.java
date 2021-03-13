package guru.springframework.jokesapp.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JokeServiceImplTest {

    JokeServiceImpl service;

    @BeforeEach
    void setUp() {
        service = new JokeServiceImpl();
    }

    @Test
    void getRandomJoke() {
        System.out.println(service.getJoke());
    }
}
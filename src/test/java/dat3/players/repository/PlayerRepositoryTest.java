package dat3.players.repository;

import dat3.players.entity.Player;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class PlayerRepositoryTest {

    @Autowired
    PlayerRepository playerRepository;

    @BeforeEach
    void setUp() {
        playerRepository.save(new Player("XX1", "YY1", "ZZ1"));
    }
}
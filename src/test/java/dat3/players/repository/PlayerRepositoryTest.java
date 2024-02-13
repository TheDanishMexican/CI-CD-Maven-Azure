package dat3.players.repository;

import dat3.players.entity.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
        playerRepository.save(new Player("XX2", "YY2", "ZZ2"));
    }

    @Test
    public void testAllPlayers() {
        assertEquals(2,playerRepository.count());
    }

    @Test
    public void testAddPlayer() {
        Player pNew = new Player("AA1", "BB1", "CC1");
        System.out.println(pNew);
        //save returns the object after it has been added to the database, ie it gets an ID as well
        playerRepository.save(pNew);
        assertTrue(pNew.getId() > 0);
        assertEquals(3,playerRepository.count());
    }

    public void allwaysFail() {
        assertTrue(false);
    }

}
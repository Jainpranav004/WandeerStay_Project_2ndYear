package Wanderstay_2.Wanderstay_1.WanderStay.DAOclasse;

import java.util.Optional;

import Wanderstay_2.Wanderstay_1.WanderStay.src.main.java.User;

public class unitTest {
    @RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindById_ShouldReturnUser() {
        User user = new User("John Doe", "john@wanderstay.com");
        userRepository.save(user);

        Optional<User> result = userRepository.findById(user.getId());
        assertTrue(result.isPresent());
        assertEquals("John Doe", result.get().getName());
    }
}
}

package Wanderstay_2.Wanderstay_1.WanderStay.DAOclasse;

import java.util.Optional;

import Wanderstay_2.Wanderstay_1.WanderStay.src.main.java.User;

public class serviceLayer {
    @RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void testGetUserById() {
        Long userId = 1L;
        User user = new User(userId, "Jane Doe", "jane@wanderstay.com");
        when(userRepository.findById(userId)).thenReturn(Optional.of(user));

        User result = userService.getUserById(userId);
        assertNotNull(result);
        assertEquals("Jane Doe", result.getName());
    }
}
}

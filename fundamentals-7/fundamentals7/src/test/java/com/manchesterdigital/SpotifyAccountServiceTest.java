package com.manchesterdigital;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;


import static org.assertj.core.api.Java6Assertions.assertThat;

public class SpotifyAccountServiceTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    private AuthenticationService authenticationService;

    private SpotifyAccountService subject;

    @Before
    public void setUp() throws Exception {
        subject = new SpotifyAccountService(authenticationService);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void whenUsernameAndPasswordValidThenAccountReturned() {
        // arrange
        String username = "john@test.com";
        String password = "4e8er34f";
        BDDMockito.given(authenticationService.authenticate(Mockito.anyString(), Mockito.anyString()))
                .willReturn(true);
        SpotifyAccount spotifyAccount = new SpotifyAccount(username, password);
        // act
        SpotifyAccount result = subject.verify(username, password);
        // assert
        assertThat(result).isEqualTo(spotifyAccount);
    }

    @Test
    public void whenUsernameAndPasswordInvalidThenExceptionThrown() {
        // arrange
        String username = "john@test.com";
        String password = "4e8er34f";
        BDDMockito.given(authenticationService.authenticate(Mockito.anyString(), Mockito.anyString()))
                .willReturn(false);
        // act
        subject.verify(username, password);

        // assert
        BDDMockito.verify(authenticationService).authenticate(username, password);
        expectedException.expect(SpotifyAccountNotValidException.class);

    }
}

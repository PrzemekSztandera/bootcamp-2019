package com.manchesterdigital;

public class SpotifyAccountService {

    private final AuthenticationService authenticationService;

    public SpotifyAccountService(AuthenticationService authenticationService) {

        this.authenticationService = authenticationService;
    }

    public SpotifyAccount verify(String username, String password) {

        if(!authenticationService.authenticate(username, password)) {
            throw new SpotifyAccountNotValidException();
        }
        return new SpotifyAccount(username, password);
    }
}

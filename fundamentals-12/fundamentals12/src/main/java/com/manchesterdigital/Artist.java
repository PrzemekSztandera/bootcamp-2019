package com.manchesterdigital;

import lombok.*;

import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Artist {
    private final List<Members> membersList;
    private final String location;
    private final String name;
    private String song;
    private String album;


    public Artist(String name, List<Members> membersList, String location) {
        this.name = name;
        this.membersList = membersList;
        this.location = location;
    }

    public boolean isFrom(String locationRequired) {
        return location.equalsIgnoreCase(locationRequired);
    }
}

package org.generation.marify.dtos;


import java.time.LocalDate;

public record AlbumRequest(
        String name,
        LocalDate releaseYear) {
}

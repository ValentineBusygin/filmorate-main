package ru.yandex.practicum.filmorate.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.Duration;
import java.time.Instant;

@Data
public class Film {
    Long id;

    @NotNull(message = "Не передано название")
    @NotBlank(message = "Название не должно быть пустым")
    String name;

    String description;

    Instant releaseDate;

    Duration duration;
}

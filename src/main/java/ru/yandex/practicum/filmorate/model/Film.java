package ru.yandex.practicum.filmorate.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.Duration;
import java.time.LocalDate;

@Data
public class Film {
    Long id;

    @NotNull(message = "Не передано название")
    @NotBlank(message = "Название не должно быть пустым")
    String name;

    String description;

    LocalDate releaseDate;

    Duration duration;
}

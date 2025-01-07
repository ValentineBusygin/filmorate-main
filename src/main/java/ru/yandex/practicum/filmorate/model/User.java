package ru.yandex.practicum.filmorate.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;

@Data
@EqualsAndHashCode(of = {"login"})
public class User {
    Long id;

    @NotNull(message = "Не передан email")
    @NotBlank(message = "Email не должен быть пустым")
    @Email(message = "Неправильный формат email")
    String email;

    @NotNull(message = "Не передан логин")
    @NotBlank(message = "Логин не должен быть пустым")
    String login;

    String name;

    @PastOrPresent(message = "Дата рождения не может быть в будущем")
    Instant birthday;
}

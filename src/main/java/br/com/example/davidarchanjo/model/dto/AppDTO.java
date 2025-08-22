package br.com.example.davidarchanjo.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppDTO {

    @NotEmpty
    @Size(max = 20)
    @JsonProperty("appName")
    private String name;

    @NotEmpty
    @JsonProperty("appVersion")
    private String version;

    @NotEmpty
    @JsonProperty("devName")
    private String author;
}

package academy.wakanda.wakacop.pauta.domain;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@ToString
@Entity
public class Pauta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", updatable = false, unique = true, nullable = false)
    private UUID id;
    @NotBlank
    private String título;
    @NotBlank
    private String descricao;
    @NotNull
    private UUID idAssociadoAutor;
    private LocalDateTime dataCriacao;
}

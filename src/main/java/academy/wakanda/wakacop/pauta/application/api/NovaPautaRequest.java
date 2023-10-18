package academy.wakanda.wakacop.pauta.application.api;

import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@ToString
public class NovaPautaRequest {
    @NotBlank
    private String título;
    @NotBlank
    private String descricao;
    @NotNull
    private UUID idAssociadoAutor;
}

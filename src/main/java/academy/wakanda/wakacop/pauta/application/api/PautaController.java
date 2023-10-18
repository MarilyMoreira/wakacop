package academy.wakanda.wakacop.pauta.application.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequiredArgsConstructor
public class PautaController implements PautaAPI {

    @Override
    public PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta) {
        log.info("[start] PautaController - cadastraPauta");
        log.info("[finish] PautaController - cadastraPauta");
        return null;
    }
}

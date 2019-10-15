package br.com.bigdata.cardiodiseaseapi.controller;

import br.com.bigdata.cardiodiseaseapi.dto.BaseInfoDto;
import br.com.bigdata.cardiodiseaseapi.dto.CardioResponseDto;
import br.com.bigdata.cardiodiseaseapi.dto.TrainInfoDto;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/diseases")
public class DiseaseController {

    /**
     * Metodo responsavel por treinar a base de acordo com um indutor
     *
     * @param inductor
     * @return ResponseEntity
     */
    @PostMapping("/train")
    @ApiOperation(notes = "Treinar a base de acordo com um indutor", value = "Treinar a base", response = ResponseEntity.class)
    public ResponseEntity train(@PathVariable String inductor) {
        return null;
    }

    /**
     * Metodo responsavel por retornar as informações do último treino da base
     *
     * @return ResponseEntity
     */
    @GetMapping("/train/infos")
    @ApiOperation(notes = "Retornar as informações do último treino da base", value = "Retornar informações do último treino da base", response = ResponseEntity.class)
    public ResponseEntity<TrainInfoDto> trainInfos() {
        return null;
    }

    /**
     * Metodo responsavel por preencher a base de acordo com o csv
     *
     * @return ResponseEntity
     */
    @PostMapping("/rebase")
    @ApiOperation(notes = "Preencher a base de acordo com arquivo original", value = "Preencher a base", response = ResponseEntity.class)
    public ResponseEntity rebase() {
        return null;
    }

    /**
     * Metodo responsavel por retornar informações da base
     *
     * @return ResponseEntity
     */
    @GetMapping("/base/infos")
    @ApiOperation(notes = "Retornar as informações da base", value = "Retornar as informações da base", response = ResponseEntity.class)
    public ResponseEntity<BaseInfoDto> baseInfos() {
        return null;
    }

    /**
     * Metodo responsavel por preencher a base de acordo com o csv
     *
     * @return ResponseEntity
     */
    @PostMapping("/predict")
    @ApiOperation(notes = "Predizer com base no treino", value = "Preencher a base", response = ResponseEntity.class)
    public ResponseEntity<CardioResponseDto> predict() {
        return null;
    }


}

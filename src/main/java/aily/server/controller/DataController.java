package aily.server.controller;

import aily.server.DTO.AvgDataDTO;
import aily.server.Scheduled.AutoData;
import aily.server.service.DataService;
import lombok.RequiredArgsConstructor;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class DataController {

    private final DataService dataService;
    private final AutoData autoData;

    //데이터 파일 강제 저장 ( 테스트 용  )
    @GetMapping("/member/dataset")
    public void AvgData() throws ParseException {
            autoData.avgdatasave();
        }

    //데이터 파일 리액트로 전송
    @GetMapping("/member/showshowata")
    public List<AvgDataDTO> AvgDataShow() {
        return dataService.findAvgData();
    }


}

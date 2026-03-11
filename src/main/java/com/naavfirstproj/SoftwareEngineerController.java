package com.naavfirstproj;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers(){
    return List.of(
            new SoftwareEngineer(
                    1, "james", "java"),
            new SoftwareEngineer(
            2,"jack","go"
    ));
    }


}

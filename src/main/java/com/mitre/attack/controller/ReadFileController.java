package com.mitre.attack.controller;

import com.mitre.attack.service.impl.ReadFileContext;

public class ReadFileController {


    private ReadFileContext readFileContext;

    public ReadFileController(ReadFileContext readFileContext) {
        this.readFileContext = readFileContext;
    }

}

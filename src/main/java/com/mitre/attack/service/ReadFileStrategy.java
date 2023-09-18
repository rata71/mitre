package com.mitre.attack.service;

import com.mitre.attack.data.enums.FileType;
import com.mitre.attack.exception.AttackException;

public interface ReadFileStrategy {

    public FileType getType();
    public StringBuilder read() throws AttackException;

}

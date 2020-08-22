package com.beyond.person.core.service;

import com.beyond.person.core.exception.ValidationException;

public interface ProgrammerActionService extends BasePersonActionService {
    void coding() throws ValidationException;
}

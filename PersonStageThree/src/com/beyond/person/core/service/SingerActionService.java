package com.beyond.person.core.service;

import com.beyond.person.core.exception.ValidationException;

public interface SingerActionService extends BasePersonActionService {
    void singing() throws ValidationException;
}

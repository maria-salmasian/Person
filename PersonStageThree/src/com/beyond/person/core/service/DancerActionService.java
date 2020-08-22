package com.beyond.person.core.service;

import com.beyond.person.core.exception.ValidationException;

public interface DancerActionService extends BasePersonActionService {
    void dancing() throws ValidationException;

}

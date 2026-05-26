package com.Java.Qualifier.Service;

import com.Java.Qualifier.Dto.BfhlRequest;
import com.Java.Qualifier.Dto.BfhlResponse;

public interface BfhlService {
    BfhlResponse processData(BfhlRequest request);
}

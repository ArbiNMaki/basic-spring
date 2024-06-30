package com.basic.spring.boot.core.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CyclicB {

    private CyclicC cyclicC;
}

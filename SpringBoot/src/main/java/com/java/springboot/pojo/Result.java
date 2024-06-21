package com.java.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private int Code;
    private String Message;
    private Object Data;
    public Result Success(Object result)
    {
        return new Result(1,"success",result);
    }

}

package com.java.springboot.Data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private int Code;
    private String Message;
    private Object Data;
    public Result success(int Code ,String Message,Object Data)
    {
        this.Code=Code;
        this.Message=Message;
        this.Data=Data;
       return this;
    }
 public Result error(int Code ,String Message,Object Data)
    {
         this.Code=Code;
        this.Message=Message;
        this.Data=Data;
       return this;
    }
}

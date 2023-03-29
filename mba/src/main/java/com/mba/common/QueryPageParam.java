package com.mba.common;

import lombok.Data;

import java.util.HashMap;

@Data
public class QueryPageParam {
    private static int Page_Size = 10;
    private static int Page_Num = 1;

    private int pageSize=Page_Size;
    private int pageNum=Page_Num;
    private HashMap param = new HashMap();
}

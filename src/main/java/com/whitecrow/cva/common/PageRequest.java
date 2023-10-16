package com.whitecrow.cva.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class PageRequest implements Serializable {

    private static final long serialVersionUID = -672122400292300782L;

    protected int pageSize=10;

    protected  int pageNum=1;
}

package com.whitecrow.cva.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户退出队伍请求体
 */
@Data
public class TeamQuitRequest implements Serializable {
    private static final long serialVersionUID = 7163909434290453045L;
    /**
     * id
     */
    private Long teamId;

}

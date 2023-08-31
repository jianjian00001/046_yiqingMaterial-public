package com.coderman.system.service;

import com.coderman.common.error.SystemException;
import com.coderman.common.model.system.Log;
import com.coderman.common.vo.system.LogVO;
import com.coderman.common.vo.system.PageVO;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

/**
 * 系统日志
 * Created by zhangyukang on 2019/11/15 17:26
 */
public interface LogService  {

    /**
     * 异步保存操作日志
     */
    @Async("CodeAsyncThreadPool")
    void saveLog(Log log);


    /**
     * 删除登入日志
     * @param id
     */
    void delete(Long id) throws SystemException;


    /**
     * 登入日志列表
     * @param pageNum
     * @param pageSize
     * @param logVO
     * @return
     */
    PageVO<LogVO> findLogList(Integer pageNum, Integer pageSize, LogVO logVO);

    /**
     * 批量删除登入日志
     * @param list
     */
    void batchDelete(List<Long> list) throws SystemException;
}

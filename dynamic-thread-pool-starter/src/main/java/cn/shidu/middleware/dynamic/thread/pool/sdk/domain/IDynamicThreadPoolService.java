package cn.shidu.middleware.dynamic.thread.pool.sdk.domain;

import cn.shidu.middleware.dynamic.thread.pool.sdk.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/*
 *@title IDynamicThreadPoolService
 *@description 动态线程池服务
 *@author 孙悟饭
 *@version 1.0
 *@create 2024/11/14 11:39
 */
public interface IDynamicThreadPoolService {
    List<ThreadPoolConfigEntity> queryThreadPoolList();

    ThreadPoolConfigEntity queryThreadPoolConfigByName(String threadPoolName);

    void updateThreadPoolConfig(ThreadPoolConfigEntity threadPoolConfigEntity);


}

package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BiaoqianleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BiaoqianleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BiaoqianleixingView;


/**
 * 标签类型
 *
 * @author 
 * @email 
 * @date 2021-04-08 20:28:00
 */
public interface BiaoqianleixingService extends IService<BiaoqianleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BiaoqianleixingVO> selectListVO(Wrapper<BiaoqianleixingEntity> wrapper);
   	
   	BiaoqianleixingVO selectVO(@Param("ew") Wrapper<BiaoqianleixingEntity> wrapper);
   	
   	List<BiaoqianleixingView> selectListView(Wrapper<BiaoqianleixingEntity> wrapper);
   	
   	BiaoqianleixingView selectView(@Param("ew") Wrapper<BiaoqianleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BiaoqianleixingEntity> wrapper);
   	
}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiticeshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiticeshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiticeshiView;


/**
 * 试题测试
 *
 * @author 
 * @email 
 * @date 2021-04-08 20:28:00
 */
public interface ShiticeshiService extends IService<ShiticeshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiticeshiVO> selectListVO(Wrapper<ShiticeshiEntity> wrapper);
   	
   	ShiticeshiVO selectVO(@Param("ew") Wrapper<ShiticeshiEntity> wrapper);
   	
   	List<ShiticeshiView> selectListView(Wrapper<ShiticeshiEntity> wrapper);
   	
   	ShiticeshiView selectView(@Param("ew") Wrapper<ShiticeshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiticeshiEntity> wrapper);
   	
}


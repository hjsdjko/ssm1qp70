package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShitixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShitixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShitixinxiView;


/**
 * 试题信息
 *
 * @author 
 * @email 
 * @date 2021-04-08 20:28:00
 */
public interface ShitixinxiService extends IService<ShitixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShitixinxiVO> selectListVO(Wrapper<ShitixinxiEntity> wrapper);
   	
   	ShitixinxiVO selectVO(@Param("ew") Wrapper<ShitixinxiEntity> wrapper);
   	
   	List<ShitixinxiView> selectListView(Wrapper<ShitixinxiEntity> wrapper);
   	
   	ShitixinxiView selectView(@Param("ew") Wrapper<ShitixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShitixinxiEntity> wrapper);
   	
}


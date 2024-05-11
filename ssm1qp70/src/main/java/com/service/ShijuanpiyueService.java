package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShijuanpiyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShijuanpiyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShijuanpiyueView;


/**
 * 试卷批阅
 *
 * @author 
 * @email 
 * @date 2021-04-08 20:28:00
 */
public interface ShijuanpiyueService extends IService<ShijuanpiyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShijuanpiyueVO> selectListVO(Wrapper<ShijuanpiyueEntity> wrapper);
   	
   	ShijuanpiyueVO selectVO(@Param("ew") Wrapper<ShijuanpiyueEntity> wrapper);
   	
   	List<ShijuanpiyueView> selectListView(Wrapper<ShijuanpiyueEntity> wrapper);
   	
   	ShijuanpiyueView selectView(@Param("ew") Wrapper<ShijuanpiyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShijuanpiyueEntity> wrapper);
   	
}


package com.dao;

import com.entity.ShijuanpiyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShijuanpiyueVO;
import com.entity.view.ShijuanpiyueView;


/**
 * 试卷批阅
 * 
 * @author 
 * @email 
 * @date 2021-04-08 20:28:00
 */
public interface ShijuanpiyueDao extends BaseMapper<ShijuanpiyueEntity> {
	
	List<ShijuanpiyueVO> selectListVO(@Param("ew") Wrapper<ShijuanpiyueEntity> wrapper);
	
	ShijuanpiyueVO selectVO(@Param("ew") Wrapper<ShijuanpiyueEntity> wrapper);
	
	List<ShijuanpiyueView> selectListView(@Param("ew") Wrapper<ShijuanpiyueEntity> wrapper);

	List<ShijuanpiyueView> selectListView(Pagination page,@Param("ew") Wrapper<ShijuanpiyueEntity> wrapper);
	
	ShijuanpiyueView selectView(@Param("ew") Wrapper<ShijuanpiyueEntity> wrapper);
	
}
